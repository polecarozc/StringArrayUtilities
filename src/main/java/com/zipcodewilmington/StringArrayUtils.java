package com.zipcodewilmington;

import java.sql.Array;
import java.util.ArrayList;
import java.util.*;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        return array[array.length -1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return array[array.length -2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        boolean answer = false;
        for(int i = 0; i< array.length; i++){
            if(array[i] == value){
                answer = true;
            }
        }
        return answer;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    //(i, array[array.length-i-1]);
    public static String[] reverse(String[] array) {
        String[] reverseOrder = new String[array.length];
        for(int i = 0; i<array.length; i++){
            reverseOrder[i] = array[array.length-1-i];
        }

        return reverseOrder;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        boolean answer = false;
        for(int i = 0; i<array.length;i++){
            if(array[i] == array[array.length-1-i]){
                answer = true;
            }else{
                break;
            }
        }
        return answer;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        String temp = Arrays.toString(array);
        BitSet alpha = new BitSet(26);
        for(char ch : temp.toUpperCase().toCharArray()) {
            if (Character.isLetter(ch)) {
                alpha.set(ch - 65);
            }
        }
        if(alpha.cardinality() == 26){
            return true;
        }else{
            return false;
        }
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int count = 0;
        for(String s : array){
            if(s.contains(value)){
                count += 1;
            }
        }

        return count;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        ArrayList<String> replacementArray = new ArrayList<>(100);
        int i = 0;
        for(String s : array){
            if(!s.contains(valueToRemove)){
                replacementArray.add(array[i]);
            }
            i++;
        }
        return replacementArray.toArray(new String[0]);
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        ArrayList<String> replacementArray = new ArrayList<>();
        replacementArray.add(array[0]);

        for(int i = 1; i<array.length; i++){
            if(array[i-1] != array[i]){
                replacementArray.add(array[i]);
            }

        }
        return replacementArray.toArray(new String[0]);
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        ArrayList<String> replacementArray = new ArrayList<>();
        String temp = array[0];

        for(int i = 1; i<array.length; i++){

            if(array[i-1] == array[i]){
                temp = temp + array[i];
            }else{
                replacementArray.add(temp);
                temp = array[i];
            }
        }
        replacementArray.add(temp);
        return replacementArray.toArray(new String[0]);
    }
}
