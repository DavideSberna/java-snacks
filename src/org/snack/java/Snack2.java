package org.snack.java;

import java.util.Random;

public class Snack2 {

	public static void main(String[] args) {
		
		String[] names = {"Davide", "Giovanni","Filippo","Marco","Michele","Giuseppe"};
		String[] surnames = {"Sberna", "Giampapa","Capaldo","De Santis","Meda","Bonera"};
		int lengthArr = names.length;
		String[] list = new String[names.length];
		
		
		
		for(int i = 0; i < lengthArr; i++) {
			
			Random rand = new Random();
			int indexRand = rand.nextInt(lengthArr);
			list[i] = names[indexRand] + " " + surnames[indexRand];
			
			if(i < 1) {				
				System.out.print("NOME ");
				System.out.println(" COGNOME");
			}
			System.out.println(list[i]);
			
		}

	}

}
