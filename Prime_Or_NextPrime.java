package Logic_Based_programs;
//create a funtion for prime number to check whether give number is prime or not and if
//given number is prime then print that number if not print next prime number

import java.util.Scanner;

public class Prime_Or_NextPrime {
static boolean isprime(int n) {
	 int f=0,i;
	 for(i=1;i<=n;i++) {
		 if(n%i==0)
			 f++;
	 }
	 return f==2;
}
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		while(true) {
			if(isprime(n)) {
				System.out.println(n);
				break;
			}
			n++;
		}
		
		
		
		
		
		
		
		
		
		
	}

}
