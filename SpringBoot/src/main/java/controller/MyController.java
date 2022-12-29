package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class MyController {

    @RequestMapping("/home")
    public String home(Model model) {
        model.addAttribute("name", "John");
        return "home";
    }

    @RequestMapping("/about")
    public String about() {
        return "about";
    }
  
    
}

