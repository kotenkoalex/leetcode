package com.kotenko.easy;

import java.util.ArrayList;
import java.util.Collections;

//https://leetcode.com/problems/palindrome-number/
public class Task9_PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindromeNumberAttempt1(121));
        System.out.println(isPalindromeNumberAttempt1(-121));
        System.out.println(isPalindromeNumberAttempt1(10));

        System.out.println(isPalindromeNumberAttempt2(121));
        System.out.println(isPalindromeNumberAttempt2(-121));
        System.out.println(isPalindromeNumberAttempt2(10));
    }

    //version 1, not the best, because not follow requirements + had limits based on int range:
    //Follow up: Could you solve it without converting the integer to a string?
    public static boolean isPalindromeNumberAttempt1(int x) {
        if (x < 0) {
            return false;
        }
        return x == Integer.parseInt(new StringBuilder(String.valueOf(x)).reverse().toString());
    }

    //version 2, followed of requirements, but runtime 18%, memory 8%
    public static boolean isPalindromeNumberAttempt2(int x) {
        if (x < 0) {
            return false;
        }
        ArrayList<Integer> digits = new ArrayList<>();
        boolean condition = true;
        while (condition) {
            if (x > 0) {
                digits.add(x % 10);
                x = x / 10;
            } else {
                condition = false;
            }
        }
        ArrayList<Integer> reversed = new ArrayList<>(digits);
        Collections.reverse(reversed);
        return digits.equals(reversed);
    }

    public static boolean isPalindromeNumberAttempt3(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int reversed = 0;
        while (x > reversed) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;
        }
        return x == reversed || x == reversed / 10;
    }
}
