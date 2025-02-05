package com.assignments;

import java.util.ArrayList;
import java.util.List;

public class AssignmentOnLoops {

	public static void main(String[] args) {
		
		List<Integer> transactions = new ArrayList<>();
		transactions.add(50000);
		transactions.add(-2000);
		transactions.add(3000);
		transactions.add(-15000);
		transactions.add(-200);
		transactions.add(-300);
		transactions.add(4000);
		transactions.add(-3000);
		
		//Total Number of transactions
		System.out.println("Total Number of Trasactions is : " +transactions.size());
		
		int creditedTotalAmount=0;
		int debitedTotalAmount=0;
		for(int transaction :transactions) 
		{
			if(transaction >0) 
			{
				creditedTotalAmount +=transaction;
				System.out.println(" Credited Amount : " + transaction);
				
				if(transaction > 10000) 
				{
					System.out.println("Suspicious credit/debit Transaction with amount "+ transaction);
				}
			}else 
			{
				
				debitedTotalAmount +=transaction;
				System.out.println(" Debited Amount :" + transaction);
				
				if(transaction < -10000) 
				{
					System.out.println("Suspicious credit/debit Transaction with amount "+ transaction);
				}
			}
		}
		
		System.out.println("Total Credited Total Amount: " + creditedTotalAmount);
		System.out.println("Total Credited Total Amount: " + debitedTotalAmount);
		
		int totalAmountInBank = creditedTotalAmount + debitedTotalAmount;
		System.out.println("Total Amount in the bank : " + totalAmountInBank);

	}

}
