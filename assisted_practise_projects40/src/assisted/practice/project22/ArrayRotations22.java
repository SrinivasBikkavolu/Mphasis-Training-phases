package assisted.practice.project22;

//Write a program to Demonstrate Array rotation

public class ArrayRotations22
{
	
	public static void main(String[] args)
	{
			int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
			int n = arr.length;
			int s = 3;
			int[] temp = new int[n];
			for (int i = 0; i < s; i++)
				temp[i] = arr[i];

			int a = s;
			for (int i = 0; a < n; i++) 
			{
				arr[i] = arr[a++];
			}
			a = 0;

			for (int i = n - s; i < n; i++)
				arr[i] = temp[a++];

			for (int i = 0; i < 7; i++)
				System.out.print(arr[i] + " ");
			    System.out.print(" : after Array Rotation");

	}

}
