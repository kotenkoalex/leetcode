package com.kotenko.easy;

//https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/
public class Task108_ConvertSortedArrayToBinarySearchTree {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
        public TreeNode sortedArrayToBST(int[] nums) {
            if (nums == null || nums.length == 0) {
                return null;
            }
            return constructBST(nums, 0, nums.length - 1);
        }
        private TreeNode constructBST(int[] nums, int left, int right) {
            if (left > right) {
                return null;
            }
            int mid = left + (right - left) / 2;
            TreeNode node = new TreeNode(nums[mid]);
            node.left = constructBST(nums, left, mid - 1);
            node.right = constructBST(nums, mid + 1, right);
            return node;
        }

    public static void main(String[] args) {

    }
}
