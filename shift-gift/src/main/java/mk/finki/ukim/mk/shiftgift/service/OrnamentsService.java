package mk.finki.ukim.mk.shiftgift.service;

import mk.finki.ukim.mk.shiftgift.model.Ornaments;
import mk.finki.ukim.mk.shiftgift.model.Wrappings;

import java.util.List;

public interface OrnamentsService {
    Long findOrnamentsById(Long id);
    void updateOrnament(Long id, String title, String description, Boolean handmade, String color, String size, String breakable, String material, Wrappings ornamentWrap);
    Ornaments createOrnament(Long id, String title, String description, Boolean handmade, String color, String size, String breakable, String material, Wrappings ornamentWrap);
    void deleteOrnament(Long id);
    List<Ornaments> getAllByTitle(String title);
}
