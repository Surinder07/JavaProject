package com.FasttrackVideos;


import java.sql.SQLOutput;
import java.util.Scanner;

//data types practice
public class ClassPractice {
    public static void main(String[] args) {
//
//        <18 kid
//         >18 < 21 teen
//         21 40 adult
//         40 60 senior
//
//         60+ super senior
//
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the age : ");
        int age = scanner.nextInt();



            if (age <= 18) {

                System.out.println("You are a kid");
            } else if (age > 18 && age <= 21) {

                System.out.println("You are a tenn");
            } else if (age > 21 && age <= 60) {

                System.out.println("adult");
            } else if (age > 60) {

                System.out.println("You are senior citizen");
            } else {

                System.out.println("You are not born yet ");
            }





    }
}
