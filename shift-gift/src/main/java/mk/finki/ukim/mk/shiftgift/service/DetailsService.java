package mk.finki.ukim.mk.shiftgift.service;

import mk.finki.ukim.mk.shiftgift.model.Details;

import java.util.List;

public interface DetailsService {
    Long findDetailsById(Long id);
    List<Details> findAllByName(String name);
    void updateDetail(Long id, String name, String size, String color, Integer quantity);
    Details createDetail(Long id, String name, String size, String color, Integer quantity);
    void deleteDetail(Long id);
}