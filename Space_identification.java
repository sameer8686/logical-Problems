package Logic_Based_programs;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Space_identification {

	public static void main(String[] args) {

		int i,count=0;
		Scanner sc=new Scanner(System.in);
		String s=sc.next().toLowerCase();
		for(i=0;i<s.length();i++)
		{
			if((s.charAt(i)>='a'&&s.charAt(i)<='z')||(s.charAt(i)>='0'&&s.charAt(i)>='9')||(s.charAt(i)==' '))
			{
				continue;
			}
			else
			{
				count++;
			}
		}
		System.out.println(count);

		
		
	}

}
