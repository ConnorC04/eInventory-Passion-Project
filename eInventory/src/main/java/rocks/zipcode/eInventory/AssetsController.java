package rocks.zipcode.eInventory;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import rocks.zipcode.eInventory.repositories.AssetsRepository;

import java.util.List;

@RestController
@RequestMapping("/assets")
public class AssetsController{

    private final AssetsRepository assetsRepository;

    @Autowired
    public AssetsController(AssetsRepository assetsRepository){
        this.assetsRepository = assetsRepository;
    }
}