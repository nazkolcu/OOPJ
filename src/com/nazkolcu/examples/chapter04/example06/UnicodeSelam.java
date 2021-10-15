package com.nazkolcu.examples.chapter04.example06;

public class UnicodeSelam {
    public static void main(String[] args) {
        String selamInJapanese = "\u4eca\u65e5\u306f\u4e16\u754c";
        System.out.println("Japoncada Selam Dünya: \t" + selamInJapanese);

        System.out.println("Ya da \n");

        char ch1 = '\u4eca';
        char ch2 = '\u65e5';
        char ch3 = '\u306f';
        char ch4 = '\u4e16';
        char ch5 = '\u754c';
        System.out.println("Japoncada Selam Dünya: \t" + ch1 + ch2 + ch3 + ch4 + ch5);
        String selamInArabic = "\u0633\u0644\u0627\u0645";
        System.out.println("Arapça Selam: \t\t\t" + selamInArabic);

        String selamInHebrew = "\u05e9\u05dc\u05d5\u05dd";
        System.out.println("Ibranice Selam: \t\t" + selamInHebrew);
    }
}
