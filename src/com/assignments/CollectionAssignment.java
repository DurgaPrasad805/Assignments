package com.assignments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollectionAssignment {

	public static void main(String[] args) {
		
		Map<String, String> data = new HashMap<String, String>();
		data.put("Employee ID", "E001");
		data.put("Name", "Alice Green");
		data.put("Age", "30");
		data.put("Gender", "Female");
		data.put("Department", "Engineering");
		data.put("Position", "Software Engineer");
		data.put("Salary", "75,000");
		data.put("Email", "alice@example.com");
		data.put("Contact Number", "9876543213");
		
		Map<String, String> data1 = new HashMap<String, String>();
		data1.put("Employee ID", "E002");
		data1.put("Name", "Bob Johnson");
		data1.put("Age", "35");
		data1.put("Gender", "Male");
		data1.put("Department", "Marketing");
		data1.put("Position", "Marketing Manager");
		data1.put("Salary", "85,000");
		data1.put("Email", "bob@example.com");
		data1.put("Contact Number", "9876543214");
		
		Map<String, String> data2 = new HashMap<String, String>();
		data2.put("Employee ID", "E003");
		data2.put("Name", "Carol White");
		data2.put("Age", "28");
		data2.put("Gender", "Female");
		data2.put("Department", "Sales");
		data2.put("Position", "Sales Executive");
		data2.put("Salary", "65,000");
		data2.put("Email", "carol@example.com");
		data2.put("Contact Number", "9876543215");
		
		//Storing records to list
		List<Map<String, String>> empdata =new ArrayList<Map<String, String>>();	
		
		empdata.add(data);
		empdata.add(data1);
		empdata.add(data2);
		
		//Printing the email address of Bob Johnson
		System.out.println(empdata.get(1).get("Email"));
		
		

	}

}
