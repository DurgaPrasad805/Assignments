package com.assignments;

public class EmpGroups extends Employees{
	
	//Storing Employee Names & Employee ID's 
	String[] EmpNames = {"Prasad","XYZ","ABC"};
	int[] EmpIDs = {1234, 1245, 1236};

	public static void main(String[] args) {
	
		Employees data = new EmpGroups();
		
		System.out.println("Employee Name is: " +data.Empname + " , Employee ID is :" + data.EmpID);
		
		System.out.println("Employee Name is: " +data.Empname1 + " , Employee ID is :" + data.EmpID1);
		
		System.out.println("Employee Name is: " +data.Empname2 + " , Employee ID is :" + data.EmpID2);

	}

}
