package com.dicoding.javafundamental.basic;

import com.dicoding.javafundamental.basic.kendaraan.Kereta;
import com.dicoding.javafundamental.basic.kendaraan.Mobil;
import com.dicoding.javafundamental.basic.kendaraan.Motor;
import com.dicoding.javafundamental.basic.musik.Gitar;
import org.apache.commons.lang3.time.DateUtils;

import java.util.Date;
import java.util.Locale;

public class Main {
    public static void main(String[] arg){
        System.out.println("Hello World");
        Gitar.bunyi();
        Mobil.jumlahBan();
        Kereta.jumlahBan();
        Motor.jumlahBan();

        Date today = new Date();
        System.out.println("Hari ini = " + today);
        Date tomorrow = DateUtils.addDays(today, 1);
        System.out.println("Besok = " + tomorrow);

        char[] charts = {'w', 'f', 'v', 'd'};
        String word = "wfvd";
        String chart = new String(charts);
        int chartLengt = chart.length();
        char findChart = chart.charAt(2);
        boolean isWordEmpty = word.isEmpty();
        boolean isEqualWord = chart.equals(word);
        String concatWord = word.concat("s");
        if(word.equals(chart)){
            System.out.println(chart.toUpperCase(Locale.ROOT));
        } else {
            System.out.println("tidak sama");
        }
    }
}
