package com.deloitte.lab2.Ex2;

import java.util.Arrays;

public class Lab2Ex2 {
	
	public static void main(String[] args) {
        String[] arr = {"banana", "Apple", "orange", "grape", "pear","mangO","Guava"};
        String[] sortedStrings = sortStrings(arr);

        System.out.println(Arrays.toString(sortedStrings));
    }
	
	 public static String[] sortStrings(String[] arr) {
	        
	        Arrays.sort(arr);
	        int n = arr.length;
	        int mid = (n + 1) / 2; 
	       
	        String[] res = new String[n];
	        
	        for (int i = 0; i < n; i++) {
	            if (i < mid) {
	                res[i] = arr[i].toUpperCase();
	            } else {
	                res[i] = arr[i].toLowerCase();
	            }
	        }
	        
	        return res;
	    }

	    

}
