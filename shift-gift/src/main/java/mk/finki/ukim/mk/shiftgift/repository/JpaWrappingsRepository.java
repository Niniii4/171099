package mk.finki.ukim.mk.shiftgift.repository;

import mk.finki.ukim.mk.shiftgift.model.Details;
import mk.finki.ukim.mk.shiftgift.model.Wrappings;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface JpaWrappingsRepository extends JpaRepository<Wrappings, Long> {
    @Query("SELECT w FROM Wrappings w WHERE w.id = :id")
    Long findWrappingsById(@Param("id") Long id);

    @Query("SELECT w FROM Wrappings w WHERE w.shape = :shape")
    List<Wrappings> findAllByShape(@Param("shape") String shape);

    @Query("UPDATE Wrappings w SET w.title=:title, w.description=:description, w.color=:color, w.size=:size, w.handmade=:handmade, w.fabric=:fabric, w.shape=:shape WHERE w.id=:id")
    void updateWrapping(@Param("id") Long id, @Param("title") String title,  @Param("description") String description, @Param("handmade") Boolean handmade, @Param("color") String color, @Param("size") String size, @Param("shape") String shape, @Param("fabric") String fabric);
}