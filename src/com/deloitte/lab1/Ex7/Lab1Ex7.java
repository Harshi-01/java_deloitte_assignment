package com.deloitte.lab1.Ex7;

public class Lab1Ex7 {

	    public static void main(String[] args) {
	      
	        int num = 12399;
	        boolean result = checkNumber(num);
	        System.out.println(num + " is an increasing number: " + result);
	    }
	    
	    public static boolean checkNumber(int number) {
	    	
	        String numstr = String.valueOf(number);
	        
	        for (int i = 1; i < numstr.length(); i++) {
	            if (numstr.charAt(i) < numstr.charAt(i - 1)) 
	                return false;  
	        }
	        return true;
	    }

}
