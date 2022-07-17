package com.zipcodewilmington.assessment2.part1;

import java.util.ArrayList;
import java.util.List;

public class IntegerArrayUtilities {
    public Boolean hasEvenLength(Integer[] array) {
//        return null;
        return array.length % 2 == 0;
    } //passed

    public Integer[] range(int start, int stop) {
//        return null;
        Integer[] intArr = new Integer[stop - start + 1];
        int index = 0;
        for (int i = start; i <= stop; i++) {
            intArr[index] = i;
            index++;
        }
        return intArr;
    } //passed

    public Integer getSumOfFirstTwo(Integer[] array) {
//        return null;
        return array[0] + array[1];
    } //passed

    public Integer getProductOfFirstTwo(Integer[] array) {
        return null;
    } //passed
}
