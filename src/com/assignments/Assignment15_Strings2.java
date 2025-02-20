package com.assignments;

import java.util.HashMap;
import java.util.Map;

public class Assignment15_Strings2 {

	public static void main(String[] args) {
		
		//Finding number of occurenances of java word in a given string
		String data="Java is a popular programming lanaguage. Java is used for web development , mobile applications and more";
		String word = "Java";
		
		String[] repeated = data.split(" ");
		int count=0;
		
		for(int i=0; i<repeated.length ; i++) {
			if(word.equals(repeated[i])) {
				count++;
			}
		}
		System.out.println("The actual String is : " + data );
		System.out.println(" The word " + word + " occurs " + count + " times in the above String  ");
		
		Map<String , Integer> hashMap = new HashMap<>();
		
		for(String totaltimes : repeated ) {
			
			Integer integer = hashMap.get(totaltimes);
			
			if(integer == null) {
				hashMap.put(totaltimes, 1);
			}else {
				hashMap.put(totaltimes, integer + 1);
			}
		}
             System.out.println(hashMap);
             
            System.out.println(hashMap.get(repeated[0]));
            System.out.println(hashMap.get(repeated[1]));
            System.out.println(hashMap.get(repeated[2]));
	}

}
