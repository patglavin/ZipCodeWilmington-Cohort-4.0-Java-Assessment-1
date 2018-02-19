package com.zipcodewilmington.assessment1.part2;

import java.util.ArrayList;

/**
 * Created by leon on 2/16/18.
 */
public class MultiplesDeleter {
    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 2
     * given an array of integers, named `ints` return an identical array with evens removed
     */
    public Integer[] deleteEvens(Integer[] ints) {
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        for (Integer number : ints){
            if (number % 2 == 1){
                integerArrayList.add(number);
            }
        }
        Integer[] answerArray = new Integer[integerArrayList.size()];
        for (int i = 0; i < answerArray.length; i++){
            answerArray[i] = integerArrayList.get(i);
        }
        return answerArray;
    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are divisible by 2
     * given an array of integers, named `ints` return an identical array with odds removed
     */
    public Integer[] deleteOdds(Integer[] ints) {
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        for (Integer number : ints){
            if (number % 2 == 0){
                integerArrayList.add(number);
            }
        }
        Integer[] answerArray = new Integer[integerArrayList.size()];
        for (int i = 0; i < answerArray.length; i++){
            answerArray[i] = integerArrayList.get(i);
        }
        return answerArray;
    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 3
     * given an array of integers, named `ints` return an identical array with numbers indivisible by 3 removed
     */
    public Integer[] deleteMultiplesOf3(Integer[] ints) {
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        for (Integer number : ints){
            if (number % 3 != 0){
                integerArrayList.add(number);
            }
        }
        Integer[] answerArray = new Integer[integerArrayList.size()];
        for (int i = 0; i < answerArray.length; i++){
            answerArray[i] = integerArrayList.get(i);
        }
        return answerArray;
    }

    /**
     * @param ints array of Integer objects
     * @param multiple the multiple to evaluate divisibility against
     * @return all ints which are not divisible by the `multiple` specified
     * given an array of integers, named `ints` return an identical array with numbers indivisible by `multiple` removed
     */
    public Integer[] deleteMultiplesOfN(Integer[] ints, int multiple) {
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        for (Integer number : ints){
            if (number % multiple != 0){
                integerArrayList.add(number);
            }
        }
        Integer[] answerArray = new Integer[integerArrayList.size()];
        for (int i = 0; i < answerArray.length; i++){
            answerArray[i] = integerArrayList.get(i);
        }
        return answerArray;
    }
}
