package com.dicoding.javafundamental.bangundatar;

import java.util.Scanner;

public class Main {

    private static char pilihan;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        PersegiPanjang persegiPanjang;
        SegitigaSiku segitigaSiku;
        Lingkaran lingkaran;

        int s1, s2, r;

        persegiPanjang = new PersegiPanjang();
        segitigaSiku = new SegitigaSiku();
        lingkaran = new Lingkaran();

        // panggil mainMenu
        mainMenu();

        // kondisional menu yang dipilih

        switch (pilihan){
            case '1' : {
                System.out.print("Masukan panjang persegi: ");
                s1 = scanner.nextInt();
                System.out.print("Masukan lebar persegi: ");
                s2 = scanner.nextInt();
                System.out.println("Luas persegi panjang: " + persegiPanjang.luas(s1,s2));
                System.out.println("Keliling persegi panjang: " + persegiPanjang.keliling(s1,s2));
                break;
            }
            case '2' : {
                System.out.print("Masukan alas segitiga siku: ");
                s1 = scanner.nextInt();
                System.out.print("Masukan tinggi segitiga siku: ");
                s2 = scanner.nextInt();
                System.out.println("Luas segitiga: " + segitigaSiku.luas(s1,s2));
                System.out.println("Keliling segitiga: " + segitigaSiku.keliling(s1,s2));
                break;
            }
            case '3' : {
                System.out.print("Masukan jari-jari lingkaran: ");
                r = scanner.nextInt();
                System.out.println("Luas lingkaran: " + lingkaran.luas(r));
                System.out.println("Keliling lingkaran: " + lingkaran.keliling(r));
                break;
            }
            default:{
                System.out.println("tidak ada pilihan");
                break;
            }
        }

    }

    public static void mainMenu(){
        System.out.println("====================");
        System.out.println("Hitung Luas dan Keliling :");
        System.out.println("1. Persegi Panjang");
        System.out.println("2. Segitiga Siku");
        System.out.println("3. Lingkaran");
        System.out.print("Masukan Menu : ");

        pilihan = scanner.next().charAt(0);
    }
}
