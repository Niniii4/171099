package mk.finki.ukim.mk.shiftgift.service.impl;

import mk.finki.ukim.mk.shiftgift.model.Flowers;
import mk.finki.ukim.mk.shiftgift.model.Orders;
import mk.finki.ukim.mk.shiftgift.model.Ornaments;
import mk.finki.ukim.mk.shiftgift.model.Wrappings;
import mk.finki.ukim.mk.shiftgift.repository.JpaOrdersRepository;
import mk.finki.ukim.mk.shiftgift.service.OrdersService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdersServiceImpl implements OrdersService{
    private final JpaOrdersRepository jpaOrdersRepository;

    public OrdersServiceImpl(JpaOrdersRepository jpaOrdersRepository) {
        this.jpaOrdersRepository = jpaOrdersRepository;
    }

    @Override
    public Long findOrdersById(Long id) {
        return this.jpaOrdersRepository.findOrdersById(id);
    }

    @Override
    public List<Orders> findByNameOrSurname(String name, String surname) {
        return this.jpaOrdersRepository.findByNameOrSurname(name, surname);
    }

    @Override
    public void deleteOrder(Long id) {
        this.jpaOrdersRepository.deleteById(id);
    }

    @Override
    public Orders createOrder(Long id, String name, String surname, String email, String address, Long phone, Long numOrders, Flowers flowersOrdered, Wrappings wrappingsOrdered, Ornaments ornamentsOrdered) {
        Orders o = new Orders(id, name, surname, email, address, phone, numOrders, flowersOrdered, wrappingsOrdered, ornamentsOrdered);
        return this.jpaOrdersRepository.save(o);
    }
}