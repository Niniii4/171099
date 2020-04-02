package mk.finki.ukim.mk.shiftgift.repository;

import mk.finki.ukim.mk.shiftgift.model.Details;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface JpaDetailsRepository extends JpaRepository<Details, Long> {
    @Query("SELECT d FROM Details d WHERE d.id = :id")
    Long findDetailsById(@Param("id") Long id);

    @Query("SELECT d FROM Details d WHERE d.name = :name")
    List<Details> findAllByName(@Param("name") String name);

    @Query("UPDATE Details d SET d.name=:name, d.color=:color, d.size=:size, d.quantity=:quantity WHERE d.id=:id")
    void updateDetail(@Param("id") Long id, @Param("name") String name, @Param("color") String color, @Param("size") String size, @Param("quantity") Integer quantity);
}