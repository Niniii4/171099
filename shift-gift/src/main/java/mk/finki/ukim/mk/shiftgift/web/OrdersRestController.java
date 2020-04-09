package mk.finki.ukim.mk.shiftgift.web;

import mk.finki.ukim.mk.shiftgift.model.*;
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

    @GetMapping
    public List<Orders> getAllOrders() {
        return this.ordersService.findAllOrders();
    }


    @GetMapping("/{id}")
    public Long findOrdersById(@PathVariable Long id){
        return ordersService.findOrdersById(id);
    }

    @GetMapping(params = "name, surname")
    public List<Orders> findByNameOrSurname(@RequestParam String name, @RequestParam String surname){
        return ordersService.findByNameOrSurname(name, surname);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteOrder(@PathVariable Long id){
        ordersService.deleteOrder(id);
    }

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public Orders createOrder(
                              @RequestParam (value = "name", required = false) String name,
                              @RequestParam (value = "surname", required = false) String surname,
                              @RequestParam (value = "email", required = false) String email,
                              @RequestParam (value = "address", required = false) String address,
                              @RequestParam (value = "phone", required = false) Long phone,
                              @RequestParam (value = "numOrders", required = false) Long numOrders,
                              @RequestParam (value = "orderGifts", required = false) Gifts orderGifts,
                              HttpServletResponse response,
                              UriComponentsBuilder builder){
        Orders order = ordersService.createOrder(name, surname, email, address, phone, numOrders, orderGifts);
        response.setHeader("Orders", builder.path("/orders/create/{id}").buildAndExpand(order.getId()).toUriString());
        return order;
    }

//    @PatchMapping("/addGift/{orderGifts}")
//    public void addGift(@PathVariable Gifts orderGifts){
//        this.ordersService.addGift(orderGifts);
//    }
}
