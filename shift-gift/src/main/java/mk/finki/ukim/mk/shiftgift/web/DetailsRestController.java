package mk.finki.ukim.mk.shiftgift.web;
import mk.finki.ukim.mk.shiftgift.model.Details;
import mk.finki.ukim.mk.shiftgift.service.DetailsService;
import org.springframework.http.HttpStatus;
import org.springframework.util.MimeTypeUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping(path = "/details", produces = MimeTypeUtils.APPLICATION_JSON_VALUE)
public class DetailsRestController {
    private final DetailsService detailsService;

    public DetailsRestController(DetailsService detailsService) {
        this.detailsService = detailsService;
    }

    @GetMapping
    public List<Details> findAllDetails(){return this.detailsService.findAllDetails();}

    @GetMapping("/{name}")
    public List<Details> findByName(@PathVariable String name){
        return this.detailsService.findByName(name);
    }

    @GetMapping(params = "name")
    public List<Details> findAllByName(@RequestParam String name){
        return this.detailsService.findAllByName(name);
    }

    @PatchMapping("/update/{name}")
    public void updateDetail(
                             @PathVariable(value = "name", required = false) String name,
                             @RequestParam(value = "size", required = false) String size,
                             @RequestParam(value = "color", required = false) String color,
                             @RequestParam(value = "quantity", required = false) Integer quantity){
        this.detailsService.updateDetail(name, size, color, quantity);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Details createDetail(
                         @RequestParam(value = "name") String name,
                         @RequestParam(value = "size") String size,
                         @RequestParam(value = "color") String color,
                         @RequestParam(value = "quantity") Integer quantity,
                         HttpServletResponse response,
                         UriComponentsBuilder builder) {
        Details detail = detailsService.createDetail(name, size, color, quantity);
        response.setHeader("Detail", builder.path("/details/create/{name}").buildAndExpand(detail.getName()).toUriString());
        return detail;
    }


    @DeleteMapping("/{name}")
    public void deleteDetail(@PathVariable String name){
        this.detailsService.deleteByName(name);
    }
}
