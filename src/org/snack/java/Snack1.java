package org.snack.java;

import java.util.Scanner;

public class Snack1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("inserisci un numero: ");
		int number = sc.nextInt();
		
		
		boolean isEven = number % 2 == 0;
		int res = isEven ? number : number + 1 ;
		
		
		System.out.println(res);

	}

}
