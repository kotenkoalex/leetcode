package com.kotenko.easy;

//https://leetcode.com/problems/sqrtx/
public class Task69_Sqrt {
    public static int mySqrt(int x) {
        if (x == 0 || x == 1) {
            return x;
        }
        long left = 1;
        long right = x;
        while (left <= right) {
            long mid = left + (right - left) / 2;
            if (mid * mid == x) {
                return (int) mid;
            } else if (mid * mid < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return (int) right;
    }

    public static void main(String[] args) {
        System.out.println(mySqrt(4));
    }
}