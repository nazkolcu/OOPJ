package com.nazkolcu.homeworks.homework01;

public class Hello {
    String world = "everyone";

    public String sayHello(String toWho) {
        String sentence;
        if (toWho != "")
            sentence = "Hello " + toWho + " :)";
        else
            sentence = "Hello " + world + " :)";

        return sentence;
    }
}
