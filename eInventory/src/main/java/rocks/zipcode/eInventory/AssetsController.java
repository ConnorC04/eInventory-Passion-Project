package rocks.zipcode.eInventory;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import rocks.zipcode.eInventory.Repositories.AssetsRepository;

import java.util.Collection;
import java.util.HashMap;

import java.util.Map;


@RestController
@RequestMapping("/assets")
public class AssetsController {

    private Map<String, Assets> db = new HashMap<>() {{
        put("helmet", new Assets("helmet", ageClassification.SENIOR, Sizes.MEDIUM));
        put("shinPad", new Assets("shinPad", ageClassification.SENIOR, Sizes.SMALL));
    }};

    @Autowired
    AssetsRepository assetsRepository;

    @GetMapping
    public Collection<Assets> get() {
        return db.values();
    }

    @GetMapping("/{equipmentType}")
    public Assets get(@PathVariable String equipmentType) {
        Assets assets = db.get(equipmentType);
        if (assets == null) throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        return assets;
    }

    @DeleteMapping("/{equipmentType}")
    public void delete(@PathVariable String equipmentType) {
        Assets assets = db.remove(equipmentType);
        if (assets == null) throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    }
}