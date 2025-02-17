package com.assignments;

public class Assignment12 {

	public static void main(String[] args) {
		
		int number=7;
		
		boolean value=false;
		
		if(number==0  || number==1) {
			
			value=true;
		}
		
		for(int i=2; i<=number/2 ; ++i)
		{
			
			if(number % i ==0) 
			{
				value =true;
				break;
			}
		}
		
		if(!value) {
			System.out.println("prime number");
		
		}else {
			System.out.println("prime number");
		}
	

	}

}
