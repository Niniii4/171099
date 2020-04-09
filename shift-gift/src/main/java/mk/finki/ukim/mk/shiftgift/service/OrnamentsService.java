package mk.finki.ukim.mk.shiftgift.service;

import mk.finki.ukim.mk.shiftgift.model.Ornaments;
import mk.finki.ukim.mk.shiftgift.model.Wrappings;

import java.util.List;

public interface OrnamentsService {
    List<Ornaments> findAllOrnaments();
    Long findOrnamentsById(Long id);
    void updateOrnament(Long id, String title, String description, String color, String size, String breakable, String material);
    Ornaments createOrnament(String title, String description, Boolean handmade, String color, String size, String breakable, String material);
    void deleteOrnament(Long id);
    List<Ornaments> getAllByTitle(String title);
}
