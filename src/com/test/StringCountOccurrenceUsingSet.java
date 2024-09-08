package com.test;

import java.util.HashSet;
import java.util.Set;

public class StringCountOccurrenceUsingSet {

    public static void main(String [] args) {
        String st = "dhiru";
        countOccurrence(st);
    }

    public static void countOccurrence(String input) {
        String str = input.trim();
        char[] arr = str.toCharArray();
        Set<Character> charSet = new HashSet<>();
        for(char c: arr) {
            charSet.add(c);
        }
        for(char c: charSet) {
           long count =  str.chars().filter(ch-> ch==c).count();
           System.out.println(c+" is = "+count);
        }

    }

}
