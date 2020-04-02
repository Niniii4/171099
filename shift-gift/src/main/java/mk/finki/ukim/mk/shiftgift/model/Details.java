package mk.finki.ukim.mk.shiftgift.model;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Data
@Table (name = "DETAILS")
public class Details {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String size;
    private String color;
    private Integer quantity;

    @ManyToMany private List<Flowers> detailFlowers;

    @ManyToMany private List<Wrappings> detailWrappings;

    public Details(Long id, String name, String size, String color, Integer quantity) {
        this.id = id;
        this.name = name;
        this.size = size;
        this.color = color;
        this.quantity = quantity;
    }
}
