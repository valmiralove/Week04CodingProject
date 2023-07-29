package week04;


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
		
		//Question 6 calculate sum of all elements in array
		int sumNameLengths = 0;
		for (int length : nameLengths) {
			sumNameLengths += length;
		}
		System.out.println("Sum of name lengths: " + sumNameLengths);
		System.out.println("---------------------------------------------------");
		
		//Question 7 method takes String  return String word concatenated
		System.out.println(concatenateWord("Valmira", 6));
		System.out.println("---------------------------------------------------");
		
		//Question 8 method takes 2 String returns String
		System.out.println(getFullName("Valmira", "Example"));
		System.out.println("---------------------------------------------------");
		
		//Question 9 method takes int[] returns boolean
		System.out.println(isSumGreaterThan100(ages));
		System.out.println("---------------------------------------------------");
		
		//Question 10 method takes double[] returns double
		double[] groceries = {24.6, 38.2, 99.1, 66.23, 14.99};
		System.out.println(calculateAverage(groceries));
		System.out.println("---------------------------------------------------");
		
		//Question 11 method takes 2 double[] returns boolean
		double[] arr1 = {10.5, 7.2, 8.9, 6.4, 9.7};
		double[] arr2 = {8.2, 6.1, 9.8, 7.5, 5.9};
		System.out.println(isAverageOfFirstArrayGreaterThanSecond(arr1, arr2));
		System.out.println("---------------------------------------------------");
		
		//Question 12 method takes boolean and double returns boolean
		boolean isHotOutside = true;
		double moneyInPocket = 15.80;
		System.out.println(willBuyDrink(isHotOutside, moneyInPocket));
		System.out.println("---------------------------------------------------");
		
		//Question 13 method takes boolean returns boolean
		boolean isSunnyOut = true;
		boolean noRain = true;
		
		if (willRideMotorcycle(isSunnyOut, noRain)) {
			System.out.println("I will ride the motorcycle today!");
		} else {
			System.out.println("I won't ride the motocycle today :( ");
		}
		System.out.println("---------------------------------------------------");
		
	}
	
	//Question 7 method
	public static String concatenateWord (String word, int n){
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			sb.append(word);
		}
		return sb.toString();
	}
	
	//Question 8 method
	public static String getFullName (String firstName, String lastName) {
		return firstName + " " + lastName;
	}
	
	//Question 9 method
	public static boolean isSumGreaterThan100 (int[] arr) {
		int sum = 0;
		for (int num : arr) {
			sum += num;
		}
		return sum > 100;
	}
	
	//Question 10 method
	public static double calculateAverage (double[] arr) {
		if (arr.length == 0) {
			return 0.0;
		}
		
		double sum = 0;
		for (double num : arr) {
			sum +=num;
		}
		
		double average = sum / arr.length;
		
		return average;
	}
	
	//Question 11 method
	public static boolean isAverageOfFirstArrayGreaterThanSecond (double [] arr1, double[] arr2) {
		double average1 = calculateAverage(arr1);
		double average2 = calculateAverage(arr2);
		
		return average1 > average2;
	}
	
	//Question 12 method
	public static boolean willBuyDrink (boolean isHotOutside,double moneyInPocket) {
		return isHotOutside && moneyInPocket > 10.50;
	}
	
	//Question 13 method
	public static boolean willRideMotorcycle (boolean isSunnyOut, boolean noRain) {
		return isSunnyOut && noRain;
	}

}
