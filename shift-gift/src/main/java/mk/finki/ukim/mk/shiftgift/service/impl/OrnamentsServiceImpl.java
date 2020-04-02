package mk.finki.ukim.mk.shiftgift.service.impl;

import mk.finki.ukim.mk.shiftgift.model.Ornaments;
import mk.finki.ukim.mk.shiftgift.model.Wrappings;
import mk.finki.ukim.mk.shiftgift.repository.JpaOrnamentsRepository;
import mk.finki.ukim.mk.shiftgift.service.OrnamentsService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrnamentsServiceImpl implements OrnamentsService {
    private final JpaOrnamentsRepository jpaOrnamentsRepository;

    public OrnamentsServiceImpl(JpaOrnamentsRepository jpaOrnamentsRepository) {
        this.jpaOrnamentsRepository = jpaOrnamentsRepository;
    }

    @Override
    public List<Ornaments> getAllByTitle(String title) {
        return this.jpaOrnamentsRepository.getAllByTitle(title);
    }

    @Override
    public Long findOrnamentsById(Long id) {
        return this.jpaOrnamentsRepository.findOrnamentsById(id);
    }

    @Override
    public void updateOrnament(Long id, String title, String description, Boolean handmade, String color, String size, String breakable, String material, Wrappings ornamentWrap) {
        this.jpaOrnamentsRepository.updateOrnament(id, title, description, handmade, color, size, breakable, material, ornamentWrap.id);
    }

    @Override
    public Ornaments createOrnament(Long id, String title, String description, Boolean handmade, String color, String size, String breakable, String material, Wrappings ornamentWrap) {
        Ornaments o = new Ornaments(id, title, description, handmade, color, size, breakable, material, ornamentWrap);
        return this.jpaOrnamentsRepository.save(o);
    }

    @Override
    public void deleteOrnament(Long id) {
        this.jpaOrnamentsRepository.deleteById(id);
    }
}
