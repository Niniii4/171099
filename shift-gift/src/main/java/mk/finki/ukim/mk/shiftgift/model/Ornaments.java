package mk.finki.ukim.mk.shiftgift.model;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "ORNAMENTS")
public class Ornaments extends Gifts{

    private String breakable;
    private String material;

    @ManyToOne
    private Wrappings ornamentWrap;

    @OneToMany(mappedBy = "ornamentsOrdered", cascade = {CascadeType.ALL})
    private Set<Orders> ornamentsOrdered = new HashSet<>();

    public Ornaments(Long id, String title, String description, Boolean handmade, String color, String size, String breakable, String material, Wrappings ornamentWrap) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.handmade = handmade;
        this.color = color;
        this.size = size;
        this.breakable = breakable;
        this.material = material;
        this.ornamentWrap = ornamentWrap;
    }
}
