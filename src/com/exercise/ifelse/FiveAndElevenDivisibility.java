package com.exercise.ifelse;
import java.util.Scanner;

//PROBLEM STATEMENT
//WAP to check whether a number is divisible by 5 and 11 or not.


public class FiveAndElevenDivisibility {
	public void isFiveElevenDivisiable(int num) {
		if (num%5==0 && num%11==0) {
			System.out.println("Number is Divisiable By 5 as well as 11");
		}
		else if(num%5==0) {
			System.out.println("Number is Divisiable By 5 But Not By 11");
		}
		else if(num%11==0){
			System.out.println("Number is Divisiable By 11 But Not By 5");
		}
		else {
			System.out.println("Number is Divisiable by  Neither By 5 Nor By 11");
		}
	}
	
	public static void main(String[] args) {
		FiveAndElevenDivisibility fe = new FiveAndElevenDivisibility();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter A Number: ");
		int num = sc.nextInt();
		
		fe.isFiveElevenDivisiable(num); // for testcase, try 55
	}
}
