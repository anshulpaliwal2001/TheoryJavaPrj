package com.assignment2.q2;

public class Time {
    int hrs, min, sec;

    public Time(int hrs, int min, int sec) {
        this.hrs = hrs;
        this.min = min;
        this.sec = sec;
    }


    public static Time addTime(Time t1, Time t2) {

        int totalHours = t1.hrs + t2.hrs;
        int totalMin = t1.min + t2.min;
        int totalSec = t1.sec + t2.sec;

        if (totalSec >= 60) {
            totalMin++;
            totalSec %= 60;
        }
        if (totalMin >= 60) {
            totalHours++;
            totalMin %= 60;
        }
        return new Time(totalHours, totalMin, totalSec);
    }

    public static void showDate(String addOn, Time time) {
        System.out.println(addOn + time.hrs + " : " + time.min + " : " + time.sec);
    }

    public static void main(String[] args) {
        Time t1 = new Time(25, 40, 20);
        Time.showDate("t1 : ", t1);
        Time t2 = new Time(5, 59, 58);
        Time.showDate("t2 : ", t2);

        Time.showDate("Sum : ", Time.addTime(t1, t2));
    }
}
