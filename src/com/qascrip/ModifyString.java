package com.qascrip;

public class ModifyString {
    public static void main(String[] args) {

        String s1 = "Learning java";
        String s2 = "Basics" ;

        System.out.println("Length of the string is:" + s1.length());
        System.out.println("Upper case string :" + s1.toUpperCase());
        System.out.println("lower case string :" + s1.toLowerCase());
        System.out.println("Get char :" +s1.indexOf('n'));
        System.out.println("Get position :" +s1.charAt(3));
    }
}
