package com.practicejava;

public class StringsEqualOrNot {
    public static void main(String[] args) {

        String S1= "Girish Patil";
        String S2= "Girish Patil";
        String S3= S1;
        String S4= "Mayur Patil";

        System.out.println("The String S1 and S2 is equal or not:" +S1.equals(S2));
        System.out.println("The String S1 and S2 is equal or not:" +(S1==S2));
        System.out.println("The String S1 and S3 is equal or not:" +(S1==S3));
        System.out.println("The String S1 and S3 is equal or not:" +S1.equals(S3));
        System.out.println("The String S1 and S4 is equal or not:" +S1.equals(S4));
        System.out.println("The String S3 and S4 is equal or not:" +(S3==S4));

    }
}
