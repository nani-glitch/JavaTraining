package com.qascrip;

public class Audi {

    public static void main(String[] args) {
        car audi = new car();
        audi.setColor("red");
        audi.setSize(60);
        audi.setweight(21.34);


        car.acclerate();
        car.start();


    }

    public static void displaylogo(String s1) {
        System.out.println("Logo is:" + s1);

    }

    public static void displaylogo(int s) {
        System.out.println("logo is :" + s );


    }

}