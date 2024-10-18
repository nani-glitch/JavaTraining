package com.qascrip;

import java.util.Arrays;

public class ArrayMethods {
    public static void main(String[] args) {

        int arr[] = {9,4,1,8,10};
        int arr2[] = {4,7,2,7,13};
        Arrays .sort(arr);

        System.out.println("length of the array :"  + arr.length);
        System.out.println("sorted array :" + Arrays.toString(arr));

        if (arr . equals(arr2)){
            System.out.println("arrays are  equal");
        }
        else {
            System.out.println("arrays are  not equal");
        }
    }
}
