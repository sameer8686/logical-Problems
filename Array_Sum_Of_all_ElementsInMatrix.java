package Logic_Based_programs;

import java.util.Scanner;

//Write a program to add all the elements present in Matrix
public class Array_Sum_Of_all_ElementsInMatrix {

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
        int sum=0; //To add the values of Matrix 
		for (int i = 0; i < n; i++) {

			for (int j = 0; j < m; j++) {
				sum=sum+a[i][j];
			}
		
		}

		System.out.println(sum);
		
	}

}
