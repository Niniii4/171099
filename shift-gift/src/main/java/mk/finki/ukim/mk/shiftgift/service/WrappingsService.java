package mk.finki.ukim.mk.shiftgift.service;
import mk.finki.ukim.mk.shiftgift.model.Details;
import mk.finki.ukim.mk.shiftgift.model.Wrappings;
import java.util.List;

public interface WrappingsService {
    Long findWrappingsById(Long id);
    List<Wrappings> findAllByShape(String shape);
    void updateWrapping(Long id, String title, String description, Boolean handmade, String color, String size, String shape, String fabric);
    Wrappings createWrapping(Long id, String title, String description, Boolean handmade, String color, String size, String fabric, String shape, List<Details> wrappingDetails);
    void deleteWrapping(Long id);
}