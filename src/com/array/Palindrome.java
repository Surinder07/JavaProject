package com.array;

public class Palindrome

{

    // calculate factorial using recursion
    private static int factorial(int n ){

        if(n==1) {
            return 1;
        }
        else{

            return (n*factorial(n-1));
        }
    }


    public static void main(String[] args) {


        int result = factorial(5);
        System.out.println(result);


    }
}
