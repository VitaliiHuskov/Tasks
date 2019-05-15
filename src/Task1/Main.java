package Task1;

import java.util.Scanner;

public class Main {

	// test main method for brackets
	public static void main(String[] args) {

		Brackets bracket = new Brackets(); // create object Brackets
		System.out.print("Enter the count : "); // message for user to enter number of brackets
		Scanner sc = new Scanner(System.in); // create object scanner for input
		int number = sc.nextInt(); // variable for taking the user input number
		System.out.println(bracket.numberOfCorrectExpressions(number)); // output for user about method

	}

}