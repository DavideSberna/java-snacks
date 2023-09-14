package org.snack.java;

import java.util.Scanner;

public class Snack9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int maxValue = 1000;
		int inputValue = 0;
		int firstQuestion = 0;
		
		if(firstQuestion < 1) {
			System.out.print("inserisci un numero intero: ");
			inputValue = sc.nextInt();
			System.out.println("il tuo numero è --> " + inputValue);
			firstQuestion++;
		}
		
		
		
		while(inputValue < maxValue && firstQuestion > 0) {
			System.out.print("inserisci un numero, lo sommerò fino ad arrivare a 1000: ");
			inputValue += sc.nextInt();
			System.out.println("il tuo numero sommato al precedente è --> " + inputValue);
			
		}
		
		if(inputValue > maxValue) {
			System.out.println(" <---------- FINE DEL GIOCO ----------> ");
		}
		
		

	}

}
