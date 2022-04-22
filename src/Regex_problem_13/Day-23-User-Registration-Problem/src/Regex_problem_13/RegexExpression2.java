package Regex_problem_13;

import java.util.Scanner;

public class RegexExpression2 {

	public boolean firstName(String name) {
		String firstName = "^[A-Z]{1}[A-Za-z]{2,}$";
		if (name.matches(firstName)) {
			return true;
		}
		return false;
	}

	static String firstName = "^[A-Z]{1}[A-Za-z]{2,}$";

	public boolean lastName(String name) {
		String lastName = "^[A-Z]{1}[A-Za-z]{2,}$";
		if (name.matches(lastName)) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {

		RegexExpression2 regex = new RegexExpression2();
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the first name :");
		String firstName = scan.nextLine();
		System.out.println(regex.firstName(firstName));

		System.out.println("Enter the last name :");
		String lastName = scan.nextLine();
		System.out.println(regex.firstName(lastName));

		System.out.println("Enter the first name :");
		String testName = scan.nextLine();
		if(testName.matches(firstName)) {
			System.out.println("This is valid first name .");
		}
		else {
			System.out.println("Not a valid name");
		}
	}

}
