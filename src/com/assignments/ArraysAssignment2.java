package com.assignments;

public class ArraysAssignment2 {

	public static void main(String[] args) {
		
		
		String[][][] semisterdata= {
                     				{
                     					{"Sem 1", "Mathametics", "78" },
                     					{"Sem 1", "Physics", "85"},
                     					{"Sem 1", "Chemistry", "91" },
                     					{"Sem 1","Computer programming","74"},
                     					{"Sem 1", "Engineering Drawing","88" },
                     					{"Sem 1", "Basic Electrical Eng.","79" }
			                    	},
                     				
                     				{
                     					{"Sem 2", "Mathametics II", "82" },
                     					{"Sem 2", "Mechanics", "77"},
                     					{"Sem 2", "Environmental Sci.", "93" },
                     					{"Sem 2", "Basic Electronics","69"},
                     					{"Sem 2", "Engineering Physics","84" },
                     					{"Sem 2", "Engineering Graphics","90" }
			                    	},
                     				
                     				{
                     					{"Sem 3", "Data Structures", "88" },
                     					{"Sem 3", "Discrete Mathematics", "81"},
                     					{"Sem 3", "Digital Electronics", "76" },
                     					{"Sem 3", "Operating Systems","92"},
                     					{"Sem 3", "Signals and Systems","85" },
                     					{"Sem 3", "Object-oriented Programming","78" }
			                    	},
                     				
                     				{
                     					{"Sem 4", "Algorithms", "91" },
                     					{"Sem 4", "Computer Networks", "73"},
                     					{"Sem 4", "Database Systems", "89" },
                     					{"Sem 4", "Microprocessors","80"},
                     					{"Sem 4", "Communication Engineering","76" },
                     					{"Sem 4", "Software Engineering","87" }
			                    	},
                     				
                     				{
                     					{"Sem 5", "Probability & Stats", "86" },
                     					{"Sem 5", "Machine Learning", "88"},
                     					{"Sem 5", "Compiler Design", "84" },
                     					{"Sem 5", "Theory of Computation","95"},
                     					{"Sem 5", "Embedded Systems","73" },
                     					{"Sem 5", "Computer Graphics","90" }
			                    	},
				             
				             
                     				
				
		            };
		
		             // Printing Semester 3 names of Subject 4 & Subject 5 names
		             System.out.println("Subject 3 Name in the Semester 3 is : " +semisterdata[2][3][1]);
		             System.out.println("Subject 4 Name in the Semester 3 is : " +semisterdata[2][4][1]);
		             System.out.println();
		             
		             //Printing Semester 5 marks of Subject 3 & Subject 6 
		             System.out.println("Compiler Design marks in the semester 5 is : " +semisterdata[4][2][2]);
		             System.out.println("Computer Graphics marks in the semester 5 is : " +semisterdata[4][5][2]);
		          
		}

	}


