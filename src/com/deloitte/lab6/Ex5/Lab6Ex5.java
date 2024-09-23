package com.deloitte.lab6.Ex5;

public class Lab6Ex5 {
	
	public static void main(String[] args) {
        int[] numbers = {7, 9, 77, 31, 1, 8, };
        int secondSmallest = getSecondSmallest(numbers);
        
        if (secondSmallest != -1) {
            System.out.println("The second smallest element is: " + secondSmallest);
        } else {
            System.out.println("No second smallest element found.");
        }
    }
	
	 public static int getSecondSmallest(int[] arr) {
	        if (arr.length < 2) {
	            return -1;
	        }
	        for (int i = 0; i < arr.length - 1; i++) {
	            for (int j = 0; j < arr.length - i - 1; j++) {
	                if (arr[j] > arr[j + 1]) {
	                    int temp = arr[j];
	                    arr[j] = arr[j + 1];
	                    arr[j + 1] = temp;
	                }
	            }
	        }

	        int firstSmallest = arr[0];
	        for (int i = 1; i < arr.length; i++) {
	            if (arr[i] != firstSmallest) {
	                return arr[i];
	            }
	        }

	        return -1;
	    }

	    
}
