package com.technews;

public class VariablesPractice {
    public static void main(String[] args) {
        int a = 9;
        double b = 4.25;
        String c = "dog";

        //calculated variable sum will be double since it has a decimal
        double sum = a + b;

        // calculated variable concat is a String
        String concat = a + c;

        // value of sum is 13.25
        System.out.println(sum);

        // value of concat is "9dog"
        System.out.println(concat);
    }
}
