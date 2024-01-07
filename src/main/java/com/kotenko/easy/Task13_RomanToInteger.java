package com.kotenko.easy;

import java.util.HashMap;
import java.util.Map;

public class Task13_RomanToInteger {
    private static final Map<String, Integer> ONE_LETTER_SET = new HashMap<>();

    static {
        ONE_LETTER_SET.put("I", 1);
        ONE_LETTER_SET.put("V", 5);
        ONE_LETTER_SET.put("X", 10);
        ONE_LETTER_SET.put("L", 50);
        ONE_LETTER_SET.put("C", 100);
        ONE_LETTER_SET.put("D", 500);
        ONE_LETTER_SET.put("M", 1000);
    }

    private static final Map<String, Integer> TWO_LETTER_SET = new HashMap<>();

    static {
        TWO_LETTER_SET.put("IV", 4);
        TWO_LETTER_SET.put("IX", 9);
        TWO_LETTER_SET.put("XL", 40);
        TWO_LETTER_SET.put("XC", 90);
        TWO_LETTER_SET.put("CD", 400);
        TWO_LETTER_SET.put("CM", 900);
    }

    public static void main(String[] args) {
        System.out.println(extracted("III"));
        System.out.println(extracted("LVIII"));
        System.out.println(extracted("MCMXCIV")); //doesn't work
    }

    private static Integer extracted(String number) {
        Integer result;
        if (number.length() == 1) {
            return ONE_LETTER_SET.get(number);
        } else if (number.length() == 2) {
            result = TWO_LETTER_SET.get(number);
            return result != null ? result : ONE_LETTER_SET.get(number.substring(0, 1)) + ONE_LETTER_SET.get(number.substring(1));
        } else {
            result = TWO_LETTER_SET.get(number.substring(0, 2));
            if (result != null) {
                String rest = number.substring(2);
                for (int i = 0; i < rest.length(); i++) {
                    result += ONE_LETTER_SET.get(rest.substring(i, i + 1));
                }
            } else {
                result = 0;
                for (int i = 0; i < number.length(); i++) {
                    result += ONE_LETTER_SET.get(number.substring(i, i + 1));
                }
            }
            return result;
        }
    }
}
