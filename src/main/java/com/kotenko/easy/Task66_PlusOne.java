package com.kotenko.easy;

import java.util.Arrays;

//https://leetcode.com/problems/plus-one/
public class Task66_PlusOne {
    public static int[] plusOne(int[] digits) {
        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
            digits[i]++;
            if (digits[i] == 10) {
                digits[i] = 0;
            } else {
                break;
            }
        }
        if (digits[0] == 0) {
            int[] result = new int[n + 1];
            result[0] = 1;
            return result;
        }
        return digits;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(plusOne(new int[]{1, 2, 3})));
    }
}
