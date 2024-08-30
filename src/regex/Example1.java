package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example1 {
	public static void main(String[] args) {

		Pattern p=Pattern.compile("bb");
		Matcher m=p.matcher("ababbbab");
		int count=0;
		while(m.find())
		{
			count++;
			System.out.println(m.start()+"----"+m.end()+"----"+m.group());
		}
		System.out.println(" Occured : "+count+" times ");
	}
}
