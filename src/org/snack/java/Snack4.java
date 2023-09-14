package org.snack.java;

import java.util.Scanner;

public class Snack4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Inserisci una parola: ");
		String word = sc.nextLine();
		String wordReverse = "";
		String isPalindrome = "";
		
		for(int i = word.length(); i > 0; i--) {
			wordReverse += word.charAt(i - 1);
		}
		
		isPalindrome = wordReverse.equals(word) ? "è palindroma" : "non è palindroma";
		System.out.println(isPalindrome);
		

	}

}
