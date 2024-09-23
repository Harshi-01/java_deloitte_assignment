package com.deloitte.lab2.Ex1;

public class Lab2Ex1 {
	
	public static void main(String[] args) {
    	int[] arr = {7, 3, 5, 1, 9, 3,2};
    	int secondSmallest = getSecondSmallest(arr);
    	System.out.println("The second smallest element is: " + secondSmallest);
    }
	
	public static int getSecondSmallest(int[] arr) {
		if (arr.length < 2) {
			throw new IllegalArgumentException("Array must have at least two elements");
		}
   	 	int smallest = Integer.MAX_VALUE;
    	int secondSmallest = Integer.MAX_VALUE;
    	for (int num : arr) {
       
    		if (num < smallest) {
    			secondSmallest = smallest; 
    			smallest = num;
    		}
    		else if (num < secondSmallest && num != smallest) {
    			secondSmallest = num; // update second smallest
    		}
    	}
    		return secondSmallest;
    		
    }


}

	
