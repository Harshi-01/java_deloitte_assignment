package com.deloitte.lab3.Ex1;


import java.util.StringTokenizer;
import java.util.Scanner;

public class Lab3Ex1 {
	
	public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a line of integers separated by spaces: ");
        String input = scanner.nextLine();

        StringTokenizer token = new StringTokenizer(input);
        int sum = 0;

        System.out.println("You entered:");
        while (token.hasMoreTokens()) {
            String tok = token.nextToken();
            int number = Integer.parseInt(tok);
            System.out.println(number);
            sum += number;
        }

        System.out.println("Sum of all integers: " + sum);
        scanner.close();
    }

}
