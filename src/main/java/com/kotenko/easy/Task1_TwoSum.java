package com.kotenko.easy;

import java.util.Arrays;

//https://leetcode.com/problems/two-sum/description/
public class Task1_TwoSum {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSumV1(new int[]{2, 7, 11, 15}, 22)));
    }

    //version 1, complexity: O(n^2), because of nested loop
    public static int[] twoSumV1(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int firstNumber = nums[i];
            result[0] = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (firstNumber + nums[j] == target) {
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }

    //version 2, complexity: O(n), idea: create hash table number:index
    public static int[] twoSumV2(int[] nums, int target) {
        return null;
    }
}
