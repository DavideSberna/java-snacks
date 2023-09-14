package org.snack.java;

public class Snack3 {

	public static void main(String[] args) {
		
		int[] numberArr = {1, 2, 4, 5, 6, 10, 11, 50, 30};
		int sum = 0;
		int results = 0;
		for(int i = 0; i < numberArr.length; i++) {
			results = (i % 2 != 0) ? (sum += numberArr[i]) : sum;
		}
		
		System.out.println("La somma dei valori con indice dispari è: " + results);

	}

}
