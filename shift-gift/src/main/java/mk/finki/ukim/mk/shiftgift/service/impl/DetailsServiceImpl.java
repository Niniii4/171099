package mk.finki.ukim.mk.shiftgift.service.impl;

import mk.finki.ukim.mk.shiftgift.model.Details;
import mk.finki.ukim.mk.shiftgift.repository.JpaDetailsRepository;
import mk.finki.ukim.mk.shiftgift.service.DetailsService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DetailsServiceImpl implements DetailsService {
    private final JpaDetailsRepository jpaDetailsRepository;

    public DetailsServiceImpl(JpaDetailsRepository jpaDetailsRepository) {
        this.jpaDetailsRepository = jpaDetailsRepository;
    }

    @Override
    public List<Details> findAllDetails(){ return this.jpaDetailsRepository.findAll();}

    @Override
    public List<Details> findByName(String name) {
        return this.jpaDetailsRepository.findByName(name);
    }

    @Override
    public List<Details> findAllByName(String name) {
        return this.jpaDetailsRepository.findAllByName(name);
    }

    @Override
    public void updateDetail(String name, String color, String size, Integer quantity) {
        this.jpaDetailsRepository.updateDetail(name, color, size, quantity);
    }

    @Override
    public Details createDetail(String name, String size, String color, Integer quantity) {
        Details d = new Details(name, size, color, quantity);
        return this.jpaDetailsRepository.save(d);
    }

    @Override
    public void deleteByName(String name) {
        this.jpaDetailsRepository.deleteByName(name);
    }
}
