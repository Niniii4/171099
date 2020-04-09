package mk.finki.ukim.mk.shiftgift.service.impl;

import mk.finki.ukim.mk.shiftgift.model.Details;
import mk.finki.ukim.mk.shiftgift.model.Wrappings;
import mk.finki.ukim.mk.shiftgift.repository.JpaWrappingsRepository;
import mk.finki.ukim.mk.shiftgift.service.WrappingsService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class WrappingsServiceImpl implements WrappingsService {
    private final JpaWrappingsRepository jpaWrappingsRepository;

    public WrappingsServiceImpl(JpaWrappingsRepository jpaWrappingsRepository) {
        this.jpaWrappingsRepository = jpaWrappingsRepository;
    }

    @Override
    public List<Wrappings> findAllWrappings() {
        return this.jpaWrappingsRepository.findAll();
    }

    @Override
    public Long getById(Long id) {
        return this.jpaWrappingsRepository.getById(id);
    }

    @Override
    public List<Wrappings> findAllByShape(String shape) {
        return this.jpaWrappingsRepository.findAllByShape(shape);
    }

    @Override
    public void updateWrapping(Long id, String title, String description, String color, String size, String fabric, String shape) {
        this.jpaWrappingsRepository.updateWrapping(id, title, description, color, size, fabric, shape);
    }

    @Override
    public Wrappings createWrapping(String title, String description, Boolean handmade, String color, String size, String fabric, String shape, String wrappingDetails) {
        List<Details> details = new ArrayList<>();
        String[] convert = wrappingDetails.split("\\s*,\\s*");
        for (String n : convert){
            Details d = new Details();
            d.setName(n);
            details.add(d);
        }
        Wrappings w = new Wrappings(title, description, handmade, color, size, fabric, shape, details);
        return this.jpaWrappingsRepository.save(w);
    }

    @Override
    public void deleteWrapping(Long id) {
        this.jpaWrappingsRepository.deleteById(id);
    }
}