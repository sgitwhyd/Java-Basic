package com.dicoding.javadfundamental.basic.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetPlanets {
    public static void main(String[] args){
        Set<String> planets = new HashSet<>();

        planets.add("mercury"); // method add() untuk menambahkan objek ke Set
        planets.add("venus");
        planets.add("earth");
        planets.add("earth"); // menambahkan objek "earth" beberapa kali
        planets.add("earth");
        planets.add("mars");

        System.out.println("Set planets awal (size = " + planets.size() + ")");
        for (String planet : planets){
            System.out.println("\n" + planet);
        }

        planets.remove("venus");

        System.out.println("Set planets awal (size = " + planets.size() + ")");
        for (Iterator iterator = planets.iterator(); iterator.hasNext();){
            System.out.println("\t" + iterator.next());
        }
    }
}
