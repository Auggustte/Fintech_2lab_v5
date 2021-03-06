package com.example.fintech_2lab;

import java.util.Objects;

public class counter {

    public static int getWordsCount(String input){
        input = input.trim();if(Objects.equals(input, ""))
        {
            return 0;
        }
        String[] parts = counter.SplitString(input);
        return parts.length;
    }
    public static String[] SplitString(String _stringToSplit)
    {
        return _stringToSplit.split(" ");
    }
    public static int getCharsNoSpaceCount(String input) {
        int charCount = 0;
        String[] parts = counter.SplitString(input);
        for (int i = 0; i < parts.length; i++)
        {
            charCount += parts[i].trim().length();
        }
        return charCount;
    }
    public static int getWordsAndSpace(String input){
        return input.length();
    }
}
