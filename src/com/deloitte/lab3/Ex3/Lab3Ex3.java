package com.deloitte.lab3.Ex3;

public class Lab3Ex3 {
	  
	   
	    private boolean isConsonant(char ch) {
	        ch = Character.toLowerCase(ch);
	        return ch >= 'a' && ch <= 'z' && "aeiou".indexOf(ch) == -1;
	    }

	   
	    public static void main(String[] args) {
	       Lab3Ex3 cr = new Lab3Ex3();
	        String input = "JAVA";
	        String result = cr.alterString(input);
	        System.out.println("Input: " + input);
	        System.out.println("Output: " + result);
	    }
	    
	    public String alterString(String input) {
	        StringBuilder alteredString = new StringBuilder();

	        for (char ch : input.toCharArray()) {
	            if (Character.isLetter(ch)) {

	                if (isConsonant(ch)) {
	              
	                    char nextChar = (char) (ch + 1);
	                  
	                    if (ch == 'z') nextChar = 'a';
	                    if (ch == 'Z') nextChar = 'A';
	                    alteredString.append(nextChar);
	                } 
	                else {
	                    alteredString.append(ch);
	                }
	            } 
	            else {
	                alteredString.append(ch);
	            }
	        }

	        return alteredString.toString();
	    }

}
