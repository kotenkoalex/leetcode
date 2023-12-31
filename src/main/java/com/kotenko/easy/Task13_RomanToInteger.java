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
//        System.out.println(extracted("III"));
//        System.out.println(extracted("LVIII"));
        System.out.println(extracted("MCMXCIV")); //doesn't work
    }

    private static Integer extracted(String number) {
        Integer result = 0;
        if (number.length() == 1) {
            return ONE_LETTER_SET.get(number);
        } else if (number.length() == 2) {
            result = TWO_LETTER_SET.get(number);
            return result != null ? result : ONE_LETTER_SET.get(number.substring(0, 1)) + ONE_LETTER_SET.get(number.substring(1));
        } else {

            int index = 0;
            boolean twoPossible = true;
            while (twoPossible) {
                Integer value;
                if (index < number.length()) {
                    value = TWO_LETTER_SET.get(number.substring(index, index + 2));
                    if (value != null) {
                        result += value;
                        index += 2;
                    } else {
                        twoPossible = false;
                    }
                } else {
                    twoPossible = false;
                }
            }

            boolean onePossible = true;
            while (onePossible) {
                Integer value;
                if (index < number.length()) {
                    value = ONE_LETTER_SET.get(number.substring(index, index + 1));
                    if (value != null) {
                        result += value;
                        index += 1;
                    } else {
                        onePossible = false;
                    }
                } else {
                    onePossible = false;
                }
            }
            return result;
        }
    }
}
