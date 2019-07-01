package com.stackroute.pe3;

public class ConsecutiveNumbers
{
    String result = "";

    public String checkConsecutive(String values) {
        String[] array = values.split(",");
        if(array.length>2) {
            for (int i = 0; i < array.length - 1; i++) {
                int difference = Integer.parseInt(array[i + 1]) - Integer.parseInt(array[i]);
                if (difference == 1 || difference == -1) {
                    result = "Consecutive";
                } else {
                    result = "Non-Consecutive";
                    break;
                }
            }
        }
        else
        {
            return "NotApplicable";
        }
        return result;
    }
}
