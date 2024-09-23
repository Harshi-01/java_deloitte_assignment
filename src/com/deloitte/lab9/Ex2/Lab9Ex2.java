package com.deloitte.lab9.Ex2;
import java.util.function.Function;
public class Lab9Ex2 {
	
	  public static void main(String[] args) {
	        String strr = "APGLO";
	        Function<String, String> format = str -> String.join(" ", str.split(""));
	        String str1 = format.apply(strr);

	        System.out.println(str1);
	    }
  

}
