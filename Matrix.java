package assignmentSep22;

import java.util.Scanner;
public class Matrix {
	public static void main(String[] args) {
		int[][] arr;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the 2d array: ");
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		arr = new int[n][m];
		
		System.out.println("required matrix: ");
		
		int a = 1;
		for(int i =0;i<n;i++) {
			if(i%2==0) {
				for(int j =0;j<m;j++) {
					arr[i][j] = a;
					a++;
				}
			}
			else {
				for(int j = m-1; j>=0;j--) {
					arr[i][j] = a;
					a++;
				}
			}
		}
		
		for(int i =0;i<n;i++) {
			for(int j =0;j<m;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
