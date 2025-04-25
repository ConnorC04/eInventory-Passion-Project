package rocks.zipcode.eInventory.Repositories;


import org.springframework.data.repository.CrudRepository;
import rocks.zipcode.eInventory.Classes.Assets;

public interface AssetsRepository extends CrudRepository<Assets, Long> {
}