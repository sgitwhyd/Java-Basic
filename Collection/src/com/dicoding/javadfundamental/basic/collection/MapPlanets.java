package com.dicoding.javadfundamental.basic.collection;

import java.util.HashMap;
import java.util.Map;

public class MapPlanets {
    public static void main(String[] args){
        Map<String, Planet> planets = new HashMap<>();
        planets.put("Key-1", new Planet("earth", 0.06));
        planets.put("Key-2", new Planet("venus", 0.10));
        planets.put("Key-3", new Planet("mercury", 0.11));

        System.out.println("Map planet awal :" + planets.size());
        for (String key: planets.keySet()) {
            System.out.println("\n" + key + " : " + planets.get(key));
        }

        planets.remove("Key-3");

        System.out.println("Map planet awal :" + planets.size());
        for (Planet planet : planets.values()){
            System.out.println("\n" + planet);
        }

    }
}
