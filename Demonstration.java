package com.practicejava;

public class Demonstration {
    static int fact=1;
    static void factorial(int num){
        for(int i=num; i>0; i--) {
            fact = fact * i;
        }
            System.out.println("The factorial of the " + num + " is: " + fact);
    }
    public static void main(String[] args) {
        factorial(5);
    }
}
