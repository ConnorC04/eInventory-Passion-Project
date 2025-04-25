package rocks.zipcode.eInventory;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import rocks.zipcode.eInventory.Repositories.AssetsRepository;

import java.util.*;


@RestController
@RequestMapping("/assets")
@CrossOrigin(origins = "*") // Allow requests from anywhere, including your HTML page
public class AssetsController {

//    private Map<String, Assets> db = new HashMap<>() {{
//        put("helmet", new Assets("helmet", ageClassification.SENIOR, Sizes.MEDIUM));
//        put("shinPad", new Assets("shinPad", ageClassification.SENIOR, Sizes.SMALL));
//    }};

//    @Autowired
//    AssetsRepository assetsRepository;

//    @GetMapping
//    public Collection<Assets> get() {
//        return db.values();
//    }

//    @GetMapping("/{equipmentType}")
//    public Assets get(@PathVariable String equipmentType) {
//        Assets assets = db.get(equipmentType);
//        if (assets == null) throw new ResponseStatusException(HttpStatus.NOT_FOUND);
//        return assets;
//    }



    @GetMapping
    public List<Assets> getAllAssets() {
        List<Assets> assetsList = new ArrayList<>();
        assetsList.add(new Assets("shinPad", ageClassification.SENIOR, Sizes.SMALL));
        assetsList.add(new Assets("helmet", ageClassification.SENIOR, Sizes.MEDIUM));
        return assetsList;
    }



}