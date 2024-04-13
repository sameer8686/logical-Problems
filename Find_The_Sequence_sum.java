package Logic_Based_programs;
import java.util.*;
public class Find_The_Sequence_sum {

//	Given thre  intrger i,j,k a squence sum to be value if i+(i+i)+(i+2)+....+j+(j+i)+(j+2)+......+k
//	increment from i until it eqauls to j,then decrement j until equals k) given values i,j,k.cluculate
//the sequence sum as described
//	
	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the value of x:");
     int i=sc.nextInt();
     System.out.println("Enter the value of y:");
     int j=sc.nextInt();
     System.out.println("Enter the value of z:");
     int k=sc.nextInt();
     int sum=0;
     while(i<=j)
     {
    	 sum=sum+(i++);
     }
     while(j!=k)
     {
    	 sum=sum+(--j);
     }
     System.out.println( "The sum of Sequence is :"+sum);
     
 
		
	}

}
