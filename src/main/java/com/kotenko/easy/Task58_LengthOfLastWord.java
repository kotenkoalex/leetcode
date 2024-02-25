package com.kotenko.easy;

//https://leetcode.com/problems/length-of-last-word/
public class Task58_LengthOfLastWord {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Hello World"));
    }

    public static int lengthOfLastWord(String s) {
        s = s.trim();
        int lastSpaceIndex = s.lastIndexOf(' ');
        String lastWord = s.substring(lastSpaceIndex + 1);
        return lastWord.length();
    }
}