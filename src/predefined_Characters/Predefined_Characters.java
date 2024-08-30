package predefined_Characters;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Predefined_Characters {
	public static void main(String[] args) {

		Pattern p=Pattern.compile(".");
		Matcher m=p.matcher("a7b k@9AB");

		while(m.find())
		{
			System.out.println(m.start()+"---"+m.group());
		}

		// case 1: \s
		// to check spaces 
		// output :	
		//		3--- 

		// case 2: \S
		// to check except spaces 
		// output :	
		//		0---a
		//		1---7
		//		2---b
		//		4---k
		//		5---@
		//		6---9
		//		7---A
		//		8---B

		// case 3: \d
		// to check for only digits  
		// output :	
		//		1---7
		//		6---9

		// case 4: \D
		// to check except digits  
		// output :	
		//		1---7
		//		6---9

		// case 5: \w
		// to check any alphanumeric character that means [a-zA-Z0-9]   
		// output :	
		//		0---a
		//		1---7
		//		2---b
		//		4---k
		//		6---9
		//		7---A
		//		8---B

		// case 6: \W
		// to check except any alphanumeric character that means [^a-zA-Z0-9]   
		// output :	
		//		3--- 
		//		5---@

		// case 7: . (dot)
		// to check any character that means [a-zA-Z0-9] and special characters as well    
		// output :	
		//		0---a
		//		1---7
		//		2---b
		//		3--- 
		//		4---k
		//		5---@
		//		6---9
		//		7---A
		//		8---B













	}
}
