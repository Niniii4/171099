package mk.finki.ukim.mk.shiftgift.service.impl;

import mk.finki.ukim.mk.shiftgift.model.*;
import mk.finki.ukim.mk.shiftgift.repository.JpaGiftsRepository;
import mk.finki.ukim.mk.shiftgift.repository.JpaOrdersRepository;
import mk.finki.ukim.mk.shiftgift.service.OrdersService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdersServiceImpl implements OrdersService{
    private final JpaOrdersRepository jpaOrdersRepository;
    private final JpaGiftsRepository jpaGiftsRepository;

    public OrdersServiceImpl(JpaOrdersRepository jpaOrdersRepository, JpaGiftsRepository jpaGiftsRepository) {
        this.jpaOrdersRepository = jpaOrdersRepository;
        this.jpaGiftsRepository = jpaGiftsRepository;
    }

    @Override
    public List<Orders> findAllOrders() {
        return this.jpaOrdersRepository.findAll();
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
    public Orders createOrder(String name, String surname, String email, String address, Long phone, Long numOrders, Long orderGifts) {
        Orders o = new Orders(name, surname, email, address, phone, numOrders, jpaGiftsRepository.findGiftsById(orderGifts));
        return this.jpaOrdersRepository.save(o);
    }
}