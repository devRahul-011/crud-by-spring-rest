package com.exercise.ifelse;
import java.util.Scanner;

//PROBLEM STATEMENT
//WAP to check whether a number is even or odd.


public class EvenOdd {

	public String EvenOrOdd(int num) {
		if(num%2==0) {
			return "Even";
		}
		else {
			return "Odd";
		}
	}
	
	public static void main(String[] args) {
		EvenOdd eo = new EvenOdd();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter A Number: ");
		int num = sc.nextInt();
		
		System.out.println("Given Number is " + eo.EvenOrOdd(num));
		
	}

}
