package Logic_Based_programs;

import java.util.Scanner;

public class Pin_Generate_by_Three_input {

	static int maxD(int n)
	{
		int m=0;
		while(n!=0)
		{
			if(n%10>m)
				m=n%10;
			n=n/10;
		}
		return m;
	}
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt(),n2=sc.nextInt(),n3=sc.nextInt();
		int d1,d2,d3,d4,pin;
		d1=Math.min(Math.min(n1%10,n2%10),n3%10);
		d2=Math.min(Math.min((n1/10)%10,(n2/10)%10),(n3/10)%10);
		d3=Math.min(Math.min((n1/100)%10,(n2/100)%10),(n3/100)%10);
		d4=Math.max(Math.max(maxD(n1),maxD(n2)),maxD(n3));
		pin=d4*1000+d3*100+d2*10+d1;
		System.out.println("Your Pin is:"+pin);
		
		
	}

}
