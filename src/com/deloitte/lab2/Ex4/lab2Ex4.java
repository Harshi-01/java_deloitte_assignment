package com.deloitte.lab2.Ex4;

import java.util.Arrays;
import java.util.HashSet;
 	
public class lab2Ex4 {
	
	  public static void main(String[] args) {
	        int[] n = {5, 3, 8, 5, 1, 8, 7, 3,9};
	        int[] modifiedArray = modifyArray(n);
	        System.out.println(Arrays.toString(modifiedArray));
     
	  }
	  
	  public static int[] modifyArray(int[] arr) {
        HashSet<Integer> uniqueN = new HashSet<>();
        for (int num : arr) {
            uniqueN.add(num);
        }

       
        int[] uniqueArray = new int[uniqueN.size()];
        int index = 0;
        for (int num : uniqueN) {
            uniqueArray[index++] = num;
        }
        Arrays.sort(uniqueArray);
        int[] sortedDes = new int[uniqueArray.length];
        for (int i = 0; i < uniqueArray.length; i++) {
            sortedDes[i] = uniqueArray[uniqueArray.length - 1 - i];
        }

        return sortedDes;
    }

  
}
