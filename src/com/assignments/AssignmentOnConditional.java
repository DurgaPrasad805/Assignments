package com.assignments;

public class AssignmentOnConditional {

	public static void main(String[] args) {
		
        String customerName ="John Doe";
		int creditScore=720;
		double income=55000.0;
		boolean isEmployed=true;
		double debtToIncomeRatio =35.0;
		
		if(creditScore>=750)
		{
			System.out.println(customerName + "is eligible for the loan");
		}else if(creditScore>=650 && creditScore<=750) 
		{
			 if (income>=50000) 
			 {
				 if(isEmployed ==true) {
					 
					 if(debtToIncomeRatio<40.0) {
						 
						 System.out.println(customerName + " is eligible for the loan");
						 
					 }else {
						 System.out.println(customerName + " is not eligible for the loan (DTI ratio too high)");
					 } 
					  
				 }else {
					 System.out.println(customerName + " is not eligible for the loan(unemployed)");
				 }
			 }else {
				 System.out.println(customerName + " is not eligible for the loan(income below $50000)");
			 }
		}else {
			System.out.println(customerName + " is not eligible for the loan (credit score below 650)");
		}
		
	}

}
