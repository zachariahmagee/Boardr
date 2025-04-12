package zm.explore.Boardr.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity
@Table(name = "inventory")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Inventory {

    @Id
    @GeneratedValue
    private UUID id;

    @ManyToOne
    private Product product;

    @ManyToOne
    private Location location;

    private Integer quantity;
}