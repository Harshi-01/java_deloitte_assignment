package com.deloitte.lab6.Ex3;

import java.util.HashMap;
import java.util.Map;

public class Lab6Ex3 {
	
	  public static void main(String[] args) {
	        int[] nums = {1, 7, 3, 9, 5};
	        Map<Integer, Integer> squares = getSquares(nums);
	        for (Map.Entry<Integer, Integer> entry : squares.entrySet()) {
	            System.out.println("Number:" + entry.getKey() + " Square:" + entry.getValue());
	        }
	    }
	
	public static Map<Integer, Integer> getSquares(int[] numbers) {
        Map<Integer, Integer> sqsMap = new HashMap<>();
        
        for (int number : numbers) {
            sqsMap.put(number, number * number);
        }
        
        return sqsMap;
    }

}
