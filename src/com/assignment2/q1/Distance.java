package com.assignment2.q1;

public class Distance {
    int inch, feet;

    public Distance(int feet, int inch) {

        if (inch >= 12 || inch < 0)
            throw new ArithmeticException("Inches can't be " + inch + ". It can't be less then 0 or greater then 11.");
        this.inch = inch;
        this.feet = feet;
    }

    public static Distance distanceAdd(Distance d1, Distance d2) {
        int totalInch = d1.inch + d2.inch;
        int totalFeet = d1.feet + d2.feet;

        if (totalInch >= 12) {
            totalFeet++;
            totalInch %= 12;
        }

        return new Distance(totalFeet, totalInch);
    }

    public static void showDistance(Distance distance) {
        System.out.println("Feet : " + distance.feet + ", inches : " + distance.inch);
    }

    public static void main(String[] args) {

        try {
            Distance d1 = new Distance(25, 88);
            Distance d2 = new Distance(25, 8);
            Distance d3 = distanceAdd(d1, d2);
            showDistance(d3);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
