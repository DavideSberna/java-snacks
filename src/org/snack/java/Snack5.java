package org.snack.java;

import java.util.Scanner;

public class Snack5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean isZero = false;
		int numberNumber = 0;
		int numberString = 0;
		int numberSpecial = 0;
		
		while(!isZero) {
			System.out.print("Inserisci dei valori numerici, alfanumerici e non alfanumerici. Non smetterò di chiedertelo finchè non inserirai anche uno '0': ");
            String input = sc.nextLine();
            for(int i = 0; i < input.length(); i++) {
            	if(input.charAt(i) == '0') {
            		isZero = true;
            	}
                if (Character.isDigit(input.charAt(i))) {
                	numberNumber++;
                } else if(Character.isLetter(input.charAt(i))) {
                	numberString++;
                } else {
                	numberSpecial++;
                }
            }
            System.out.println("Totale valori numerici: " + numberNumber);
            System.out.println("Totale valori alfanumerici: " + numberString);
            System.out.println("Totale valori speciali: " + numberSpecial);
		}
		

	}

}
