package com.exercise.forloop;

public class Factorial {

	public int getFactorial(int num) {
		int sum=1;
		for(int i=1; i<=num; i++) {
			sum*=i;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Factorial fc = new Factorial();
		System.out.println(fc.getFactorial(3));
	}

}
