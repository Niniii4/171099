package mk.finki.ukim.mk.shiftgift.model;

import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Data
@Table (name = "ORDERS")
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String surname;
    private String email;
    private String address;
    private Long phone;
    private Long numOrders;

    @ManyToOne
    private Flowers flowersOrdered;

    @ManyToOne
    private Wrappings wrappingsOrdered;

    @ManyToOne
    private Ornaments ornamentsOrdered;
}
