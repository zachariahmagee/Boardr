package zm.explore.Boardr.repository;

import zm.explore.Boardr.model.Fulfillment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface FulfillmentRepository extends JpaRepository<Fulfillment, UUID> { }