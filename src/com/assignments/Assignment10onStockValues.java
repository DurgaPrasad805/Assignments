package com.assignments;

public class Assignment10onStockValues {

	public static void main(String[] args) {
		
		int[] values= {7,1,5,3,6,4};
		 int minvalue=values[1];
		 int maximumprofit=0;
		 
		 for(int i=0; i<values.length; i++){
			 
			 if(values[i] < minvalue) {
				 
				 minvalue = values[i];
				 
			 }else if(values[i] - minvalue > maximumprofit  ){
				 
				 maximumprofit= values[i] - minvalue; 
			 }
		 }
		 
		 System.out.println(maximumprofit);
	}

}
