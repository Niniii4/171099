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
@Table(name = "WRAPPINGS")
public class Wrappings extends Gifts{
    private String fabric;
    private String shape;

    @OneToMany(mappedBy = "flowerWrap", cascade = {CascadeType.ALL})
    private Set<Flowers> flowerWrap = new HashSet<>();

    @OneToMany(mappedBy = "ornamentWrap", cascade = {CascadeType.ALL})
    private Set<Ornaments> ornamentWrap = new HashSet<>();

    @ManyToMany(mappedBy = "detailWrappings", fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST})
    private List<Details> wrappingDetails;

    @OneToMany(mappedBy = "wrappingsOrdered", cascade = {CascadeType.ALL})
    private Set<Orders> wrappingsOrdered = new HashSet<>();

    public Wrappings(Long id, String title, String description, Boolean handmade, String color, String size, String fabric, String shape, List<Details> wrappingDetails) {
        this.id = id;
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
