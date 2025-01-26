package com.exercise.ifelse;
import java.util.Scanner;

//PROBLEM STATEMENT
//1) WAP to find maximum between two numbers.
//2) WAP to find maximum between three numbers.

public class Maximum {
	public float max(float num1, float num2) {
		if (num1 > num2) {
			return num1;
		} else {
			return num2;
		}
	}

	public float max(float num1, float num2, float num3) {
		if (num1 > num2) {
			if (num1 > num3) {
				return num1;
			} else {
				return num3;
			}
		} else {
			if (num2 > num3) {
				return num2;
			} else {
				return num3;
			}
		}
	}

	public static void main(String[] args) {
		Maximum obj = new Maximum();
		
//		Scanner sc = new Scanner(System.in);
//		float num1=sc.nextFloat();
//		float num2=sc.nextFloat();
//		float num3=sc.nextFloat();
		
		System.out.println(obj.max(12, 45));
		System.out.println(obj.max(12, 45, 63));
	}

}
