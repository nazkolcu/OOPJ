package com.nazkolcu.examples.chapter04.example11;

public class PrimitivesAndReferences {
    public static void main(String[] args) {
        int i = 5;
        int j = i;
        i = 7;
        System.out.println("i: " + i + "\t" + "j:" + j);
        System.out.println();

        String s1 = new String("http://www.JavaTurk.org");
        String s2 = new String("http://java.sun.com");

        System.out.println("Before switch => s1: " + s1 + "\t" + "s2: " + s2);

        String tmp=s1;

        s1=s2;

        s2=tmp;
        System.out.println("s1: "+s1);
        System.out.println("s2: "+s2+"\t "+"tmp: "+tmp);
        System.out.println("s2 starts with "+ s2.charAt(0)+" and ends with "+s2.charAt(s2.length()-1));
        System.out.println("tmp starts with "+ tmp.charAt(0)+" and ends with "+tmp.charAt(tmp.length()-1));

        System.out.println();
        s2=new String("http://www.oracle.com/technetwork/java/index.html");
        System.out.println("s2: "+s2+" \t"+"tmp: "+tmp);
    }
}
