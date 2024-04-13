package Logic_Based_programs;
import java.util.*;;
public class Duck_Number {
	
//	Duck Number
//	program to read a number and check whether it is duck or not
//	Hint:A duck number is number which has Zeros present in it ,
//	but no Zeros present in the begging of the number
//	

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to check DUck number:");
		int n=sc.nextInt();
		int d;
        int count=0;
		while(n!=0)
		{
			d=n%10;
			if(d==0)
			{
				count=1;
				break;
			}
			n=n/10;
		}
		if(count==1)
		{
			System.out.println("yes");
			
		}
		else
		{
			System.out.println("no");

		}
	}

}
