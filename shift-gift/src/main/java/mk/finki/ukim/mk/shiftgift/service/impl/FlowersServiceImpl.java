package mk.finki.ukim.mk.shiftgift.service.impl;

import mk.finki.ukim.mk.shiftgift.model.Details;
import mk.finki.ukim.mk.shiftgift.model.Flowers;
import mk.finki.ukim.mk.shiftgift.model.Wrappings;
import mk.finki.ukim.mk.shiftgift.repository.JpaFlowersRepository;
import mk.finki.ukim.mk.shiftgift.service.FlowersService;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class FlowersServiceImpl implements FlowersService {
    private final JpaFlowersRepository jpaFlowersRepository;

    public FlowersServiceImpl(JpaFlowersRepository jpaFlowersRepository) {
        this.jpaFlowersRepository = jpaFlowersRepository;
    }

    @Override
    public List<Flowers> getAllFlowers(Long id) {
        return this.jpaFlowersRepository.findAll();
    }

    @Override
    public Long findFlowersById(Long id) {
        return this.jpaFlowersRepository.findFlowersById(id);
    }

    @Override
    public List<Flowers> findAllByFamilyOrType(String family, String type) {
        return this.jpaFlowersRepository.findAllByFamilyOrType(family, type);
    }

    @Override
    public void updateFlower(Long id, String title, String description, Boolean handmade, String color, String size, String family, String type, Wrappings flowerWrap) {
       this.jpaFlowersRepository.updateFlower(id, title, description, handmade, color, size, family, type, flowerWrap.getId());
    }

    @Override
    public Flowers createFlower(Long id, String title, String description, Boolean handmade, String color, String size, String family, String type, Wrappings flowerWrap, List<Details> flowerDetails) {
        Flowers f = new Flowers(id, title, description, handmade, color, size, family, type, flowerWrap, flowerDetails);
        return this.jpaFlowersRepository.save(f);
    }

    @Override
    public void deleteFlower(Long id) {
        this.jpaFlowersRepository.deleteById(id);
    }
}