package com.example.Pizzeria;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class AllPizzas {

    private ArrayList<Pizza>  allPizzas;

    public AllPizzas(){
        this.allPizzas=new ArrayList<>();
        allPizzas.add(new Pizza("pizza1",20,"Sos Pomidorowy"));
        allPizzas.add(new Pizza("pizza2",30,"Ser", "Sos Pomidorowy"));
        allPizzas.add(new Pizza("pizza3",40,"Ser","Pieczarki"));
        allPizzas.add(new Pizza("pizza4",40,"Ser","Szynka"));
    }

    public ArrayList<Pizza> getAllPizzas() {
        return allPizzas;
    }

    public void setAllPizzas(ArrayList<Pizza> allPizzas) {
        this.allPizzas = allPizzas;
    }

}
