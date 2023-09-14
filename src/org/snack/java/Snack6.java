package org.snack.java;

public class Snack6 {

	public static void main(String[] args) {
		String numberStr = "457";
		int number = 0;
		boolean isNotNumber = false;
		String errorMessage = "Non è un numero convertibile";
		
		
		
		for(int i = 0; i < numberStr.length(); i++) {
			char c = numberStr.charAt(i);
			if(c == '0') {
				number = number * 10 + 0;
			} else if(c == '1') {
				number = number * 10 + 1;
		    } else if(c == '2') {
		    	number = number * 10 + 2;
		    } else if(c == '3') {
		    	number = number * 10 + 3;
		    } else if(c == '4') {
		    	number = number * 10 + 4;
		    } else if(c == '5') {
		    	number = number * 10 + 5;
		    } else if(c == '6') {
		    	number = number * 10 + 6;
		    } else if(c == '7') {
		    	number = number * 10 + 7;
		    } else if(c == '8') {
		    	number = number * 10 + 8;
		    } else if(c == '9') {
		    	number = number * 10 + 9;
		    } else {
		    	isNotNumber = true;
		    	break;
		    }

	}
		if(isNotNumber) {
		   System.out.println(errorMessage);
		   return;
		}
		System.out.println(number);
  }
}
