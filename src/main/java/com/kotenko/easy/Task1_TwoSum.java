package com.kotenko.easy;

import java.util.Arrays;

//https://leetcode.com/problems/two-sum/description/
public class Task1_TwoSum {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));
    }

    public static int[] twoSum(int[] nums, int target) {
        int potential;
        int targetFirst = 0;
        int targetSecond = 0;

        for (int element = 0; element < nums.length; element++) {
            potential = target - nums[element];

            for (int i = element + 1; i < nums.length; i++) {
                if (potential == nums[i]) {
                    targetFirst = element;
                    targetSecond = i;
                }
            }
        }
        return new int[]{targetFirst, targetSecond};
    }
}
