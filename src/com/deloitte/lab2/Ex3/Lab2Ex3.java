package com.deloitte.lab2.Ex3;

import java.util.Arrays;

public class Lab2Ex3 {
	
	  public static void main(String[] args) {
	        int[] nums = {123, 456, 789, 325};
	        int[] sortedReversed = getSorted(nums);
	        System.out.println(Arrays.toString(sortedReversed));
	    }

	  public static int[] getSorted(int[] arr) {
	        int[] reversedArray = new int[arr.length];
	        
	        for (int i = 0; i < arr.length; i++) {
	            String reversedString = new StringBuilder(String.valueOf(arr[i])).reverse().toString();
	            reversedArray[i] = Integer.parseInt(reversedString);
	        }
	
	        Arrays.sort(reversedArray);
	        
	        return reversedArray;
	    }
 
}
