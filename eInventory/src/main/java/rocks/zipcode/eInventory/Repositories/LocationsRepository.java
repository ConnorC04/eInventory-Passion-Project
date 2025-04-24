package rocks.zipcode.eInventory.Repositories;

import org.springframework.data.repository.CrudRepository;
import rocks.zipcode.eInventory.Locations;

public interface LocationsRepository extends CrudRepository<Locations, Long> {
}