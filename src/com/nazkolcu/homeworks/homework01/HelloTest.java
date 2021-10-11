package com.nazkolcu.homeworks.homework01;

public class HelloTest {

    public static void main(String[] args) {
        Hello object = new Hello();

        String result = object.sayHello("Alice");
        System.out.println(result);

        result = object.sayHello("Naz");
        System.out.println(result);

        result = object.sayHello("");
        System.out.println(result);

        System.out.println(object.world);
    }
}
