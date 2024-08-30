package user_registration_validation;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class password {
	public static void main(String[] args) {

		String password="^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()])[a-zA-z0-9@#$%^&-+=()]{8,20}";

		Scanner sc=new Scanner(System.in);
		System.out.println(" enter password ");
		String pass = sc.nextLine();

		Pattern p=Pattern.compile(password);
		Matcher m=p.matcher(pass);

		if(m.find() && m.group().equals(pass))
		{
			System.out.println(" valid password ");
		}
		else {
			System.out.println(" invalid password ");
		}

	}
}
