package com.exercise.ifelse;
import java.util.Scanner;

public class Character {
	public boolean isCharacter(char ch) {
		if (ch >= 97 && ch <= 122 || ch >= 65 && ch <= 90) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Character cht = new Character();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter A Charater: ");
		char sch = sc.next().charAt(0);
		System.out.println(cht.isCharacter(sch));
	}

}
