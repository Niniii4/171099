package mk.finki.ukim.mk.shiftgift.service;
import mk.finki.ukim.mk.shiftgift.model.Gifts;
import java.util.List;

public interface GiftsService {
    List<Gifts> getAllGifts(Long id);
    List<Gifts> findAllByTitle(String title);
}
