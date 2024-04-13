package Logic_Based_programs;

import java.util.Scanner;

//Sum of digits between two numbers
//create a funtion that sum the total numbers os digits between two numbers inclusive .for 
//example number between are 19 and 22,then (1+9)+(2+0)+(2+1)+(2+2)=19
public class Sum_between_Two_numbers {

	static int sumOfDigits(int i) {
		int d,s=0;
		while(i!=0) {
			d=i%10;
			s=s+d;
			i=i/10;
		}
		return s;
		
	}
	
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number :");
		int n1=sc.nextInt();
		System.out.println("Enter the last number :");
		int n2=sc.nextInt();
		int sum=0;
		for(int i=n1;i<=n2;i++) {
			sum=sum+sumOfDigits(i);
		}
		System.out.println("Sum between digits of between range :"+sum);
		
		
	}

}
