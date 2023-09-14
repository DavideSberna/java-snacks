package org.snack.java;

public class Snack7 {

	public static void main(String[] args) {
		double sec = 3953;
		double min = sec / 60;
		double ore = min / 60;
		
		System.out.println("secondi " + String.format("%.02f", sec));
		System.out.println("minuti " + String.format("%.02f", min));
		System.out.println("ore " + String.format("%.02f", ore));

	}

}
