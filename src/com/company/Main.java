package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	double[] nums = {5.25,3.4,9.26,1.2,-2.6,7.6,15.99,44.7,-25.3,1.1,-2.5,-3.7,9.5,1.7,1.17};

//    1

    System.out.println("Amount of elements in Array is "+nums.length);
    boolean t = false;
    double sumOfEl =0;
    int amountOfInd = 0;

    for(double element:nums){
        if(element<0){
            t=true;
        }
        if((t)&&(element>0)){
            System.out.println(element);
            sumOfEl+=element;
            amountOfInd++;
        }
    }
        System.out.println(sumOfEl+"/"+amountOfInd+"="+sumOfEl/amountOfInd);
        System.out.println();
        System.out.println("***                          2                         ***");
        System.out.println();

//        2

        System.out.println(Arrays.toString(nums));
        for (int i = 0; i < nums.length; i++) {
            int minInd = i;
            double minEl = nums[minInd];
            for (int l = i+1; l < nums.length; l++) {
                if(nums[minInd]>nums[l]){
                    minInd=l;
                    minEl = nums[minInd];
                }
            }

            nums[minInd]=nums[i];
            nums[i]=minEl;
            System.out.println("_____________________");
            System.out.println(Arrays.toString(nums));
            }
}}
