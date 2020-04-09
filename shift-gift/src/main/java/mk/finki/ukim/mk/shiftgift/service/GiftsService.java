package mk.finki.ukim.mk.shiftgift.service;
import mk.finki.ukim.mk.shiftgift.model.Gifts;
import mk.finki.ukim.mk.shiftgift.model.Orders;

import java.util.List;
import java.util.Set;

public interface GiftsService {
    List<Gifts> getAllGifts(Long id);
    List<Gifts> findAllByTitle(String title);
}
