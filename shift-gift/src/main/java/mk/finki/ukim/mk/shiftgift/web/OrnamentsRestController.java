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

    @GetMapping("/{id}")
    public Long findOrnamentsById(@PathVariable Long id) {
        return this.ornamentsService.findOrnamentsById(id);
    }

    @PatchMapping("/{id}")
    public void updateOrnament(@PathVariable Long id,
                        @RequestParam(value = "title") String title,
                        @RequestParam(value = "description", required = false) String description,
                        @RequestParam(value = "handmade", required = false) Boolean handmade,
                        @RequestParam(value = "color", required = false) String color,
                        @RequestParam(value = "size", required = false) String size,
                        @RequestParam(value = "breakable") String breakable,
                        @RequestParam(value = "material") String material,
                        @RequestParam(value = "ornamentWrap", required = false) Wrappings ornamentWrap) {
        this.ornamentsService.updateOrnament(id, title, description, handmade, color, size, breakable, material, ornamentWrap);
    }
    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public Ornaments createOrnament(@RequestHeader Long id,  @RequestParam (value = "title") String title,
                                    @RequestParam (value = "description") String description,
                                    @RequestParam (value = "handmade", required = false) Boolean handmade,
                                    @RequestParam (value = "color", required = false) String color,
                                    @RequestParam (value = "size", required = false) String size,
                                    @RequestParam (value = "breakable", required = false) String breakable,
                                    @RequestParam (value = "material") String material,
                                    @RequestParam (value = "ornamentWrap", required = false) Wrappings ornamentWrap,
                                    HttpServletResponse response,
                                    UriComponentsBuilder builder){
        Ornaments ornament = ornamentsService.createOrnament(id, title, description, handmade, color, size, breakable, material, ornamentWrap);
        response.setHeader("Ornaments", builder.path("/ornaments/create/{id}").buildAndExpand(ornament.getId()).toUriString());
        return ornament;
    }

    @DeleteMapping("/{id}")
    public void deleteOrnament(@PathVariable Long id){
        this.ornamentsService.deleteOrnament(id);
    }

    @GetMapping(params = "title")
    public List<Ornaments> getAllByTitle(@RequestParam String title){
        return this.ornamentsService.getAllByTitle(title);
    }
}