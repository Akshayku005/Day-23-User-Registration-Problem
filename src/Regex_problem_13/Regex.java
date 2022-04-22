package Regex_problem_13;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
	final static String gmail_Id = "[a-z, A-Z, 0-9_/-/.]*[@][a-z]+[.][a-z]{2,3}";
	final static String password = "[a-z A-Z 0-9_/-/.]*[@ 0-9 {5}]+";
	public static void checkGmail() {
		Pattern pattern = Pattern.compile(gmail_Id);
		Matcher matcher = pattern.matcher("akshay123@gmail.com");

		if(!matcher.find()) {
			System.out.println("not found");
		}
		else {
			System.out.println("found");
		}
	}

	public static void checkPassword() {
		Pattern pattern = Pattern.compile(password);
		Matcher matcher = pattern.matcher("aks@6677");

		if(!matcher.find()) {
			System.out.println("Please Enter valid mobile no");
		}
		else {
			System.out.println("found");
		}
	}

	public static void main(String[] args) {
		Regex.checkGmail();
		Regex.checkPassword();
	}
}


