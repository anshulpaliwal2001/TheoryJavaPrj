package com.assignment2.q10;

//   Write a JAVA Program to Check Whether Number is Perfect or Not

import java.util.ArrayList;

public class PerfectNumber {

    public static ArrayList<Integer> getFactors(int num) {
        ArrayList<Integer> factors = new ArrayList<>();

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) factors.add(i);
        }
        return factors;
    }

    public static int getFactorSum(ArrayList<Integer> factors) {
        int sum = 0;
        factors.remove(factors.size() - 1);       // to remove the number itself from the list
        for (int d : factors)
            sum += d;
        return sum;
    }

    public static void isPerfect(int num) {
        int tmp = getFactorSum(getFactors(num));
        if (num == tmp) {
            System.out.println(num + " is an Perfect number.");
            System.out.println("The factors are : " + getFactors(num));
        } else {
            System.out.println(num + " is not an perfect number. Its factor sum is " + tmp);
            System.out.println("and the factors are : " + getFactors(num));
        }
    }

    public static void main(String[] args) {
        isPerfect(28);
    }
}
