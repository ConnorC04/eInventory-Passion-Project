package rocks.zipcode.eInventory;


import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;

@Controller

public class AssetsController{

    @PostMapping("/")
    public String index(){
        return "index.html";
    }

}