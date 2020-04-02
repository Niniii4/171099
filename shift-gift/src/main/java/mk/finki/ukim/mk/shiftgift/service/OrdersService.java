package mk.finki.ukim.mk.shiftgift.service;

import mk.finki.ukim.mk.shiftgift.model.Flowers;
import mk.finki.ukim.mk.shiftgift.model.Orders;
import mk.finki.ukim.mk.shiftgift.model.Ornaments;
import mk.finki.ukim.mk.shiftgift.model.Wrappings;

import java.util.List;

public interface OrdersService {
    Long findOrdersById(Long id);
    List<Orders> findByNameOrSurname(String name, String surname);
    void deleteOrder(Long id);
    Orders createOrder(Long id, String name, String surname, String email, String address, Long phone, Long numOrders, Flowers flowersOrdered, Wrappings wrappingsOrdered, Ornaments ornamentsOrdered);
}