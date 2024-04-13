package Logic_Based_programs;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Email_input_Verfication {

//	write a program for email construction which start with letter and second it should be either underscore
//	or digit and then with @email.com
//	
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		Pattern p=Pattern.compile("[a-z]+[_|0-9]@gmail[.]com");
		Matcher m=p.matcher(s);
		if(m.find()&&m.group().equals(s))
			System.out.println("true");
		else
			System.out.println("false");
		
		
		
	}

}
