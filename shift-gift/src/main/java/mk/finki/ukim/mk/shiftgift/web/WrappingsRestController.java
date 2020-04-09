package mk.finki.ukim.mk.shiftgift.web;

import mk.finki.ukim.mk.shiftgift.model.Details;
import mk.finki.ukim.mk.shiftgift.model.Ornaments;
import mk.finki.ukim.mk.shiftgift.model.Wrappings;
import mk.finki.ukim.mk.shiftgift.service.WrappingsService;
import org.springframework.http.HttpStatus;
import org.springframework.util.MimeTypeUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping(path = "/wrappings", produces = MimeTypeUtils.APPLICATION_JSON_VALUE)
public class WrappingsRestController {
    private final WrappingsService wrappingsService;

    public WrappingsRestController(WrappingsService wrappingsService) {
        this.wrappingsService = wrappingsService;
    }

    @GetMapping
    public List<Wrappings> getAllWrappings() {
        return this.wrappingsService.findAllWrappings();
    }

    @GetMapping("/{id}")
    public Long getById(@PathVariable Long id){
        return this.wrappingsService.getById(id);
    }

    @GetMapping(params = "shape")
    public List<Wrappings> findAllByShape(@RequestParam String shape){
        return this.wrappingsService.findAllByShape(shape);
    }

    @PatchMapping("/update/{id}")
    public void updateWrapping(@PathVariable Long id,
                        @RequestParam(value = "title") String title,
                        @RequestParam(value = "description") String description,
                        @RequestParam(value = "color") String color,
                        @RequestParam(value = "size") String size,
                        @RequestParam (value = "fabric") String fabric,
                        @RequestParam (value = "shape") String shape){
        this.wrappingsService.updateWrapping(id, title, description, color, size, fabric, shape);
    }

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public Wrappings createWrapping(
                                    @RequestParam (value = "title") String title,
                             @RequestParam (value = "description") String description,
                             @RequestParam (value = "handmade") Boolean handmade,
                             @RequestParam (value = "color") String color,
                             @RequestParam (value = "size") String size,
                             @RequestParam (value = "fabric") String fabric,
                             @RequestParam (value = "shape") String shape,
                             @RequestParam (value = "wrappingDetails", required = false) String wrappingDetails,
                             HttpServletResponse response,
                             UriComponentsBuilder builder){
        Wrappings wrap = wrappingsService.createWrapping(title, description, handmade, color, size, fabric, shape, wrappingDetails);
        response.setHeader("Ornaments", builder.path("/wrappings/create/{id}").buildAndExpand(wrap.getId()).toUriString());
        return wrap;
    }

    @DeleteMapping("/delete/{id}")
    public void deleteWrapping(@PathVariable Long id){
        this.wrappingsService.deleteWrapping(id);
    }
}
