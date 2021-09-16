package com.dicoding.javafundamental.basic.function;

public class ReturnFunction {
    public static void main(String[] args){
       System.out.println("Hasilnya adalah " +  hitungLuasPersegi(3, 6.5));
    }

    public static double hitungLuasPersegi(double panjang, double lebar){
        return panjang * lebar;
    }
}
