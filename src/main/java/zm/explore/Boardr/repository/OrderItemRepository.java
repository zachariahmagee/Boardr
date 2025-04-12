package zm.explore.Boardr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import zm.explore.Boardr.model.OrderItem;

import java.util.UUID;

public interface OrderItemRepository extends JpaRepository<OrderItem, UUID> {
}
