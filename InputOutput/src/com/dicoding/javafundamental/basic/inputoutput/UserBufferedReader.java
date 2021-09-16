package com.dicoding.javafundamental.basic.inputoutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserBufferedReader {
    public static void main(String[] args){
        InputStreamReader streamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(streamReader);
        System.out.println("Sistem Penjumlahan sangat sederhana");
        int value1 = 0;
        int value2 = 0;
        try{
            System.out.println("Masukan angka pertama");
            value1 = Integer.parseInt(bufferedReader.readLine());
            System.out.println("Masukan angka kedua");
            value2 = Integer.parseInt(bufferedReader.readLine());
        } catch(IOException e) {
            e.printStackTrace();
        }

        int result = value1 + value2;
        System.out.println("Hasil penjumlahan dari " + value1 + "+" + value2 + " " + "adlaah" + " " + result);
    }
}
