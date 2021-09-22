package assignmentSep22;

import java.util.Scanner;

//CASE 1 - Using one method
public class Fibonacci {
	
	int prev = 1;
	int next = 1;
	int sum = 0;
	int val;
	
	public void fibo(int n) {
		int prev = 1;
		int next = 1;
		int sum = 0;
		
		for(int i =0;i<n;i++) {
			sum = sum + prev;
			prev = next;
			next = sum;
			System.out.print(prev+" ");
		}
	}
	
	//CASE 2 - Using two methods alternatively
	/*public void method1(int n) {
		
		for(int i =0;i<n;i++) {
			
			sum = sum + prev;
			prev = next;
			next = sum;
			System.out.print(prev+" ");
			
			val = i;
			method2(n);
		}
	}
	
	public void method2(int n) {
		
		for(int i=val;i<n;i++) {
			sum = sum + prev;
			prev = next;
			next = sum;
			System.out.print(prev+" ");
			method1(n);
		}
	}*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of terms: ");
		int n = sc.nextInt();
		
		Fibonacci obj = new Fibonacci();
		obj.fibo(n);
	/*	System.out.println();
		obj.method1(n); */
	}
}
