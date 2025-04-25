package rocks.zipcode.eInventory.Controllers;


import org.springframework.web.bind.annotation.*;
import rocks.zipcode.eInventory.Classes.Assets;
import rocks.zipcode.eInventory.Enums.Sizes;
import rocks.zipcode.eInventory.Enums.ageClassification;

import java.util.*;


@RestController
@RequestMapping("/assets")
@CrossOrigin(origins = "*") // Allow requests from anywhere, including your HTML page
public class AssetsController {

    @GetMapping
    public List<Assets> getAllAssets() {
        List<Assets> assetsList = new ArrayList<>();
        assetsList.add(new Assets("Shin Pad", ageClassification.SENIOR, Sizes.SMALL));
        assetsList.add(new Assets("Helmet", ageClassification.SENIOR, Sizes.MEDIUM));
        return assetsList;
    }
}