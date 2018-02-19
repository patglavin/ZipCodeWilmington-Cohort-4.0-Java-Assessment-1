package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class IntegerArrayUtils {
    /**
     * @param intArray an array of integers
     * @return the sum of `intArray`
     */
    public static Integer getSum(Integer[] intArray) {
        int answer = 0;
        for (Integer number : intArray){
            answer += number;
        }
        return answer;
    }

    /**
     * @param intArray an array of integers
     * @return the product of `intArray`
     */
    public static Integer getProduct(Integer[] intArray) {
        int answer = 1;
        for (Integer number : intArray){
            answer *= number;
        }
        return answer;
    }

    /**
     * @param intArray an array of integers
     * @return the sum of `intArray` divided by number of elements in `intArray`
     */
    public static Double getAverage(Integer[] intArray) {
        Double answer = 0.0;
        for (Integer number : intArray){
            answer += number;
        }
        return answer/intArray.length;
    }
}
