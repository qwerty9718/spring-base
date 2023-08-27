package uz.zaripov.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/main")
public class MainController {


    @GetMapping("/first")
    public String first(@RequestParam(value = "name", required = false) String name,
                        @RequestParam(value = "surname", required = false) String surname,
                        Model model){

        String message = "Hello " + name + " " + surname;
        model.addAttribute("message" , message);
        return "main/firstPage";
    }


    @GetMapping("/second")
    public String second(){
        return "main/secondPage";
    }

}
