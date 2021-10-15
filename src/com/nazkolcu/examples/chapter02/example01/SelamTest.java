package com.nazkolcu.examples.chapter02.example01;

public class SelamTest{

    public static void main(String[] args){
        Selam nesne = new Selam();

        String cevap = nesne.selamSoyle("Ali");
        System.out.println(cevap);

        cevap = nesne.selamSoyle("Naz");
        System.out.println(cevap);

        cevap = nesne.selamSoyle("");
        System.out.println(cevap);

        System.out.println(nesne.world);
    }
}