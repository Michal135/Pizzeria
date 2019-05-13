package com.example.Pizzeria;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PizzaController {

    @Autowired
    private AllPizzas allpizzasClass;

    @GetMapping("/dodajPizze")
    public String greetingForm(Model model) {
        model.addAttribute("pizza", new Pizza());
        return "AddingPizza";
    }

    @PostMapping("/dodajPizze")
    public String greetingSubmit(@ModelAttribute Pizza pizza) {
        allpizzasClass.getAllPizzas().add(pizza);
        return "result";
    }

    @GetMapping("/")
    public String wszystkiePizzeWHTML(Model model){
        model.addAttribute("wszystkie", allpizzasClass.getAllPizzas());
        return "SpisPizz";
    }


}
