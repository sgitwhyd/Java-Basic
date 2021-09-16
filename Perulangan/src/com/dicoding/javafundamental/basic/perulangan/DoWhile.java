package com.dicoding.javafundamental.basic.perulangan;

public class DoWhile {
    public static void main(String[] args){
        boolean isFull = false;
        int value = 0;

        do {
            System.out.println("Angka : "+ value);
            value++;
            isFull = true;
            System.out.println(isFull);
        } while (value < 10);
    }
}
