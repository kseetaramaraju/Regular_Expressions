package splitmethod;

import java.util.regex.Pattern;

public class Split_Method {
	public static void main(String[] args) {

		Pattern p=Pattern.compile("\\.");
		String []s=p.split("www.durgasoft.com");
		for(String s1:s)
		{
			System.out.println(s1);
		}


		//		case 1
		//	  input : \\s (space)
		//output :
		//		Durga
		//		Software
		//		Solutions

		//		case 2
		//	  input : a
		//output :
		//		Durg
		//		a Softwa
		//		re Solutions



	}
}
