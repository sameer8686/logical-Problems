package Logic_Based_programs;

import java.net.MulticastSocket;
import java.util.*;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter lowest number ");
		
		int low= sc.nextInt();
		
		System.out.println("Enter highest number ");
		int high=sc.nextInt();
		int primecount=0;
		for(int i=low;i<=high;i++) {
			boolean isprime=true;
			
			for(int j=2;j<=i/2;j++) {
				if(i%j==0) {
					isprime=false;
					primecount++;
				}
				
			}
			if(isprime) {
				System.out.print(i+" ");
				primecount++;
			}
			
			if(primecount==10) {
				System.out.println();
				primecount=0;
			}
			
			isprime=true;
		}
		
		
	}

}
