package mk.finki.ukim.mk.shiftgift.model;
import lombok.*;
import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table (name = "FLOWERS")
public class Flowers extends Gifts{
    private String family;
    private String type;

    @ManyToOne
    private Wrappings flowerWrap;

    @ManyToMany(mappedBy = "detailFlowers", fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST})
    private List<Details> flowerDetails;

    @OneToMany(mappedBy = "flowersOrdered", cascade = {CascadeType.ALL})
    private Set<Orders> flowersOrdered = new HashSet<>();

    public Flowers(Long id, String title, String description, Boolean handmade, String color, String size, String family, String type, Wrappings flowerWrap, List<Details> flowerDetails) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.handmade = handmade;
        this.color = color;
        this.size = size;
        this.family = family;
        this.type = type;
        this.flowerWrap = flowerWrap;
        this.flowerDetails = flowerDetails;
    }
}
