package Logic_Based_programs;

import java.util.Scanner;

//create a program to find sum of the Oppsite Diagonal elements
public class Array_Sum_Of_OppsDiagonal_inMatrix {

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
		
					sum=sum+a[i][3-i-1];
				}
		System.out.println(sum);
		
			}
				
	}


