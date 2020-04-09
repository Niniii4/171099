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

    public Ornaments(String title, String description, Boolean handmade, String color, String size, String breakable, String material) {
        this.title = title;
        this.description = description;
        this.handmade = handmade;
        this.color = color;
        this.size = size;
        this.breakable = breakable;
        this.material = material;
    }
}
