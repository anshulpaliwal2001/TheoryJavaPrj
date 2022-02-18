package com.assignment2.q8;

public class Fibonacci {
    int a, b;

    public Fibonacci(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void printFibonacci(int NUM) {
        int tmp;
        System.out.print("[" + a + "] ");
        System.out.print("[" + b + "] ");
        for (int i = 0; i < NUM - 2; i++) {
            tmp = a + b;
            a = b;
            b = tmp;
            System.out.print("[" + tmp + "] ");
        }
    }

    public static void main(String[] args) {
        Fibonacci f1 = new Fibonacci(2, 9);     //Starting values here
        f1.printFibonacci(10);
    }

}
