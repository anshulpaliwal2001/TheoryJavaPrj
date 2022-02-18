package com.assignment2.q7;

public class Quadratic {
    double a, b, c;

    public Quadratic(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Quadratic() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
    }
    public double equate() {
        double temp = b * b - 4.0 * a * c;
        if (temp > 0.0) {
            double r1 = (-b + Math.pow(temp, 0.5)) / (2.0 * a);
            double r2 = (-b - Math.pow(temp, 0.5)) / (2.0 * a);
            System.out.println("The roots are " + r1 + " and " + r2);
            if (r1 == r2) {
                System.out.print(" and same");
            }
        } else if (temp == 0.0) {
            double r1 = -b / (2.0 * a);
            System.out.println("The root is " + r1);
        } else {
            System.out.println("Roots are not real.");
        }
        return temp;
    }

    public static void main(String[] args) {
        Quadratic eq1 = new Quadratic(1, 2, -6);
        eq1.equate();
    }


}
