package zm.explore.Boardr.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity
@Table(name = "fulfillment")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Fulfillment {

    @Id
    @GeneratedValue
    private UUID id;

    @ManyToOne
    private Order order;

    @ManyToOne
    private Location location;

    private String status;
}