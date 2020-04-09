package mk.finki.ukim.mk.shiftgift.model;
import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
@Entity
@Inheritance (strategy = InheritanceType.JOINED)
public class Gifts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    public String title;
    public String description;
    public Boolean handmade;
    public String color;
    public String size;

    @OneToMany(mappedBy = "orderGifts", fetch = FetchType.EAGER, cascade = {CascadeType.ALL})
    private Set<Orders> giftsOrdered = new HashSet<>();
}
