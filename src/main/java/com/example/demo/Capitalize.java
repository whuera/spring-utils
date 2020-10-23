package com.example.demo;

public class Capitalize {

    public static String capitalize(String s) {
        if (s.length() == 0) return s;
        return s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase();
    }

    public static void main(String[] args) {
        System.out.println(GenerateCapitalizeKey("OBTEN TU MISTERIOSO REGALO"));

    }

    public static String GenerateCapitalizeKey(String texToCapitalize) {
        StringBuilder sbf = new StringBuilder();
        String[] words = texToCapitalize.split("\\s");
        for (String s : words) {
            sbf.append((capitalize(s) + " "));
        }
        String textToReturn = sbf.toString();
        return textToReturn;
    }

}