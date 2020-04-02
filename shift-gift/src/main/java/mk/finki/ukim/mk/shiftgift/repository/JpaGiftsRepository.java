package mk.finki.ukim.mk.shiftgift.repository;

import mk.finki.ukim.mk.shiftgift.model.Gifts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface JpaGiftsRepository extends JpaRepository<Gifts, Integer> {
    @Query("SELECT g FROM Gifts g WHERE g.id=:id")
    List<Gifts> findAllById(@Param("id") Long id);

    @Query("SELECT g FROM Gifts g WHERE g.title=:title")
    List<Gifts> findAllByTitle(@Param("title") String title);
}
