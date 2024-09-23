package com.deloitte.lab6.Ex1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Lab6Ex1 {
	

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Moli", 48);
        map.put("Bali", 20);
        map.put("Charlie", 25);
        List<Integer> sortedValues = getValues(map);
        System.out.println("Sorted values: " + sortedValues);
    }
	 public static <K, V extends Comparable<V>> List<V> getValues(HashMap<K, V> map) {
	        List<V> values = new ArrayList<>(map.values());
	        Collections.sort(values);
	        
	        return values;
	    }


}
