package mk.finki.ukim.mk.shiftgift.repository;

import mk.finki.ukim.mk.shiftgift.model.Details;
import mk.finki.ukim.mk.shiftgift.model.Wrappings;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;

public interface JpaWrappingsRepository extends JpaRepository<Wrappings, Long> {
    @Query("SELECT w FROM Wrappings w WHERE w.id = :id")
    Long getById(@Param("id") Long id);

    @Query("SELECT w FROM Wrappings w WHERE w.shape = :shape")
    List<Wrappings> findAllByShape(@Param("shape") String shape);

    @Transactional
    @Modifying
    @Query("UPDATE Wrappings w SET w.title=:title, w.description=:description, w.color=:color, w.size=:size, w.fabric=:fabric, w.shape=:shape WHERE w.id=:id")
    void updateWrapping(@Param("id") Long id, @Param("title") String title,  @Param("description") String description, @Param("color") String color, @Param("size") String size, @Param("shape") String shape, @Param("fabric") String fabric);
}