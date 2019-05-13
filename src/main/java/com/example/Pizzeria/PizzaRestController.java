package com.example.Pizzeria;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class PizzaRestController {
    @Autowired
    private AllPizzas allpizzasClass;

    @GetMapping("/showPizzas")
    public List<Pizza> showAllPizzas(){
        return allpizzasClass.getAllPizzas();
    }

    @PostMapping("/addingPizzainPostman")
        public void addPizza(@RequestBody Pizza pizza){
        allpizzasClass.getAllPizzas().add(pizza);
    }

}
