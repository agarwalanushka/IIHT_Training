package assignmentSep21;

import java.util.Scanner;

public class Assignment5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the Array: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println();
		System.out.print("Enter the Array: ");
		
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		//CASE 1
		boolean[] checked = new boolean[n];
		
		for(int i=0;i<n;i++) {
			checked[i] = false;
		}
		
		int unique = 0; //to be used in case 3
		
		System.out.println("CASE 1: ");
		
		System.out.print("[ ");
		
		for(int i=0;i<n;i++) {
			if(!checked[i]) {
				unique ++;
				System.out.print(arr[i]+" ");
				
				for(int j= i+1 ; j<n ;j++) {
					if(arr[i]==arr[j]) {
						
						System.out.print(arr[j]+" ");
						checked[j]= true;
					}
				}
			}
		}
		
		System.out.print("] ");
		
		System.out.println();
		
		//CASE 2
		
		int temp;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]>arr[j]) {
					temp = arr[i];
					arr[i]= arr[j];
					arr[j]= temp;
				}
			}
		}
		
		System.out.println("CASE 2- Sorted array: ");
		
		System.out.print("[ ");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.print("] ");
		
		/*//CASE 3
		//COUNT
		
		int[] count = new int[unique];
		
		int j ;
		for(int i =0;i<n;i++) {
			j = i+1;
			if(j>=n) {
				break;
			}
			
		}*/
		
	}
}
