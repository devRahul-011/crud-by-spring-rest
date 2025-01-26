package com.exercise.ifelse;
import java.util.Scanner;

//PROBLEM STATEMENT
//WAP to check whether a number is negative, positive or zero

public class NumberClassifier {
	public String numberIs(float num) {
		if(num==0) {
			return "Zero";
		}
		else if(num>0) {
			return "Positive";
		}
		else {
			return "Negative";
		}
	}
	
	public static void main(String[] args) {
		NumberClassifier nc = new NumberClassifier();
		
		System.out.print("Enter a Number: ");
		Scanner sc = new Scanner(System.in);
		float num = sc.nextFloat();
		
		System.out.println("Given Number is " + nc.numberIs(num));
	}
	
}