package com.dicoding.javafundamental.basic.inheritance;

public class Main {
    public static void main(String[] args){
        Hewan hewan = new Hewan();
        System.out.println("Apakah hewan adalah object" + (hewan instanceof Object));
        System.out.println("Apakah hewan adalah Hewan" + (hewan instanceof Hewan));
        System.out.println("Apakah hewan adalah Kucing" + (hewan instanceof Kucing));

        System.out.println("--------------------");

        Kucing kucing = new Kucing();
        System.out.println("Apakah hewan adalah object" + (kucing instanceof Object));
        System.out.println("Apakah kucing adalah Hewan" + (kucing instanceof Hewan));
        System.out.println("Apakah kucing adalah Kucing" + (kucing instanceof Kucing));


        hewan.makan();
        kucing.makan();
        kucing.makan("ikan");

        System.out.println("------------------------");

        Kucing meow = new Kucing("Ocicat", "tropis");
        Kucing puss = new Kucing("Ocicat", "subtropis");
        Kucing popo = new Kucing("Anggora", "subtropis");
        System.out.println(meow.toString());
        System.out.println(puss.toString());
        System.out.println(popo.toString());
        System.out.println("meow equals puss ? " + meow.equals(puss));
        System.out.println("meow equals popo ? " + meow.equals(popo));

        Mamalia kuda = new Kucing("Anggora", "Kampung");
       System.out.println( kuda.toString());
    }
}
