package rocks.zipcode.eInventory;


import org.springframework.web.bind.annotation.*;


@RestController
public class AssetsController{

    private Assets assets = new Assets("helmet", ageClassification.JUNIOR, Sizes.SMALL);

    @GetMapping("/")
    public String index(){
        return "Hello World";
    }



}