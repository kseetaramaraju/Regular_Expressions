package user_registration_validation;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pincode {
	public static void main(String[] args) {

		String regex="^[0-9]{3}[\\s]?[0-9]{3}$";

		Scanner sc=new Scanner(System.in);
		System.out.println(" enter pincode ");
		String pincode = sc.nextLine();

		Pattern p=Pattern.compile(regex);
		Matcher m=p.matcher(pincode);

		if(m.find() && m.group().equals(pincode))
		{
			System.out.println(" valid pincode ");
		}
		else {
			System.out.println(" invalid pincode ");
		}


	}
}
