package com.assignment2.q9;

public class Palindrome {
    public static void checkPalindrome(int num) {
        int r;  //reminder
        int sum = 0;
        int tmp = num;

        while (num > 0) {
            r = num % 10;
            sum = (sum * 10) + r;
            num /= 10;
        }
        if (tmp == sum) System.out.println("Hooray! " + tmp + " is a Palindrome number.");
        else System.out.println(tmp + " ain't no Palindrome");
    }

    public static void main(String[] args) {
        checkPalindrome(585);
    }
}
