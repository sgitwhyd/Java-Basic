package com.dicoding.javafundamental.basic.objek;

public class Hewan {
    String nama;
    int berat;
    int jumlahKaki;

    public Hewan(String namaHewan){
        nama = namaHewan;
    }

    public int beratHewan(int beratHewan){
        return berat = beratHewan;
    }

    public  int jumlahKaki(int jmlhKakiHewan){
        return jumlahKaki = jmlhKakiHewan;
    }

    public  void cetakHewan(){
      System.out.println("Hewan : " + this.nama + "\n" + "berat : " + this.berat + "Kg" + "\n" + "jumlah kaki : "
              + this.jumlahKaki);
    }
}
