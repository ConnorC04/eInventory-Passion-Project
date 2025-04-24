package rocks.zipcode.eInventory.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import rocks.zipcode.eInventory.Assets;

public interface AssetsRepository extends JpaRepository<Assets, Long> {
}