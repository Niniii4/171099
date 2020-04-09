package mk.finki.ukim.mk.shiftgift.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true, value = {"detailWrappings", "detailFlowers" })
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Data
@Table (name = "DETAILS")
public class Details {
    @Id
    private String name;
    private String size;
    private String color;
    private Integer quantity;

    @ManyToMany private List<Flowers> detailFlowers;

    @ManyToMany private List<Wrappings> detailWrappings;

    public Details(String name, String size, String color, Integer quantity) {
        this.name = name;
        this.size = size;
        this.color = color;
        this.quantity = quantity;
    }
}
