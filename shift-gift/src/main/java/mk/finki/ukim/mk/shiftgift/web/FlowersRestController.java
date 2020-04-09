package mk.finki.ukim.mk.shiftgift.web;
import mk.finki.ukim.mk.shiftgift.model.Details;
import mk.finki.ukim.mk.shiftgift.model.Flowers;
import mk.finki.ukim.mk.shiftgift.model.Wrappings;
import mk.finki.ukim.mk.shiftgift.service.FlowersService;
import org.springframework.http.HttpStatus;
import org.springframework.util.MimeTypeUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping(path = "/flowers", produces = MimeTypeUtils.APPLICATION_JSON_VALUE)
public class FlowersRestController {
    private final FlowersService flowersService;

    public FlowersRestController(FlowersService flowersService) {
        this.flowersService = flowersService;
    }

    @GetMapping
    public List<Flowers> getAllFlowers() {
        return this.flowersService.findAllFlowers();
    }

    @GetMapping("/{id}")
    public Long getById(@PathVariable Long id){
        return this.flowersService.getById(id);
    }

    @GetMapping(params = "family, type")
    public List<Flowers> findAllByFamilyOrType(@RequestParam String family, @RequestParam String type){
        return this.flowersService.findAllByFamilyOrType(family, type);
    }
    @PatchMapping("/update/{id}")
    public void updateFlower(@PathVariable Long id,
                             @RequestParam (value = "title") String title,
                             @RequestParam (value = "description") String description,
                             @RequestParam (value = "color") String color,
                             @RequestParam (value = "size") String size,
                             @RequestParam (value = "family") String family,
                             @RequestParam (value = "type") String type){
        this.flowersService.updateFlower(id, title, description, color, size, family, type);
    }

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public Flowers createFlower(
                         @RequestParam (value = "title") String title,
                         @RequestParam (value = "description") String description,
                         @RequestParam (value = "handmade") Boolean handmade,
                         @RequestParam (value = "color") String color,
                         @RequestParam (value = "size") String size,
                         @RequestParam (value = "family") String family,
                         @RequestParam (value = "type") String type,
                         @RequestParam (value = "flowerDetails", required = false) String flowerDetails,
                         HttpServletResponse response,
                         UriComponentsBuilder builder){
        Flowers flower = flowersService.createFlower(title, description, handmade, color, size, family, type, flowerDetails);
        response.setHeader("Flowers", builder.path("/flowers/create/{id}").buildAndExpand(flower.getId()).toUriString());
        return flower;
    }

    @DeleteMapping("/delete/{id}")
    public void deleteFlower(@PathVariable Long id){
        flowersService.deleteFlower(id);
    }
}
