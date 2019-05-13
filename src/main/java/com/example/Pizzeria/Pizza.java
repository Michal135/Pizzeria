package com.example.Pizzeria;

import java.util.ArrayList;
import java.util.Iterator;

public class Pizza {
    private String nazwa;
    private int cena;
    private ArrayList<String> skladniki;

    public Pizza(){}

    public Pizza(String nazwa, int cena) {
        this.nazwa = nazwa;
        this.cena = cena;
    }

    public Pizza(String nazwa, int cena, String skladnik1) {
        this.skladniki=new ArrayList<>();
        this.nazwa = nazwa;
        this.cena = cena;
        skladniki.add(skladnik1);
    }

    public Pizza(String nazwa, int cena, String skladnik1, String skladnik2) {
        this.skladniki=new ArrayList<>();
        this.nazwa = nazwa;
        this.cena = cena;
        skladniki.add(skladnik1);
        skladniki.add(skladnik2);
    }



    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    public ArrayList<String> getSkladniki() {
        return skladniki;
    }

    public void setSkladniki(ArrayList<String> skladniki) {
        this.skladniki = skladniki;
    }
}