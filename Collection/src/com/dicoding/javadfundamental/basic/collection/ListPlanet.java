package com.dicoding.javadfundamental.basic.collection;

import java.util.ArrayList;
import java.util.List;

public class ListPlanet {
    public static void main(String[] args){
//        deklarasi array
        String[] heroes = new String[2];
        heroes[0] = "Spiderman";
        heroes[1] = "Iron Man";

//        menggunakan array list
        List<String> planets = new ArrayList<>();
        planets.add("Earth");
        planets.add("Mercury");
        planets.add("Venus");
        planets.remove("Mercury");
        for (int i = 0; i < planets.size(); i++){
            System.out.println("\t index-" + i + " =" + planets.get(i));
        }
    }
}
