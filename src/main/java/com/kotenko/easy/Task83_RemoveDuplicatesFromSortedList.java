package com.kotenko.easy;

//https://leetcode.com/problems/remove-duplicates-from-sorted-list/
public class Task83_RemoveDuplicatesFromSortedList {
    class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        while (current != null && current.next != null) {
            if (current.val == current.next.val) {
                current.next = current.next.next; // Skip the duplicate node
            } else {
                current = current.next; // Move to the next node
            }
        }
        return head;
    }

    public static void main(String[] args) {
    }
}