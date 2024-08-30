package quantifiers;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Quantifiers {
	public static void main(String[] args) {

		Pattern p=Pattern.compile("a?");
		Matcher m=p.matcher("abaabaaab");
		// a b a a b a a a b
		// 0 1 2 3 4 5 6 7 8
		while(m.find())
		{
			System.out.println(m.start()+"----"+m.group());
		}

		//case 1
		//input : a
		//output:
		//		0----a
		//		2----a
		//		3----a
		//		5----a
		//		6----a
		//		7----a

		//case 2
		//input : a+
		//output:
		//		0----a
		//		2----aa
		//		5----aaa

		//case 3
		//input : a*
		//output:
		//		0----a
		//		1----
		//		2----aa
		//		4----
		//		5----aaa
		//		8----
		//		9----

		//case 4
		//input : a?
		//output:
		//		0----a
		//		1----
		//		2----a
		//		3----a
		//		4----
		//		5----a
		//		6----a
		//		7----a
		//		8----
		//		9----






	}
}
