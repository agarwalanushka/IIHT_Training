import java.util.Scanner;
public class ArrayAssignment {
	public static void main(String[] args) {
		int n;
		int ele;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the array");
		n = sc.nextInt();
		
		int[] arr = new int[n];
		System.out.println("Enter the array elements");
		for(int i=0;i<n;i++)
		{
			ele = sc.nextInt();
			arr[i]=ele;
		}
		
		System.out.println("Given Array: ");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		int temp;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println();
		System.out.println("Sorted Array: ");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
