package com.dicoding.javafundamental.basic.objek;

public class Main {
    public static void main(String[] args){
        Hewan Sapi = new Hewan("Sapi");
        Sapi.beratHewan(100);
        Sapi.jumlahKaki(4);
        Sapi.cetakHewan();

        Hewan Kucing = new Hewan("Kucing");
        Kucing.beratHewan(3);
        Kucing.jumlahKaki(4);
        Kucing.cetakHewan();
    }
}
