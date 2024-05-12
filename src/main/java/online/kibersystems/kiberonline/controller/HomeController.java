package online.kibersystems.kiberonline.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {

    @GetMapping({"/", "/index.html"})
    public String getHome(Model model){
        model.addAttribute("welcome", "This is new welocme messages.. =)");
        return "index";
    }

    @GetMapping("/features")
    public String getFeatures(Model model){
        model.addAttribute("features", List.of("Big", "Round", "Purple(color))"));
        return "features";
    }

    @GetMapping("/pricing")
    public String getPricing(Model model){

       return "pricing";
    }

}
