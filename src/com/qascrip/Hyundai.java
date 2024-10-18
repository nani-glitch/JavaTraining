package com.qascrip;

public class Hyundai  extends car {
    public static void main(String[] args) {

        start();
        acclerate();
        brakes();
    }

    public static void brakes() {

        System.out.println("press the brakes");
    }

    public static void start() {
        String key ="on";
        System.out.println("Turn the key "+ key);
    }

}
