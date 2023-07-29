package week04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class Week04CodingProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Question 1 - Array of int named ages
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		
		//part a
		int result = ages[ages.length - 1] - ages[0];
		System.out.println("Last element minus first element = " + result);
		System.out.println("---------------------------------------------------");
		
		//part b
		int[] newAges = {3, 9, 23, 64, 2, 8, 28, 93, 100};
		int newResult = newAges[newAges.length - 1] - newAges[0];
		
		System.out.println("Last element munis first element = " + newResult);
		System.out.println("---------------------------------------------------");
		
		//part c
		int sum = 0;
		for (int age : ages) {
			sum += age;
		}
		
		int average = sum / ages.length;
		
		System.out.println("Average of ages = " + average);
		System.out.println("---------------------------------------------------");
		
		//Question 2 create an Array of String
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		
		//part a calculate average
		int totalLetters = 0;
		for (String name : names) {
			totalLetters += name.length();
		}
		
		int averageLetters = totalLetters / names.length;
		System.out.println("Average letters = " + averageLetters);
		System.out.println("---------------------------------------------------");
		
		//part b concatenate names
		StringBuilder concatenatedNames = new StringBuilder();
		for (int i = 0; i < names.length; i++) {
			concatenatedNames.append(names[i]);
			if (i < names.length - 1) {
				concatenatedNames.append(" ");
			}
		}
		System.out.println("Names concatenated = " + concatenatedNames);
		System.out.println("---------------------------------------------------");
		
		//Question 3 
		System.out.println("To access last element you use variablename.length - 1");
		System.out.println("---------------------------------------------------");
		
		//Question 4
		System.out.println("To access first element you use variablename[0] - index 0 is first element");
		System.out.println("---------------------------------------------------");
		
		//Question 5 new Int Array
		int[] nameLengths = new int[names.length];
		
		for (int i = 0; i < names.length; i++) {
			nameLengths[i] += names[i].length();
		}
		System.out.println("Lengths of names: ");
		for (int length : nameLengths) {
			System.out.println(length);
		}
		System.out.println("---------------------------------------------------");
		System.out.println("---------------------------------------------------");
		System.out.println("---------------------------------------------------");
		System.out.println("---------------------------------------------------");
		System.out.println("---------------------------------------------------");
		System.out.println("new addition");
		System.out.println("---------------------------------------------------");
		System.out.println("---------------------------------------------------");
		System.out.println("---------------------------------------------------");
		System.out.println("---------------------------------------------------");
		System.out.println("---------------------------------------------------");
		System.out.println("---------------------------------------------------");
		
	
	
	//Question 7 - method
//	public int String repeatWord (String word, Integer n) {
//		StringBuilder results = new StringBruilder();
//		
//		return results;
	}

}
