package com.deloitte.lab9.Ex1;
import java.util.function.BiFunction;
public class Lab9Ex1 {
	
	  public static void main(String[] args) {
	        BiFunction<Integer, Integer, Integer> multiply = (x, y) -> x * y;
	        int res = multiply.apply(5, 9); 
	        System.out.println(res);
	    }

}
