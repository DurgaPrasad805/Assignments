package com.assignments;

public class Assignment16_halfdiamond {

	public static void main(String[] args) {
		
          int n = 5;
		
		// upper pyramid		
		for (int i=1; i<=n ; i++) {
			
			//print spaces
			for(int j=n;j>i;j--) {
				System.out.print(" ");
			}
			
			//print numbers along with space
			for (int j=1; j<=i; j++) {
				System.out.print("*");
			}
			
			//go to next line every time when we start new row
			System.out.println();
			
		}

	}

}
