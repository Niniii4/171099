package mk.finki.ukim.mk.shiftgift.repository;

import mk.finki.ukim.mk.shiftgift.model.Details;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface JpaDetailsRepository extends JpaRepository<Details, Long> {
    @Query("DELETE FROM Details d WHERE d.name = :name")
    void deleteByName(@Param("name") String name);

    @Query("SELECT d FROM Details d WHERE d.name = :name")
    List<Details> findByName(@Param("name") String name);

    @Query("SELECT d FROM Details d WHERE d.name = :name")
    List<Details> findAllByName(@Param("name") String name);

    @Query("UPDATE Details d SET d.color=:color, d.size=:size, d.quantity=:quantity WHERE d.name=:name")
    void updateDetail(@Param("name") String name, @Param("color") String color, @Param("size") String size, @Param("quantity") Integer quantity);
}