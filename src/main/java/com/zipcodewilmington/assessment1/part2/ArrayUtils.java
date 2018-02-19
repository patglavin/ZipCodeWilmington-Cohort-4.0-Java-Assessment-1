package com.zipcodewilmington.assessment1.part2;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by leon on 2/16/18.
 */
public class ArrayUtils {
    /**
     * @param objectArray   an array of any type of Object
     * @param objectToCount any non-primitive value
     * @return the number of times the specified `value` occurs in the specified `objectArray`
     * Given an array of objects, named `objectArray`, and an object `objectToCount`, return the number of times the `objectToCount` appears in the `objectArray`
     */
    public static Integer getNumberOfOccurrences(Object[] objectArray, Object objectToCount) {
        Integer counter = 0;
        for (Object object : objectArray){
            if (object.equals(objectToCount)){
                counter++;
            }
        }
        return counter;
    }

    /**
     * @param objectArray    an array of any type of Object
     * @param objectToRemove a value to be removed from the `objectArray`
     * @return an array with identical content excluding the specified `objectToRemove`
     * Given an array of objects, name `objectArray`, and an object `objectToRemove`, return an array of objects with identical contents excluding `objectToRemove`
     */
    public static Integer[] removeValue(Object[] objectArray, Object objectToRemove) {
        ArrayList<Object> objectArrayList = new ArrayList<>();
        for (int i = 0; i < objectArray.length; i++){
            if (!objectArray[i].equals(objectToRemove)){
                objectArrayList.add(objectArray[i]);
            }
        }
        System.out.println(objectArrayList.size());
        Integer[] answerArray = new Integer[objectArrayList.size()];
        for (int j = 0; j < objectArrayList.size(); j++){
            answerArray[j] = Integer.parseInt(objectArrayList.get(j).toString());
        }
        return answerArray;
    }

    /**
     * @param objectArray an array of any type of Object
     * @return the most frequently occurring object in the array
     * given an array of objects, named `objectArray` return the most frequently occuring object in the array
     */
    public static Object getMostCommon(Object[] objectArray) {
        int dupeCount = 0;
        int biggestDupe = 1;
        Object mostCommon = objectArray[0];
        for (Object currentObject : objectArray){
            for (int i = 1; i < objectArray.length; i++){
                if (currentObject.equals(objectArray[i])){
                    dupeCount++;
                }
            }
            if (dupeCount > biggestDupe){
                mostCommon = currentObject;
            }
            dupeCount = 0;
        }
        return mostCommon;
    }


    /**
     * @param objectArray an array of any type of Object
     * @return the least frequently occurring object in the array
     * given an array of objects, named `objectArray` return the least frequently occuring object in the array
     */
    public static Object getLeastCommon(Object[] objectArray) {
        int dupeCount = 0;
        int smallestDupe = 2;
        Object leastCommon = objectArray[0];
        for (Object currentObject : objectArray){
            for (int i = 1; i < objectArray.length; i++){
                if (currentObject.equals(objectArray[i])){
                    dupeCount++;
                }
            }
            if (dupeCount < smallestDupe){
                leastCommon = currentObject;
            }
            dupeCount = 0;
        }
        return leastCommon;
    }

    /**
     * @param objectArray      an array of any type of Object
     * @param objectArrayToAdd an array of Objects to add to the first argument
     * @return an array containing all elements in `objectArray` and `objectArrayToAdd`
     * given two arrays `objectArray` and `objectArrayToAdd`, return an array containing all elements in `objectArray` and `objectArrayToAdd`
     */
    public static Integer[] mergeArrays(Object[] objectArray, Object[] objectArrayToAdd) {
        ArrayList<Object> objectArrayList = new ArrayList<>();
        for (Object currentObject : objectArray){
            objectArrayList.add(currentObject);
        }
        for (Object currentObject : objectArrayToAdd){
            objectArrayList.add(currentObject);
        }
        Integer[] answerArray = new Integer[objectArrayList.size()];
        for (int j = 0; j < objectArrayList.size(); j++){
            answerArray[j] = Integer.parseInt(objectArrayList.get(j).toString());
        }
        return answerArray;
    }
}
