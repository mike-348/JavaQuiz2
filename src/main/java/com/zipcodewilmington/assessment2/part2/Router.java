package com.zipcodewilmington.assessment2.part2;


import java.security.Key;
import java.util.HashMap;
import java.util.Map;

public class Router {

    Map<String,String> router = new HashMap<>();
    public void add(String path, String controller) {
        router.put(path, controller);
    } //passed

    public Integer size() {
//        return null;
        return router.size();
    } //passed

    public String getController(String path) {
//        return null;
        return router.get(path);
    } //passed

    public void update(String path, String studentController) {
        router.put(path, studentController);
    }

    public void remove(String path) {
        router.remove(path);
    }

//    @Override
//    public String toString() {
//        StringBuilder sb = new StringBuilder();
//        for (Map.Entry<String, String> entry : router.entrySet()) {
//            sb.append(entry.getKey()).append(entry.getValue()).append("\n");
//        }
//        return String.valueOf(sb);
//    }
}
