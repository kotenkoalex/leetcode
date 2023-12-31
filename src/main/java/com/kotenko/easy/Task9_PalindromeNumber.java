package com.kotenko.easy;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//https://leetcode.com/problems/palindrome-number/
public class Task9_PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindromeNumberV1(101));
    }

    //version 1, complexity: O(n), because
    public static boolean isPalindromeNumberV1(int x) {
        String[] number = Integer.toString(x).split("");
        if (number.length == 1) {
            return true;
        } else if (number.length % 2 == 0) {
            List<String> firstHalf = Arrays.asList(Arrays.copyOfRange(number, 0, number.length / 2));
            List<String> secondHalfReversed = Arrays.asList(Arrays.copyOfRange(number, number.length / 2, number.length));
            Collections.reverse(secondHalfReversed);
            return firstHalf.equals(secondHalfReversed);
        } else {
            List<String> firstHalf = Arrays.asList(Arrays.copyOfRange(number, 0, number.length / 2));
            List<String> secondHalfReversed = Arrays.asList(Arrays.copyOfRange(number, number.length / 2 + 1, number.length));
            Collections.reverse(secondHalfReversed);
            return firstHalf.equals(secondHalfReversed);
        }
    }

    //version 2, complexity: , idea:
    public static boolean isPalindromeNumberV2(int x) {
        return false;
    }
}
