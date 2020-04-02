package mk.finki.ukim.mk.shiftgift.repository;

import mk.finki.ukim.mk.shiftgift.model.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface JpaOrdersRepository extends JpaRepository<Orders, Long> {
    @Query("SELECT o FROM Orders o WHERE o.id = :id")
    Long findOrdersById(Long id);

    @Query("SELECT o FROM Orders o WHERE o.name=:name or o.surname=:surname")
    List<Orders> findByNameOrSurname(@Param("name") String name, @Param("surname") String surname);
}