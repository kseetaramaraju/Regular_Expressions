package string_tokenizer;

import java.util.StringTokenizer;

public class String_Tokenizer {
	public static void main(String[] args) {

		//case 1
		// default regex or pattern is " "
		//		StringTokenizer st=new StringTokenizer("Durga Software Solutions");
		//		while(st.hasMoreTokens())
		//		{
		//			System.out.println(st.nextToken());
		//		}


		//case 2
		// split using "-"
		StringTokenizer st=new StringTokenizer("27-07-2024","-");
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}

	}
}
