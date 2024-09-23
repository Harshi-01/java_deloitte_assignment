package com.deloitte.lab3.Ex9;

import java.time.LocalDate;
import java.time.Period;

public class Lab3Ex9 {
	
	public static void main(String[] args)
    {
        LocalDate pD = LocalDate.of(1995,12,28);
        LocalDate tDate = LocalDate.now();
 
        Period d = Period.between(pD, tDate);
 
     System.out.printf(" %d years, %d months and %d days old",d.getYears(), d.getMonths(), d.getDays());
  }

}
