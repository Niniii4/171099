package mk.finki.ukim.mk.shiftgift.web;

import mk.finki.ukim.mk.shiftgift.model.Flowers;
import mk.finki.ukim.mk.shiftgift.model.Orders;
import mk.finki.ukim.mk.shiftgift.model.Ornaments;
import mk.finki.ukim.mk.shiftgift.model.Wrappings;
import mk.finki.ukim.mk.shiftgift.service.OrdersService;
import org.springframework.http.HttpStatus;
import org.springframework.util.MimeTypeUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping(path = "/orders", produces = MimeTypeUtils.APPLICATION_JSON_VALUE)
public class OrdersRestController {
    private final OrdersService ordersService;

    public OrdersRestController(OrdersService ordersService) {
        this.ordersService = ordersService;
    }

    @GetMapping("/{id}")
    public Long findOrdersById(@PathVariable Long id){
        return ordersService.findOrdersById(id);
    }

    @GetMapping(params = "name, surname")
    public List<Orders> findByNameOrSurname(@RequestParam String name, @RequestParam String surname){
        return ordersService.findByNameOrSurname(name, surname);
    }

    @DeleteMapping("/{id}")
    public void deleteOrder(@PathVariable Long id){
        ordersService.deleteOrder(id);
    }

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public Orders createOrder(@RequestHeader Long id,
                              @RequestParam (value = "name") String name,
                              @RequestParam (value = "surname") String surname,
                              @RequestParam (value = "email", required = false) String email,
                              @RequestParam (value = "address") String address,
                              @RequestParam (value = "phone") Long phone,
                              @RequestParam (value = "numOrders", required = false) Long numOrders,
                              @RequestParam (value = "flowersOrdered", required = false) Flowers flowersOrdered,
                              @RequestParam (value = "wrappingsOrdered", required = false) Wrappings wrappingsOrdered,
                              @RequestParam (value = "ornamentsOrdered", required = false) Ornaments ornamentsOrdered,
                              HttpServletResponse response,
                              UriComponentsBuilder builder){
        Orders order = ordersService.createOrder(id, name, surname, email, address, phone, numOrders, flowersOrdered, wrappingsOrdered, ornamentsOrdered);
        response.setHeader("Orders", builder.path("/orders/create/{id}").buildAndExpand(order.getId()).toUriString());
        return order;
    }
}
