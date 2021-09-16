package com.dicoding.javafundamental.basic.inputoutput;

import java.util.Scanner;

public class InputOutputFunction {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sistem penjumlahan sederhana");
        System.out.println("Masukan angka pertama =");
        int value1 = scanner.nextInt();
        System.out.println("Masukan angka kedua = ");
        int value2 = scanner.nextInt();
        int result = value1 + value2;
        System.out.println("Hasil dari penjumlahan " + value1 + "+" + value2 + " " + "adalah" + " " + result );
    }
}
