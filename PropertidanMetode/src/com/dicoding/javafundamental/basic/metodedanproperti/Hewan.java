package com.dicoding.javafundamental.basic.metodedanproperti;

public class Hewan {
//    properti atau fields
    double tinggi;
    double berat;
    int umur;

    Hewan(int umur){
        this.umur = umur;
    }

    private void makan(){
        System.out.println("Sedang makan");
    }

    public void printAnimal(){
        makan();
        System.out.println(this.umur);
    }
}
