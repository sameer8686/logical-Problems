package Logic_Based_programs;
import java.util.Scanner;
//Shutter Function
//create a funtion that shutter if someone is Stragleing to pronoues
//The First two letters are repeted two times then the word pronuced with Qustion mark
//Test Case:incridable  Output:in..in..incridable?
public class Stirng_Shutter_Function {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println(s.substring(0, 2)+".."+s.substring(0, 2)+".."+s+"?");
		
		
	}

}
