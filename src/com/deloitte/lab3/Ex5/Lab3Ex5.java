package com.deloitte.lab3.Ex5;


import java.util.Scanner;

public class Lab3Ex5 {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder Text = new StringBuilder();
        
        System.out.println("Enter your text (type 'exit' on a new line to finish):");
        
        while (true) {
            String line = sc.nextLine();
            if (line.equalsIgnoreCase("exit")) {
                break;
            }
           Text.append(line).append("\n");
        }

        String text =Text.toString();
        int lineCount = countLines(text);
        int wordCount = countWords(text);
        int charCount = text.length();

        System.out.println("Number of characters: " + charCount);
        System.out.println("Number of lines: " + lineCount);
        System.out.println("Number of words: " + wordCount);

        sc.close();
    }

    private static int countLines(String text) {
        if (text.isEmpty()) {
            return 0;
        }
        String[] lines = text.split("\n");
        return lines.length;
    }

    private static int countWords(String text) {
        if (text.isEmpty()) {
            return 0;
        }
        String[] words = text.trim().split("\\s+");
        return words.length;
    }

}
