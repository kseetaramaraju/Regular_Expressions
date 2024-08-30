package check_valid_email_or_not;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Valid_Email {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println(" enter email id ");
		String email = sc.nextLine();

		Pattern p=Pattern.compile("[a-zA-Z0-9]([a-zA-Z0-9_+-][.]?[^.])*@[a-zA-Z0-9]+([.][a-zA-Z]{2,}){1,2}");
		Matcher m=p.matcher(email);

		if(m.find() && m.group().equals(email))
		{
			System.out.println(" valid email  ");
		}
		else
		{
			System.out.println(" not valid email ");
		}



	}
}
