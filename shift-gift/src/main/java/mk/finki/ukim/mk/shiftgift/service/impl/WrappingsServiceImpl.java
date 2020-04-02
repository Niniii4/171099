package mk.finki.ukim.mk.shiftgift.service.impl;

import mk.finki.ukim.mk.shiftgift.model.Details;
import mk.finki.ukim.mk.shiftgift.model.Wrappings;
import mk.finki.ukim.mk.shiftgift.repository.JpaWrappingsRepository;
import mk.finki.ukim.mk.shiftgift.service.WrappingsService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WrappingsServiceImpl implements WrappingsService {
    private final JpaWrappingsRepository jpaWrappingsRepository;

    public WrappingsServiceImpl(JpaWrappingsRepository jpaWrappingsRepository) {
        this.jpaWrappingsRepository = jpaWrappingsRepository;
    }

    @Override
    public Long findWrappingsById(Long id) {
        return this.jpaWrappingsRepository.findWrappingsById(id);
    }

    @Override
    public List<Wrappings> findAllByShape(String shape) {
        return this.jpaWrappingsRepository.findAllByShape(shape);
    }

    @Override
    public void updateWrapping(Long id, String title, String description, Boolean handmade, String color, String size, String shape, String fabric) {
        this.jpaWrappingsRepository.updateWrapping(id, title, description, handmade, color, size, shape, fabric);
    }

    @Override
    public Wrappings createWrapping(Long id, String title, String description, Boolean handmade, String color, String size, String fabric, String shape, List<Details> wrappingDetails) {
        Wrappings w = new Wrappings(id, title, description, handmade, color, size, fabric, shape, wrappingDetails);
        return this.jpaWrappingsRepository.save(w);
    }

    @Override
    public void deleteWrapping(Long id) {
        this.jpaWrappingsRepository.deleteById(id);
    }
}