package edu.ntnu.idatt2003.lectures.hashmap;

import java.util.*;

/**
 * App.java - "Programmering i Java", 4.utgave - 2009-07-01
 * <p>
 * Klasse som inneholder main-metoden for applikasjonen.
 */
public class App2 {
    public static void main(String[] args) {
        App2 arrayListVsHashMap = new App2();
        arrayListVsHashMap.proceed();
    }

    /**
     * Compare the performance of ArrayList and HashMap
     * when searching for an element.
     *      
     */
    private void proceed() {
        String searchString = "Four";
        long startTime;
        long endTime;
        int loopCount = 100000000;
        boolean contains = false;

        List<String> arrayList = new ArrayList<>();

        arrayList.add("One");
        arrayList.add("Two");
        arrayList.add("Three");
        arrayList.add("Four");
        arrayList.add("Five");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < loopCount; i++) {
            contains = arrayList.contains(searchString);            
        }
        endTime = System.currentTimeMillis();
        System.out.println("Total time for ArrayList: " + (endTime - startTime));

        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("One","One");
		hashMap.put("Two","Two");
		hashMap.put("Three","Three");
		hashMap.put("Four","Four");
		hashMap.put("Five","Five");
        
        startTime = System.currentTimeMillis();
        for (int i = 0; i < loopCount; i++) {
            contains = hashMap.containsKey(searchString);

        }

        endTime = System.currentTimeMillis();
        System.out.println("Total time for HashMap: " + (endTime - startTime));
    }
}