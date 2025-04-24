package rocks.zipcode.eInventory.Repositories;


import org.springframework.data.repository.CrudRepository;
import rocks.zipcode.eInventory.Assets;

public interface AssetsRepository extends CrudRepository<Assets, Long> {
}