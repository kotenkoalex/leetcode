package com.kotenko.easy;

//https://leetcode.com/problems/remove-duplicates-from-sorted-array/
public class Task26_RemoveDuplicatesFromSortedArray {
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int uniqueCount = 1;
        int currentIndex = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[currentIndex] = nums[i];
                currentIndex++;
                uniqueCount++;
            }
        }
        return uniqueCount;
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{1, 1, 2}));
    }
}
