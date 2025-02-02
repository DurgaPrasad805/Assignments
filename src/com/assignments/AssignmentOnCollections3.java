package com.assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class AssignmentOnCollections3 {

	public static void main(String[] args) {
		
		// 1.Listing Top 5 most populated countries in the world
		List<String> Countrieslist= new ArrayList<String>();
		Countrieslist.add("India");
		Countrieslist.add("China");
		Countrieslist.add("United States");
		Countrieslist.add("Indonesia");
		Countrieslist.add("Pakistan");
		
		//Printing the 2nd most populated country in the world
		System.out.println("The 2nd most populated country in the world is: " +Countrieslist.get(1));
		
		
		// 2.listing top 10 most visited tourist attraction in the world
		Set<String> Touristlist = new TreeSet<String>();
		Touristlist.add("Burj Khalifa, Dubai, UAE");
		Touristlist.add("Dark Sky Alqueva, Portugal");
		Touristlist.add("Ferrari World Abu Dhabi");
		Touristlist.add("Grand Canyon National Park, USA");
		Touristlist.add("Great Wall of China");
		Touristlist.add("Guinness Storehouse, Ireland");
		Touristlist.add("Ha Long Bay, Vietnam");
		Touristlist.add("IMG Worlds of Adventure, UAE");
		Touristlist.add("Intramuros, Philippines");
		Touristlist.add("Magic Kingdom Park, Walt Disney World Resort Florida, USA");
		
		//Printing the total size of the top 10 tourist attractions
		System.out.println(Touristlist.size());
		
		
		//3.Storing data of top 5 largest cities in the US and their population
		
		Map<String, String> LargestcitiesinUS = new TreeMap<String, String>();
		LargestcitiesinUS.put("New York", "8,335,897");
		LargestcitiesinUS.put("Los Angeles", "3,822,238");
		LargestcitiesinUS.put("Chicago", "2,665,039");
		LargestcitiesinUS.put("Houston", "2,302,878");
		LargestcitiesinUS.put("Phoenix", "1,644,409");
		
		System.out.println(LargestcitiesinUS);
		System.out.println(LargestcitiesinUS.get("New York"));
		
		//4. Storing random integers in to an array
		int[] RandomIntegrs = new int[10];
		RandomIntegrs[0]=1;
		RandomIntegrs[1]=2;
		RandomIntegrs[2]=3;
		RandomIntegrs[3]=4;
		RandomIntegrs[4]=5;
		RandomIntegrs[5]=6;
		RandomIntegrs[6]=7;
		RandomIntegrs[7]=8;	
		RandomIntegrs[8]=9;
		RandomIntegrs[9]=10;
		
		//Printing the sum of 3rd and 5th value of an array 
		System.out.println("Sum of 3rd and 5th value is : " + (RandomIntegrs[2]+RandomIntegrs[4] /2));
		
		
		//5. Top 5 highest grossing films of all time
		List<String> highestGrossingFilms= new ArrayList<String>();
		highestGrossingFilms.add("Avatar");
		highestGrossingFilms.add("Avengers: Endgame");
		highestGrossingFilms.add("Avatar: The Way of Water");
		highestGrossingFilms.add("Titanic");
		highestGrossingFilms.add("Star Wars: Episode VII - The Force Awakens");
		
		//Printing the 3rd on the list
		System.out.println(highestGrossingFilms.get(2));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
