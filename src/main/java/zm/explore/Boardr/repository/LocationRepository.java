package zm.explore.Boardr.repository;

import zm.explore.Boardr.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface LocationRepository extends JpaRepository<Location, UUID> { }