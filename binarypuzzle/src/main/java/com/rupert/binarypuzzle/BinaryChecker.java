package com.rupert.binarypuzzle;

public class BinaryChecker {

	public Object check(int x) {
		
		if (x < 0){
			throw new IllegalArgumentException("The input number needs to be positive");
		}
	
		if (x > 1000000000) {
			throw new IllegalArgumentException("The input number needs to be less than 1000000001");
		}
	
		/*
		String input=Integer.toBinaryString(x);
		StringBuilder reverser = new StringBuilder();
		reverser.append(input);
		reverser = reverser.reverse();
		String output = reverser.toString();
		
		return Integer.parseInt(output, 2); 
		*/
		
		//Same result using binary
		int b = 0;
			while (x!=0) { b<<=1; b|=( x &1); x>>=1; }
		return b;
		
	}

}