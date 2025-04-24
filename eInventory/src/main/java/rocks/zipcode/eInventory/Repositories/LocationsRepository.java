package rocks.zipcode.eInventory.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import rocks.zipcode.eInventory.Locations;

public interface LocationsRepository extends JpaRepository<Locations, Long> {
}