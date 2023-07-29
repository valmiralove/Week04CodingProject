//
// Copyright (c) 2023 Promineo Tech
// Author:  Promineo Tech Academic Team
// Subject:  StringBuilders, Lists, Sets, & Maps
// Java Week 04 Lab  
//
package week04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;



public class Week04StringBuilderListSetMapLab {

	public static void main(String[] args) {

		// 1. Why would we use a StringBuilder instead of a String?
		// 		a. Instantiate a new StringBuilder
		//		b. Append the characters 0 through 9 to it separated by dashes
		// 				Note:  make sure no dash appears at the end of the StringBuilder
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 10; i++) {
			sb.append(i);
			if (i != 9) {
				sb.append("-");
			}
		}
		System.out.println(sb);

		
		
		// 2. List of String:
		//		a. Create a list of Strings 
		//		b. Add 5 Strings to it, each with a different length
		List<String> animals = new ArrayList<String>();
		animals.add("Elephant");
		animals.add("Parrot");
		animals.add("Tiger");
		animals.add("Fish");
		animals.add("Cat");
		
//		OR
		
		List<String> pets = Arrays.asList("Cougar", "Parrot", "Tiger", "Fish", "Cat");

		
		// 3. Write and test a method that takes a list of strings 
		//			and returns the shortest string
		System.out.println("===========================Q#3========================================");
		System.out.println(findShortestString(animals));

		
		// 4. Write and test a method that takes a list of strings 
		//			and returns the list with the first and last element switched
		System.out.println("===========================Q#4========================================");
		System.out.println(swapFirstAndLast(animals));
		
//		OR
		System.out.println("--------------------------");
		List<String> swapped = swapFirstAndLast(animals);
		for (String string : swapped) {
			System.out.println(string);
		}

		
		// 5. Write and test a method that takes a list of strings 
		//			and returns a string with all the list elements concatenated to each other,
		// 			separated by a comma
		System.out.println("===========================Q#5========================================");
		System.out.println(combineStrings(animals));

		
		// 6. Write and test a method that takes a list of strings and a string 
		//			and returns a new list with all strings from the original list
		// 			containing the second string parameter (i.e. like a search method)
		System.out.println("============================Q#6=======================================");
		System.out.println(search(animals, "a"));
		
		
//		loop that iterates
		System.out.println("--------------------------");
		List<String> searchResult = search(animals, "e");
		for (String result : searchResult) {
			System.out.println(result);
		}
		

		
		// 7. Write and test a method that takes a list of integers 
		//			and returns a List<List<Integer>> with the following conditions specified
		//			for the return value:
		//		a. The first List in the returned value contains any number from the input list 
		//			that is divisible by 2
		//		b. The second List contains values from the input list that are divisible by 3
		//		c. The third containing values divisible by 5, and 
		//		d. The fourth all numbers from the input List not divisible by 2, 3, or 5
		System.out.println("============================Q#7======================================");
		List<Integer> numbers = Arrays.asList(1, 2, 3, 7, 44, 33, 5, 50, 62, 15);
		
		List<List<Integer>> sortedNumbers = sortDivisibleNumbers(numbers);
		
		System.out.println(sortedNumbers);
		
		System.out.println("---------------------------");
		
		for (List<Integer> list : sortedNumbers) {
			for (Integer number : list) {
				System.out.println(number);
			}
			System.out.println("Next List-----------------");
		}
		
		
		// 8. Write and test a method that takes a list of strings 
		//			and returns a list of integers that contains the length of each string
		System.out.println("===========================Q#8=======================================");
		System.out.println(calculateStringLengths(animals));
		
		
		System.out.println("------------------------------");
		List<Integer> lengths = calculateStringLengths(animals);
		for (Integer length : lengths) {
			System.out.println(length);
		}

		
		// 9. Create a set of strings and add 5 values
		Set<String> set = new HashSet<String>();
		set.add("Hello");
		set.add("World");
		set.add("Bye");
		set.add("Hi");
		set.add("Buenos dias");
		
		
		// 10. Write and test a method that takes a set of strings and a character 
		//			and returns a set of strings consisting of all the strings in the
		// 			input set that start with the character parameter.
		System.out.println("============================Q#10======================================");
		System.out.println(findAllThatStartWith(set, 'B'));
		
		System.out.println("------------------------------------");
		
		Set<String> inputLetter = findAllThatStartWith(set, 'H');
		for (String letter : inputLetter) {
			System.out.println(letter);
		}

		
		// 11. Write and test a method that takes a set of strings 
		//			and returns a list of the same strings
		System.out.println("=============================Q#11======================================");
		System.out.println(convertSetToList(set));
		
		System.out.println("-----------------------------------------");
		
		List<String> converted = convertSetToList(set);
		for (String string : converted) {
			System.out.println(string);
		}
		

		// 12. Write and test a method that takes a set of integers 
		//			and returns a new set of integers containing only even numbers 
		//			from the original set
		System.out.println("==============================Q#12=====================================");
		Set<Integer> setOfNumbers = Set.of(2, 4, 8, 15, 16, 33);
		
		System.out.println(extractEvens(setOfNumbers));
		System.out.println("------------------------------------------------======================");
		
		Set<Integer> evenNums = extractEvens(setOfNumbers);
		for (Integer i : evenNums) {
			System.out.println(i);
		}

		
		// 13. Create a map of string and string and add 3 items to it where the key of each
		// 			is a word and the value is the definition of the word
		Map<String, String> dictionary = new HashMap<String, String>();
		dictionary.put("Apple", "A crunch fruit. Usually red/green in color.");
		dictionary.put("Banana", "Monkeys love this fruit.");
		dictionary.put("Peach", "it's a very peachy fruit.");
	
		
		// 14. Write and test a method that takes a Map<String, String> and a string 
		// 			and returns the value for a key in the map that matches the
		// 			string parameter (i.e. like a language dictionary lookup)
		System.out.println("=============================Q#14======================================");
		System.out.println(lookUpValue(dictionary, "Apple"));
		System.out.println(lookUpValue(dictionary, "Carrot"));
		
		// 15. Write and test a method that takes a List<String> 
		//			and returns a Map<Character, Integer> containing a count of 
		//			all the strings that start with a given character
		System.out.println("=============================Q#15======================================");
		System.out.println(extractStringCount(pets));
		
		System.out.println("---------------------------------------------------------");
		
		Map<Character, Integer> stringCount = extractStringCount(pets);
		
		for (Character c : stringCount.keySet()) {
			System.out.println(c + " - " + stringCount.get(c));
		}
		
		
	}
	
	
	// Method 15:
	public static Map<Character, Integer> extractStringCount (List<String> list){
		Map<Character, Integer> results = new HashMap<Character, Integer>();
		
		for (String i : list) {
			char c = i.charAt(0);
			if (results.get(c) == null) {
				results.put(c, 1);
			} else {
				results.put(c, results.get(c) + 1);
			}
		}
		return results;
	}
	
	
	
	// Method 14:
	public static String lookUpValue (Map<String, String> map, String input){
		
		for (String key : map.keySet()) {
			if (key.equals(input)) {
				return map.get(key);
			}
		}
		return "no match";
		
	}
	

	
	// Method 12:
	public static Set<Integer> extractEvens (Set<Integer> numbers){
		Set<Integer> results = new HashSet<Integer>();
		
		for (Integer i : numbers) {
			if (i % 2 == 0) {
				results.add(i);
			}
		}
		return results;
	}

	
	// Method 11:
	public static List<String> convertSetToList (Set<String> set){
		List<String> results = new ArrayList<>();
		
		for (String string : set) {
			results.add(string);
		}
		return results;
	}


	// Method 10:
	public static Set<String> findAllThatStartWith (Set<String> set, char c){
		Set<String> result = new HashSet<String>();
		
		for (String string : set) {
			if (string.charAt(0) == c) {
				result.add(string);
			}
		}
		return result;
	}

	
	// Method 8:
	public static List<Integer> calculateStringLengths (List<String> list){
		List<Integer> lengths = new ArrayList<Integer>();
		
		for (String string : list) {
			lengths.add(string.length());
		}
		return lengths;
	}

	
	// Method 7:
	public static List<List<Integer>> sortDivisibleNumbers (List<Integer> list){
		List<List<Integer>> results = new ArrayList<List<Integer>>();
		results.add(new ArrayList<Integer>());
		results.add(new ArrayList<Integer>());
		results.add(new ArrayList<Integer>());
		results.add(new ArrayList<Integer>());
		
		for (Integer number : list) {
			if (number % 2 == 0) {
				results.get(0).add(number);
			}
			if (number % 3 == 0) {
				results.get(1).add(number);
			}
			if (number % 5 == 0) {
				results.get(2).add(number);
			}
			if (number % 2 != 0 && number % 3 != 0 && number % 5 != 0) {
				results.get(3).add(number);
			}
		}
		return results;
	}
	

	
	// Method 6:
	public static List<String> search (List<String> list, String query) {
	List<String> result = new ArrayList<>();
	
	for (String word : list) {
		if (word.contains(query)) {
			result.add(word);
		}
	}
		
		return result;
	}
	

	
	// Method 5:
	public static String combineStrings (List<String> strings){
		StringBuilder result = new StringBuilder();
		int count = 1;
		for (String string : strings) {
			result.append(string);
			if (count < strings.size()) {
				result.append(", ");
			}
			count++;
		}
		return result.toString();
	}
	
	
	
	
	// Method 4:
	public static List<String> swapFirstAndLast (List<String> list){
		String temp = list.get(0);
		list.set(0, list.get(list.size()-1));
		list.set(list.size()-1, temp);
		return list;
	}
	
	
	
	
	// Method 3:
	public static String findShortestString(List<String> list) {
		String shortest = list.get(0);
		for (String string : list) {
			if (string.length() < shortest.length()) {
				shortest = string;
			}
		}
		return shortest;
	}
	
	

}