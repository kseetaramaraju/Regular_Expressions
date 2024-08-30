package to_extract_all_valid_mobilenumbersandemailids;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Extract_All_Valid_MobileNumbersAndEmail_Ids {
	public static void main(String[] args) {

		String mobileNumber="((0|91)?[6-9][0-9]{9})";
		String email="[a-zA-Z0-9]([a-zA-Z0-9_+-][.]?[^.])*@[a-zA-Z0-9]+([.][a-zA-Z]{2,}){1,2}";

		// [a-zA-Z0-9]([a-zA-Z0-9_+-][.]?[^.])*@[a-zA-Z0-9]+([.][a-zA-Z]{2,}){1,2}

		Pattern p=Pattern.compile( " ((0|91)?[6-9][0-9]{9})| ( [a-zA-Z0-9]([a-zA-Z0-9+_-][.]?[^.])*@[a-zA-Z0-9]+([.][a-zA-Z]{2,}){1,2} ) " );
		//Pattern p=Pattern.compile(email);
		try {
			FileWriter fw=new FileWriter("output.txt",true);
			BufferedReader br=new BufferedReader(new FileReader("input.txt"));
			String line=br.readLine();

			while(line!=null)
			{
				Matcher m=p.matcher(line);
				if(m.find())
				{
					fw.write(m.group()+"\n");
					fw.flush();
				}
				line=br.readLine();
			}
			System.out.println(" done ");
			br.close();
			fw.close();


		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}
}
