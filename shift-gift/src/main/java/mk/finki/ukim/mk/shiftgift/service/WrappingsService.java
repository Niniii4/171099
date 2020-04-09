package mk.finki.ukim.mk.shiftgift.service;
import mk.finki.ukim.mk.shiftgift.model.Details;
import mk.finki.ukim.mk.shiftgift.model.Wrappings;
import java.util.List;

public interface WrappingsService {
    List<Wrappings> findAllWrappings();
    Long getById(Long id);
    List<Wrappings> findAllByShape(String shape);
    void updateWrapping(Long id, String title, String description, String color, String size, String fabric, String shape);
    Wrappings createWrapping(String title, String description, Boolean handmade, String color, String size, String fabric, String shape, String wrappingDetails);
    void deleteWrapping(Long id);
}