package mk.finki.ukim.mk.shiftgift.repository;

import mk.finki.ukim.mk.shiftgift.model.Details;
import mk.finki.ukim.mk.shiftgift.model.Flowers;
import mk.finki.ukim.mk.shiftgift.model.Wrappings;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;

public interface JpaFlowersRepository extends JpaRepository<Flowers, Long> {

    @Query("SELECT f FROM Flowers f WHERE f.id = :id")
    Long getById(@Param("id") Long id);

    @Query("SELECT f FROM Flowers f WHERE f.family = :family OR f.type = :type")
    List<Flowers> findAllByFamilyOrType(@Param("family") String family, @Param("type") String type);

    @Transactional
    @Modifying
    @Query("UPDATE Flowers f SET f.title=:title, f.description=:description, f.color=:color, f.size=:size, f.family=:family, f.type=:type WHERE f.id=:id")
    void updateFlower(@Param("id") Long id, @Param("title") String title, @Param("description") String description, @Param("color") String color, @Param("size") String size, @Param("family") String family, @Param("type") String type);


}
