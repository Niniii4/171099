package mk.finki.ukim.mk.shiftgift.web;

import mk.finki.ukim.mk.shiftgift.model.Gifts;
import mk.finki.ukim.mk.shiftgift.service.GiftsService;
import org.springframework.util.MimeTypeUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping(path = "/", produces = MimeTypeUtils.APPLICATION_JSON_VALUE)
public class GiftsRestController {
    private final GiftsService giftsService;

    public GiftsRestController(GiftsService giftsService) {
        this.giftsService = giftsService;
    }

    @GetMapping
    public List<Gifts> getAllGifts(Long id){
        return giftsService.getAllGifts(id);
    }

    @GetMapping(params = "title")
    public List<Gifts> findAllByTitle(@RequestParam String title){
        return giftsService.findAllByTitle(title);
    }

}
