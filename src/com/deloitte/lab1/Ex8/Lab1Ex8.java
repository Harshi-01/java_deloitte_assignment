package com.deloitte.lab1.Ex8;

public class Lab1Ex8 {
	
	 public static void main(String[] args) {
	      
	        int num = 16; 
	        boolean result = checkNumber(num);
	        System.out.println(num + " is a power of two: " + result);
	    }
	 
	 public static boolean checkNumber(int n) {
	        if (n <= 0) 
	            return false;
	       
	        return (n & (n - 1)) == 0;
	    }


}
