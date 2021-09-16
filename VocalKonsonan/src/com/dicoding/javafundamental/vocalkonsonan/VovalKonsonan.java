package com.dicoding.javafundamental.vocalkonsonan;

import java.util.Scanner;

public class VovalKonsonan {
    public static void main(String[] args){

        int vokal = 0;
        int konsonan = 0;

        System.out.println("Masukan Kalimat");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        vokal = num_vocal(word);
        konsonan = num_konsonan(word);

        System.out.println("Jumlah huruf vokal = " + vokal);
        System.out.println("Jumlah huruf konsonan = " + konsonan);
    }

    private static int num_vocal(String word){
        int i;
        int jmlhVocal = 0;

        for (i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'a' || word.charAt(i) == 'i' || word.charAt(i) == 'u' || word.charAt(i) == 'e' || word.charAt(i) == 'o') {
                jmlhVocal++;
            }
        }

        return  jmlhVocal;
    }

    private static int num_konsonan(String word){
        int jmlhKonsonan = 0;

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != 'a' && word.charAt(i) != 'i' && word.charAt(i) != 'u' && word.charAt(i) != 'e' && word.charAt(i) != 'o' && word.charAt(i) != ' ') {
                jmlhKonsonan++;
            }
        }
       return  jmlhKonsonan;
    }
}
