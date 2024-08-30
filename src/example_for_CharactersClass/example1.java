package example_for_CharactersClass;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class example1 {
	public static void main(String[] args) {

		Pattern p=Pattern.compile("[^a-zA-Z0-9]");
		Matcher m=p.matcher("a7b@z#9B");

		while(m.find())
		{
			System.out.println(m.start()+"---"+m.group());
		}

		// case 1
		// [abc]
		// output : 
		//		0---a
		//		2---b

		// case 2
		// [^abc]
		// output : 
		//		1---7
		//		3---@
		//		4---z
		//		5---#
		//		6---9

		// case 3
		// [a-z]
		// output : 
		//		0---a
		//		2---b
		//		4---z

		// case 4
		// [A-Z]
		// output : 
		//		7---B

		// case 5
		// [a-zA-Z]
		// output : 
		//		0---a
		//		2---b
		//		4---z
		//		7---B

		// case 6
		// [0-9]
		// output : 
		//		1---7
		//		6---9

		// case 7
		// [a-zA-Z0-9]
		// output : 
		//		0---a
		//		1---7
		//		2---b
		//		4---z
		//		6---9
		//		7---B

		// case 8
		// [^a-zA-Z0-9]
		// output : 
		//		3---@
		//		5---#


	}
}
