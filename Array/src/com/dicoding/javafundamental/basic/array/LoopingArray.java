package com.dicoding.javafundamental.basic.array;

public class LoopingArray {
    public static void main(String[] arg){
        int[] arrInt = new int[20];
        for (int i = 0; i < arrInt.length; i++){
            arrInt[i] = i + 1;
            System.out.println(arrInt[i]);
        }

    }
}
