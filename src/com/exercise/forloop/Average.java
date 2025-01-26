package com.exercise.forloop;

public class Average {

	public static void main(String[] args) {
		int avg = 0;
		
		for(int i=1; i<=5; i++) {
			avg+=i;
		}
		
		avg/=5;
		
		System.out.println(avg);

	}

}
