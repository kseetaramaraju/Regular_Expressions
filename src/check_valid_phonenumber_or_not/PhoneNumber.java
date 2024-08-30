package check_valid_phonenumber_or_not;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumber {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println(" enter phone number ");
		String pn = sc.nextLine();

		Pattern p=Pattern.compile("(0|91)?[6-9][0-9]{9}");
		Matcher m=p.matcher(pn);

		if(m.find() && m.group().equals(pn))
		{
			System.out.println(" valid phone number ");
		}
		else
		{
			System.out.println(" not valid phone number ");
		}

		// only for 10 digit phone number
		// regex - [6-9][0-9]{9}

		//  for 10 digit phone number or 11 digit phone number
		// regex - 0?[6-9][0-9]{9}

		//  for 10 digit phone number or 11 digit phone number or 12 digit also
		// regex - (0|91)?[6-9][0-9]{9}


	}
}
