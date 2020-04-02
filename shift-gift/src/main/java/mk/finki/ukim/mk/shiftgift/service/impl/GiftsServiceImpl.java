package mk.finki.ukim.mk.shiftgift.service.impl;

import mk.finki.ukim.mk.shiftgift.model.Gifts;
import mk.finki.ukim.mk.shiftgift.repository.JpaGiftsRepository;
import mk.finki.ukim.mk.shiftgift.service.GiftsService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GiftsServiceImpl implements GiftsService {
    private final JpaGiftsRepository jpaGiftsRepository;

    public GiftsServiceImpl(JpaGiftsRepository jpaGiftsRepository) {
        this.jpaGiftsRepository = jpaGiftsRepository;
    }

//    @Override
//    public Gifts createGift(Long id, String title, String color, String size, String description, Boolean handmade) {
//        Gifts g = new Gifts(id, title, description, handmade, color, size);
//        return this.jpaGiftsRepository.save(g);
//    }
    @Override
    public List<Gifts> getAllGifts(Long id) {
        return this.jpaGiftsRepository.findAllById(id);
    }

    @Override
    public List<Gifts> findAllByTitle(String title) {
        return this.jpaGiftsRepository.findAllByTitle(title);
    }

//    @Override
//    public void deleteGift(Integer id) {
//        this.jpaGiftsRepository.deleteById(id);
//    }
}
