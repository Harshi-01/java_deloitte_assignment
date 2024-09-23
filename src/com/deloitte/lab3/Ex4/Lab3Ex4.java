package com.deloitte.lab3.Ex4;

public class Lab3Ex4 {
	
	  
    public static void main(String[] args) {

        int input = 2987;
        int result = modifyNumber(input);
        System.out.println("Input: " + input);
        System.out.println("Output: " + result);
    }

	 public static int modifyNumber(int number) {
	        String numberStr = String.valueOf(number);
	        StringBuilder modifiedNumber = new StringBuilder();

	        for (int i = 0; i < numberStr.length(); i++) {
	            if (i == numberStr.length() - 1) {
	                modifiedNumber.append(numberStr.charAt(i));
	            } else {
	                int currentDigit = Character.getNumericValue(numberStr.charAt(i));
	                int nextDigit = Character.getNumericValue(numberStr.charAt(i + 1));
	                int difference = Math.abs(currentDigit - nextDigit);
	                modifiedNumber.append(difference);
	            }
	        }
	        return Integer.parseInt(modifiedNumber.toString());
	    }

	  
}
