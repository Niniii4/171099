package mk.finki.ukim.mk.shiftgift.service;

import mk.finki.ukim.mk.shiftgift.model.Details;

import java.util.List;

public interface DetailsService {
    List<Details> findAllDetails();
    List<Details> findByName(String name);
    List<Details> findAllByName(String name);
    void updateDetail(String name, String size, String color, Integer quantity);
    Details createDetail(String name, String size, String color, Integer quantity);
    void deleteByName(String name);
}