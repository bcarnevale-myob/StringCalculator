package com.company;

public class StringCalculator {

    public int add(String s) {

        if (s.length() == 0) {
            return 0;
        }

        String[] tokens;
        String delimiter = ",|\n";
        String expressionBody = s;
        if (s.charAt(0) == '/') {
            delimiter = String.valueOf(s.charAt(2));
            expressionBody = s.substring(s.indexOf("\n"));
        }

        tokens = expressionBody.trim().split(delimiter);

        int result = 0;
        for (String token : tokens) {
            result += Integer.parseInt(token);
        }

        return result;
    }

}


