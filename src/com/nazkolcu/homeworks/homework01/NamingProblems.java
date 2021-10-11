package com.nazkolcu.homeworks.homework01;

public class NamingProblems {

    String firstName;

    int pow(int base, int exp) {
        int result = 1;
        for(int i = 0; i < exp; i++) {
            result = result * base;
        }
        return result;
    }

    public static void main(String[] args) {
        NamingProblems naming_errors = new NamingProblems();
        int base = 2;
        int exp = 10;
        int result = naming_errors.pow(base, exp);
        System.out.println(base + " to the " + exp + " is " + result);
        System.out.println(base + " ^ " + exp + " is " + result);


    }
}