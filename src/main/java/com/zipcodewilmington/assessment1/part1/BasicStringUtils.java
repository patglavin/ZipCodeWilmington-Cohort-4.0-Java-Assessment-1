package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {
        return (str.substring(0,1).toUpperCase() + str.substring(1, str.length()));
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {
        StringBuilder reversed = new StringBuilder();
        String[] characters = str.split("");
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(characters[i]);
        }
        return reversed.toString();
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {
        StringBuilder reversed = new StringBuilder();
        String[] characters = str.split("");
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(characters[i]);
        }
        return (reversed.toString().substring(0, 1).toUpperCase() + reversed.toString().substring(1, reversed.length()));
    }


    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {
        return str.substring(1, str.length()-1);
    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {
        StringBuilder flippedCase = new StringBuilder();
        String[] preFlipped = str.split("");
        for (String character:preFlipped) {
            if (character.equals(character.toUpperCase())){
                flippedCase.append(character.toLowerCase());
            } else {
                flippedCase.append(character.toUpperCase());
            }
        }
        return flippedCase.toString();
    }
}
