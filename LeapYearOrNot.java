package com.practicejava;
import java.util.Scanner;

public class LeapYearOrNot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the year >= 1582 to check Leap year or not :");
        int year=sc.nextInt();

        if(year%4==0 && (year%400==0 || year%100!=0)) {
            System.out.println("The year " + year + " is a Leap year.");
            }
        else{
            System.out.println("The year "+year+" is not a Leap year.");
            }
    }
}
