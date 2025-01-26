package com.exercise.ifelse;
import java.util.Scanner;

//PS: WAP to check whether a year is leap year or not.

public class LeapYear {
	public String isLeapYear(int year) {
		if(year%4==0) {
			return "a Leap Year";
		}else {
			return "Not a Leap Year";
		}
	}
	
	public static void main(String[] args) {
		LeapYear ly = new LeapYear();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter A Year: ");
		int year = sc.nextInt();
				
		System.out.println("Given Year is " + ly.isLeapYear(year));
	}
}
