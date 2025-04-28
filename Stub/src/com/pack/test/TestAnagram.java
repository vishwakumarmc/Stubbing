package com.pack.test;

import java.util.Arrays;

public class TestAnagram {
    public static void main(String[] args) {
        String s1 = "ABC";
        String s2 = "BAC";

        if (s1.length() == s2.length()) {
            char[] c1 = s1.toCharArray();
            char[] c2 = s2.toCharArray();

            Arrays.sort(c1);
            Arrays.sort(c2);

            boolean result = Arrays.equals(c1, c2);
            if (result) {
                System.out.println("Anagram");
            } else {
                System.out.println("Not Anagram");
            }
        }
        else {
            System.out.println("Not at all Anagram ");
        }
    }
}
