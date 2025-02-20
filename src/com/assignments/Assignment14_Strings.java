package com.assignments;

public class Assignment14_Strings {

	public static void main(String[] args) {
		
		//Printing the total number of words in a given String
		String data = "java programming is fun and challenging";
		
		String[] words = data.split(" ");
		
		System.out.println(words.length);
		
		
		//Reversing the given String
		
		String reverse="";
		
		for(int i=data.length()-1; i>=0 ; i--) {
			
			reverse=reverse+data.charAt(i);
		}
		
		System.out.println(reverse);
		
		
		//Making each word as a capital
		String data1 = "java programming is fun and challenging";
		
		String[] capital = data1.split(" ");
		
		for(String capitals : capital)
		{
			
			System.out.print(capitals.substring(0, 1).toUpperCase() + capitals.substring(1, capitals.length()));
			
		}
		
	}

}
