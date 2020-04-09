package mk.finki.ukim.mk.shiftgift.service;

import mk.finki.ukim.mk.shiftgift.model.Details;
import mk.finki.ukim.mk.shiftgift.model.Flowers;
import mk.finki.ukim.mk.shiftgift.model.Wrappings;

import java.util.List;

public interface FlowersService {
    List<Flowers> findAllFlowers();
    Long getById(Long id);
    List<Flowers> findAllByFamilyOrType(String family, String type);
    void updateFlower(Long id, String title, String description, String color, String size, String family, String type);
    Flowers createFlower(String title, String description, Boolean handmade, String color, String size, String family, String type, String flowerDetails);
    void deleteFlower(Long id);
}