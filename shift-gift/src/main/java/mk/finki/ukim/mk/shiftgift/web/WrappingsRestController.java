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

    @GetMapping("/{id}")
    public Long findWrappingsById(@PathVariable Long id){
        return this.wrappingsService.findWrappingsById(id);
    }
    @GetMapping(params = "shape")
    public List<Wrappings> findAllByShape(@RequestParam String shape){
        return this.wrappingsService.findAllByShape(shape);
    }

    @PatchMapping("/{id}")
    public void updateWrapping(@PathVariable Long id,
                        @RequestParam(value = "title") String title,
                        @RequestParam(value = "description", required = false) String description,
                        @RequestParam(value = "handmade", required = false) Boolean handmade,
                        @RequestParam(value = "color", required = false) String color,
                        @RequestParam(value = "size", required = false) String size,
                        @RequestParam (value = "fabric") String fabric,
                        @RequestParam (value = "shape") String shape){
        this.wrappingsService.updateWrapping(id, title, description, handmade, color, size, fabric, shape);
    }

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public Wrappings createWrapping(@RequestHeader Long id,  @RequestParam (value = "title") String title,
                             @RequestParam (value = "description") String description,
                             @RequestParam (value = "handmade", required = false) Boolean handmade,
                             @RequestParam (value = "color", required = false) String color,
                             @RequestParam (value = "size", required = false) String size,
                             @RequestParam (value = "fabric") String fabric,
                             @RequestParam (value = "shape") String shape,
                             @RequestParam (value = "wrappingDetails", required = false) List<Details> wrappingDetails,
                             HttpServletResponse response,
                             UriComponentsBuilder builder){
        Wrappings wrap = wrappingsService.createWrapping(id, title, description, handmade, color, size, fabric, shape, wrappingDetails);
        response.setHeader("Ornaments", builder.path("/wrappings/create/{id}").buildAndExpand(wrap.getId()).toUriString());
        return wrap;
    }

    @DeleteMapping("/{id}")
    public void deleteWrapping(@PathVariable Long id){
        this.wrappingsService.deleteWrapping(id);
    }
}
