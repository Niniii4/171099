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
    private Gifts orderGifts;

    public Orders(String name, String surname, String email, String address, Long phone, Long numOrders, Gifts orderGifts) {
        this.name=name;
        this.surname=surname;
        this.email=email;
        this.address=address;
        this.phone=phone;
        this.numOrders=numOrders;
        this.orderGifts=orderGifts;
    }
}
