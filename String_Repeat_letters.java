package Logic_Based_programs;
import java.util.Scanner;
//Repeating Letters
//Create a function that Take String in which each character is repeated 
//Test Case:i/p: hello  p/o:hheelllloo,  i/p:123  o/p:112233
public class String_Repeat_letters {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		for(int i=0;i<s.length();i++) {
			System.out.print(s.charAt(i)+""+s.charAt(i));
		}
		
		
		
	}

}
