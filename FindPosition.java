import java.util.Scanner;
public class FindPosition {
	public static int findEle(int[] arr1, int num)
	{
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] == num) {
				return (i);
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int n;
		int ele;
		int find;
		
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
		
		System.out.println("Enter the element to find");
		find = sc.nextInt();
		
		//case 1
		int pos = findEle(arr,find);
		System.out.println("Position of ele is:"+pos);
		
		//case 2
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println("Element found at position "+i+" and "+j);
				}
			}
		}
}
}