package Logic_Based_programs;
//Create a program to add sum of all diagonal values of the matrix
import java.util.Scanner;

public class Array_Sum_Of_diagonalElements_inMatrix {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the rows :");
		int n = sc.nextInt();
		System.out.println("Enter the coloums :");
		int m = sc.nextInt();
		int[][] a = new int[n][m];
		
		for (int i = 0; i < n; i++) {

			for (int j = 0; j < m; j++) {
				a[i][j] = sc.nextInt();
			}
		}
        
		int sum=0;
		for (int i = 0; i < n; i++) {

			
			
			for (int j = 0; j < m; j++) {
				if(i==j) {
					sum=sum+a[i][j];
				}
			}
			System.out.println(sum);
		
		}

	}

}