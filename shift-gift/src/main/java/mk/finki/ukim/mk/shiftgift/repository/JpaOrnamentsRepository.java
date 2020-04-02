package mk.finki.ukim.mk.shiftgift.repository;

import mk.finki.ukim.mk.shiftgift.model.Ornaments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface JpaOrnamentsRepository extends JpaRepository<Ornaments, Long> {
    @Query("SELECT o FROM Ornaments o WHERE o.id = :id")
    Long findOrnamentsById(@Param("id") Long id);

    @Query("SELECT o FROM Ornaments o WHERE o.title =:title")
    List<Ornaments> getAllByTitle(@Param("title") String title);

    @Query("UPDATE Ornaments o SET o.title=:title, o.description=:description, o.color=:color, o.size=:size, o.handmade=:handmade, o.breakable=:breakable, o.material=:material, o.ornamentWrap=:ornamentWrap WHERE o.id=:id")
    void updateOrnament(@Param("id") Long id, @Param("title") String title, @Param("description") String description, @Param("handmade") Boolean handmade,  @Param("color") String color, @Param("size") String size, @Param("breakable") String breakable, @Param("material") String material, @Param("ornamentWrap") Long ornamentWrap);
}
