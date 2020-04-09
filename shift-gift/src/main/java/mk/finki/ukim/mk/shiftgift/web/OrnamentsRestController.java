package mk.finki.ukim.mk.shiftgift.web;
import mk.finki.ukim.mk.shiftgift.model.Ornaments;
import mk.finki.ukim.mk.shiftgift.model.Wrappings;
import mk.finki.ukim.mk.shiftgift.service.OrnamentsService;
import org.springframework.http.HttpStatus;
import org.springframework.util.MimeTypeUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping(path = "/ornaments", produces = MimeTypeUtils.APPLICATION_JSON_VALUE)
public class OrnamentsRestController {
    private final OrnamentsService ornamentsService;

    public OrnamentsRestController(OrnamentsService ornamentsService) {
        this.ornamentsService = ornamentsService;
    }

    @GetMapping
    public List<Ornaments> getAllOrnaments() {
        return this.ornamentsService.findAllOrnaments();
    }

    @GetMapping("/{id}")
    public Long findOrnamentsById(@PathVariable Long id) {
        return this.ornamentsService.findOrnamentsById(id);
    }

    @PatchMapping("/update/{id}")
    public void updateOrnament(@PathVariable Long id,
                        @RequestParam(value = "title") String title,
                        @RequestParam(value = "description") String description,
                        @RequestParam(value = "color") String color,
                        @RequestParam(value = "size") String size,
                        @RequestParam(value = "breakable") String breakable,
                        @RequestParam(value = "material") String material){
           this.ornamentsService.updateOrnament(id, title, description, color, size, breakable, material);
    }
    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public Ornaments createOrnament(@RequestParam (value = "title") String title,
                                    @RequestParam (value = "description") String description,
                                    @RequestParam (value = "handmade") Boolean handmade,
                                    @RequestParam (value = "color") String color,
                                    @RequestParam (value = "size") String size,
                                    @RequestParam (value = "breakable", required = false) String breakable,
                                    @RequestParam (value = "material") String material,
                                    HttpServletResponse response,
                                    UriComponentsBuilder builder){
        Ornaments ornament = ornamentsService.createOrnament(title, description, handmade, color, size, breakable, material);
        response.setHeader("Ornaments", builder.path("/ornaments/create/{id}").buildAndExpand(ornament.getId()).toUriString());
        return ornament;
    }

    @DeleteMapping("/delete/{id}")
    public void deleteOrnament(@PathVariable Long id){
        this.ornamentsService.deleteOrnament(id);
    }

    @GetMapping(params = "title")
    public List<Ornaments> getAllByTitle(@RequestParam String title){
        return this.ornamentsService.getAllByTitle(title);
    }
}