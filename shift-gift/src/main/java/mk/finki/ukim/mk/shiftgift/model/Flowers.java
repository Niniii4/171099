package mk.finki.ukim.mk.shiftgift.model;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@JsonIgnoreProperties(ignoreUnknown = true, value = "flowerDetails")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table (name = "FLOWERS")
public class Flowers extends Gifts{
    private String family;
    private String type;

    @ManyToMany(mappedBy = "detailFlowers",  cascade = {CascadeType.PERSIST})
    @Fetch(value = FetchMode.SUBSELECT)
    private List<Details> flowerDetails;

    public Flowers(String title, String description, Boolean handmade, String color, String size, String family, String type, List<Details> flowerDetails) {
        this.title = title;
        this.description = description;
        this.handmade = handmade;
        this.color = color;
        this.size = size;
        this.family = family;
        this.type = type;
        this.flowerDetails = flowerDetails;
    }
}
