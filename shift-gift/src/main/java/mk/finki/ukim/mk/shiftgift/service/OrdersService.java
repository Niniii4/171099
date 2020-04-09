package mk.finki.ukim.mk.shiftgift.service;

import mk.finki.ukim.mk.shiftgift.model.*;

import java.util.List;

public interface OrdersService {
    List<Orders> findAllOrders();
    Long findOrdersById(Long id);
    List<Orders> findByNameOrSurname(String name, String surname);
    void deleteOrder(Long id);
    Orders createOrder(String name, String surname, String email, String address, Long phone, Long numOrders, Gifts orderGifts);

}