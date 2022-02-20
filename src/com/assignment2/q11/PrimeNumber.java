package com.assignment2.q11;

import java.util.ArrayList;

public class PrimeNumber {

    public static ArrayList<Integer> getDivisors(int num) {
        ArrayList<Integer> divisors = new ArrayList<>();
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) divisors.add(i);
        }
        return divisors;
    }

    public static boolean isPrime(int num) {
        System.out.println("=========================================================");
        if (getDivisors(num).isEmpty()) {
            System.out.println(num + " is an Prime number");
            return true;
        } else {
            System.out.println(num + " ain't no Prime number");
            System.out.println("It can be divided by : " + getDivisors(num));
        }
        return false;
    }


    public static void main(String[] args) {

        isPrime(37);

        /*
         * for(int i=1; i<20; i++)
         * {
         *     isPrime(i);
         * }
         */
    }
}
