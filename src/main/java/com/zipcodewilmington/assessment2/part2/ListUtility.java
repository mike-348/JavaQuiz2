package com.zipcodewilmington.assessment2.part2;

import com.zipcodewilmington.assessment2.part1.IntegerArrayUtilities;

import java.util.*;

public class ListUtility {

    List<Integer> newList = new ArrayList<>();
    public Boolean add(Integer i) {
//        return null;
        newList.add(i);
        return newList.contains(i);
    } //passed

    public Integer size() {
//        return null;
        return newList.size();
    } //passed

    public List<Integer> getUnique() {
//        return null;
        Set<Integer> newSet = new HashSet<>();
        newSet.addAll(newList);
        List<Integer> result = new ArrayList<>(newSet);
        return result;
    } //passed

    public String join() {
//        return null;
        List<String> stringList = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (Integer i : newList) {
            sb.append(i + ", ");
        }
        String str = sb.substring(0, sb.length()-2);
        return str;
    }

    public Integer mostCommon() {
//        return null;
        int most = newList.get(0);
        int count = 0;
        for (int i = 0; i < newList.size(); i++) {
            int cnt = 0;
            for (int j = i+1; j<newList.size(); j++) {
                if (newList.get(i).equals(newList.get(j))) {
                    cnt++;
                }
                if (count < cnt) {
                    most = newList.get(i);
                    count = cnt;
                }
            }
        }
        return most;
    } //passed

    public Boolean contains(Integer valueToAdd) {
//        return null;
        return newList.contains(valueToAdd);
    }
}
