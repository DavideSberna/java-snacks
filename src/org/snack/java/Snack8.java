package org.snack.java;

import java.util.Random;

public class Snack8 {

	public static void main(String[] args) {
		int[] numbers = new int[10];
		int min = 150;
		int max = 100;
		int totSum = 0;
		double average = 0;
		
		for(int i = 0; i < numbers.length; i++) {
			Random rand = new Random();
			int numRand = rand.nextInt(51) + 100;
			numbers[i] = numRand;
			totSum += numbers[i];
			if(numbers[i] > max) {
				max = numbers[i];
			}
			
			if(numbers[i] < min) {
				min = numbers[i];
			}
		}
		average = (double) totSum / numbers.length;
		System.out.println(totSum);
		System.out.println("media " + average);
		System.out.println("max " + max);
		System.out.println("min " + min);

	}

}
