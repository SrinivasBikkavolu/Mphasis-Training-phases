package assisted.practice.project9;

//  Write a program to create single-dimensional and multidimensional arrays.

public class SingDimeMulDimeArrays9 
{
	public static void single ()
	{
		int ar[]=new int[3]; 
	    ar[0]=15;  
	    ar[1]=25;  
	    ar[2]=35;   
	    for(int i=0;i<ar.length;i++)
	        System.out.println(ar[i]); 
	}
	public static void multi ()
	{
		int arr[][]={{1,2,3},{4,5,6},{7,8,9}};  
		for(int i=0;i<3;i++)
		{  
		 for(int j=0;j<3;j++)
		 {  
		   System.out.print(arr[i][j]+" ");  
	     }  
		 System.out.println();
		}
	}
	public static void main(String args[])
	{  
		single();
		multi();
 	}

}
