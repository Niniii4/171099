package mk.finki.ukim.mk.shiftgift.service.impl;

import mk.finki.ukim.mk.shiftgift.model.Gifts;
import mk.finki.ukim.mk.shiftgift.model.Orders;
import mk.finki.ukim.mk.shiftgift.repository.JpaGiftsRepository;
import mk.finki.ukim.mk.shiftgift.service.GiftsService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class GiftsServiceImpl implements GiftsService {
    private final JpaGiftsRepository jpaGiftsRepository;

    public GiftsServiceImpl(JpaGiftsRepository jpaGiftsRepository) {
        this.jpaGiftsRepository = jpaGiftsRepository;
    }
    @Override
    public List<Gifts> getAllGifts(Long id) {
        return this.jpaGiftsRepository.findAllById(id);
    }

    @Override
    public List<Gifts> findAllByTitle(String title) {
        return this.jpaGiftsRepository.findAllByTitle(title);
    }
}
