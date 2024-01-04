package com.kotenko;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
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

    public static boolean isPalindrome(int x) {
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

    public boolean check(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int curr = nums[left] + nums[right];
            if (curr == target) {
                return true;
            }
            if (curr > target) {
                right--;
            } else {
                left++;
            }
        }
        return false;
    }
}