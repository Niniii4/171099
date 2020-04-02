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

    @GetMapping("/{id}")
    public Long findFlowersById(@PathVariable Long id){
        return this.flowersService.findFlowersById(id);
    }

    @GetMapping(params = "family, type")
    public List<Flowers> findAllByFamilyOrType(@RequestParam String family, @RequestParam String type){
        return this.flowersService.findAllByFamilyOrType(family, type);
    }
    @PatchMapping("/update/{id}")
    public void updateFlower(@PathVariable Long id,
                             @RequestParam (value = "title") String title,
                             @RequestParam (value = "description", required = false) String description,
                             @RequestParam (value = "handmade", required = false) Boolean handmade,
                             @RequestParam (value = "color", required = false) String color,
                             @RequestParam (value = "size", required = false) String size,
                             @RequestParam (value = "family", required = false) String family,
                             @RequestParam (value = "type") String type,
                             @RequestParam (value = "flowerWrap", required = false) Wrappings flowerWrap){
        this.flowersService.updateFlower(id, title, description, handmade, color, size, family, type, flowerWrap);
    }

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public Flowers createFlower(@RequestHeader Long id,
                         @RequestParam (value = "title") String title,
                         @RequestParam (value = "description") String description,
                         @RequestParam (value = "handmade", required = false) Boolean handmade,
                         @RequestParam (value = "color", required = false) String color,
                         @RequestParam (value = "size", required = false) String size,
                         @RequestParam (value = "family", required = false) String family,
                         @RequestParam (value = "type") String type,
                         @RequestParam (value = "flowerWrap", required = false) Wrappings flowerWrap,
                         @RequestParam (value = "flowerDetails", required = false) List<Details> flowerDetails,
                         HttpServletResponse response,
                         UriComponentsBuilder builder){
        Flowers flower = flowersService.createFlower(id, title, description, handmade, color, size, family, type, flowerWrap, flowerDetails);
        response.setHeader("Flowers", builder.path("/flowers/create/{id}").buildAndExpand(flower.getId()).toUriString());
        return flower;
    }

    @DeleteMapping("/{id}")
    public void deleteFlower(@PathVariable Long id){
        flowersService.deleteFlower(id);
    }
}
