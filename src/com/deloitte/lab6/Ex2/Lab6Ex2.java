package com.deloitte.lab6.Ex2;

import java.util.HashMap;
import java.util.Map;

public class Lab6Ex2 {
	
	public static void main(String[] args) {
        char[] chars = {'a', 'b', 'c', 'a', 'b', 'a', 'd','k'};
        Map<Character, Integer> counts = countChars(chars);
        for (Map.Entry<Character, Integer> entry : counts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

	  public static Map<Character, Integer> countChars(char[] arr) {
	        Map<Character, Integer> charCountMap = new HashMap<>();
	        
	        for (char ch : arr) {
	            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
	        }
	        
	        return charCountMap;
	    }	    
}
