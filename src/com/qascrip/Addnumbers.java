package com.qascrip;

public class Addnumbers {

    public static void main(String[] args) {

        addnumbers(4,5);
        addnumbers(3,5);

        int result = addnumbers(6,5);
        int output = result + 5;
        System.out.println("increment the output:" + result+1);


    }

    public static int addnumbers(int num1, int num2){


        int res=num1 + num2;

        System.out.println("Addition of 2 numbers:" + res);
        return  res;

    }


}