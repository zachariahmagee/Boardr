package zm.explore.Boardr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import zm.explore.Boardr.model.Order;

import java.util.UUID;

public interface OrderRepository extends JpaRepository<Order, UUID> {
}