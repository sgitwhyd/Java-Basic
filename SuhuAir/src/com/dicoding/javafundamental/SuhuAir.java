package com.dicoding.javafundamental;

import java.util.Scanner;

public class SuhuAir {
    public static void main(String[] args){
        int T;

        System.out.println("Contoh IF 3 kasus");
        System.out.println("Suhu (der. C ) = ");


        Scanner scanner = new Scanner(System.in);
        T = scanner.nextInt();

        if(T < 0){
            System.out.println("wujud air beku " + T);
        } else if((T <= T) && (T <= 100)){
            System.out.println("Wujud air cair " + T);
        } else if(T > 0){
            System.out.println("Wujud air uap/gas " + T);
        }
    }
}
