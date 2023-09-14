package org.snack.java;

import java.util.Random;

public class Snack10 {

	public static void main(String[] args) {
		int[] numbers = new int[10];
		String even = "";
		String odd = "";
		String evenIndex = "";
		String oddIndex = "";
		
		
		
		for(int i = 0; i < numbers.length; i++) {
			Random rand = new Random();
			int numberRand = rand.nextInt(901) + 100;
			numbers[i] = numberRand;
			
			if(numbers[i] % 2 == 0) {
				even += " - " + Integer.toString(numbers[i]);
			} else {
				odd += " - " + Integer.toString(numbers[i]);
			}
			
			if(i % 2 == 0) {
				evenIndex += " - " + Integer.toString(numbers[i]);
			} else {
				oddIndex += " - " + Integer.toString(numbers[i]);
			}
			
			
			
		}
		
		System.out.println("Questi sono tutti i numeri pari: " + even);
		System.out.println("Questi sono tutti i numeri dispari: " + odd);
		
		System.out.println("Questi sono i numeri con indice pari: " + evenIndex);
		System.out.println("Questi sono i numeri con indice dispari: " + oddIndex);

	}

}
