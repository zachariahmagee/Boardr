package zm.explore.Boardr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import zm.explore.Boardr.model.Product;

import java.util.UUID;

public interface ProductRepository extends JpaRepository<Product, UUID> {
}

