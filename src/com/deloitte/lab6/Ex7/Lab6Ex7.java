package com.deloitte.lab6.Ex7;

import java.util.Arrays;
import java.util.Collections;
public class Lab6Ex7 {
	  
	   public static void main(String[] args) {
	        int[] nums = {123, 456, 789, 234};
	        int[] arr = getSorted(nums);

	        System.out.println("Sorted array after reversing: " + Arrays.toString(arr));
	    }
	  public static int[] getSorted(int[] arr) {
	        String[] reversedStrings = new String[arr.length];
	        for (int i = 0; i < arr.length; i++) {
	            reversedStrings[i] = new StringBuilder(String.valueOf(arr[i])).reverse().toString();
	        }

	        Integer[] reversedIntegers = new Integer[arr.length];
	        for (int i = 0; i < arr.length; i++) {
	            reversedIntegers[i] = Integer.parseInt(reversedStrings[i]);
	        }
	        Arrays.sort(reversedIntegers);

	        int[] res = new int[reversedIntegers.length];
	        for (int i = 0; i < reversedIntegers.length; i++) {
	            res[i] = reversedIntegers[i];
	        }

	        return res;
	    }

	 

}
