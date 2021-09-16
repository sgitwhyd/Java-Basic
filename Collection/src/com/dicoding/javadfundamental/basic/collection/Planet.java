package com.dicoding.javadfundamental.basic.collection;

public class Planet {
    private String name;
    private Double mass;

    public Planet (String name, Double mass){
        this.name = name;
        this.mass = mass;
    }

    public String toString(){
        return "Planet" + name + ", mass: " + mass;
    }
}
