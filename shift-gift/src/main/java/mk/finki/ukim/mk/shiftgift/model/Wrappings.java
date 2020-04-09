package mk.finki.ukim.mk.shiftgift.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@JsonIgnoreProperties(ignoreUnknown = true, value = "wrappingDetails")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "WRAPPINGS")
public class Wrappings extends Gifts{
    private String fabric;
    private String shape;

    @ManyToMany(mappedBy = "detailWrappings", cascade = {CascadeType.PERSIST})
    @Fetch(value = FetchMode.SUBSELECT)
    private List<Details> wrappingDetails;

    public Wrappings(String title, String description, Boolean handmade, String color, String size, String fabric, String shape, List<Details> wrappingDetails) {
        this.title = title;
        this.description = description;
        this.handmade = handmade;
        this.color = color;
        this.size = size;
        this.fabric = fabric;
        this.shape = shape;
        this.wrappingDetails = wrappingDetails;
    }
}
