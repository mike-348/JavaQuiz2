package com.zipcodewilmington.assessment2.part2;

import com.j256.ormlite.stmt.query.In;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayUtility {
    public Integer[] merge(Integer[] array1, Integer[] array2) {
//        return null;

//        Integer[] arrThree = new Integer[array1.length + array2.length];
//        for (int i = 0; i < array1.length; i++) {
//            arrThree[i] = array1[i];
//        }
//        int index = array1.length;
//        for (int i = 0; i < array2.length; i++) {
//            arrThree[i + index] = array2[i];
//        }
//        return arrThree;
        List<Integer> arrList = new ArrayList<>(Arrays.asList(array1));
        arrList.addAll(Arrays.asList(array2));
        return arrList.toArray(new Integer[0]);

    } //passed

    public Integer[] rotate(Integer[] array, Integer index) {
//        return null;
        ArrayList<Integer> arrList = new ArrayList<>();
        for (int i = index; i < array.length; i++) {
            arrList.add(array[i]);
        }
        for (int i = 0; i < index; i++) {
            arrList.add(array[i]);
        }
        return arrList.toArray(new Integer[0]);
    } //passed

    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {
//        return null;
        Integer[] array3 = merge(array1, array2);

        int result = 0;
        for (Integer i : array3) {
            if (i == valueToEvaluate) {
                result++;
            }
        }
        return result;
    } //passed

    public Integer mostCommon(Integer[] array) {
//        return null;
        int mode = array[0];
        int maxCount = 0;
        for (int i = 0; i < array.length; i++) {
            int value = array[i];
            int count = 1;
            for (int j = 0; j < array.length; j++) {
                if (array[j] == value) count++;
                if (count > maxCount) {
                    mode = value;
                    maxCount = count;
                }
            }
        }
        return mode;
    } //passed
}
