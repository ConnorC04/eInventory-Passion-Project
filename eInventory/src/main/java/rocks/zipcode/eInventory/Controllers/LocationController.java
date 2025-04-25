package rocks.zipcode.eInventory.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import rocks.zipcode.eInventory.Classes.Locations;
import rocks.zipcode.eInventory.Repositories.LocationsRepository;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/locations")
@CrossOrigin
public class LocationController {

    @Autowired
    private LocationsRepository locationRepository;

    @GetMapping
    public List<Locations> getAllLocations() {
        List<Locations> locations = new ArrayList<>();
        locationRepository.findAll().forEach(locations::add);
        return locations;
    }

    @PostMapping
    public Locations addLocation(@RequestBody Locations location) {
        return locationRepository.save(location);
    }
}
