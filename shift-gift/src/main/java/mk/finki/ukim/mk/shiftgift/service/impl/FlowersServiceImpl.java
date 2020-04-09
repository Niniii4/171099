package mk.finki.ukim.mk.shiftgift.service.impl;

import mk.finki.ukim.mk.shiftgift.model.Details;
import mk.finki.ukim.mk.shiftgift.model.Flowers;
import mk.finki.ukim.mk.shiftgift.model.Wrappings;
import mk.finki.ukim.mk.shiftgift.repository.JpaFlowersRepository;
import mk.finki.ukim.mk.shiftgift.service.FlowersService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.*;
import java.lang.*;

@Service
public class FlowersServiceImpl implements FlowersService {
    private final JpaFlowersRepository jpaFlowersRepository;

    public FlowersServiceImpl(JpaFlowersRepository jpaFlowersRepository) {
        this.jpaFlowersRepository = jpaFlowersRepository;
    }

    @Override
    public List<Flowers> findAllFlowers() {
        return this.jpaFlowersRepository.findAll();
    }

    @Override
    public Long getById(Long id) {
        return this.jpaFlowersRepository.getById(id);
    }

    @Override
    public List<Flowers> findAllByFamilyOrType(String family, String type) {
        return this.jpaFlowersRepository.findAllByFamilyOrType(family, type);
    }

    @Override
    public void updateFlower(Long id, String title, String description, String color, String size, String family, String type) {
       this.jpaFlowersRepository.updateFlower(id, title, description, color, size, family, type);
    }

    @Override
    public Flowers createFlower(String title, String description, Boolean handmade, String color, String size, String family, String type,  String flowerDetails) {
        List<Details> details = new ArrayList<>();
        String[] convert = flowerDetails.split("\\s*,\\s*");
        for (String n : convert){
            Details d = new Details();
            d.setName(n);
            details.add(d);
        }
        Flowers f = new Flowers(title, description, handmade, color, size, family, type, details);
        return this.jpaFlowersRepository.save(f);
    }

    @Override
    public void deleteFlower(Long id) {
        this.jpaFlowersRepository.deleteById(id);
    }
}