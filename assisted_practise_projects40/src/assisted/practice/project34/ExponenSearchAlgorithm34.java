package assisted.practice.project34;

    //   You are given a project to demonstrate the workflow of an exponential search algorithm.

import java.util.Arrays;

public class ExponenSearchAlgorithm34 
{
	public static  void main(String[] args)
	{
		int[] arr = {5,6,7,8,9,4,10,11,15,18,16};
		int length= arr.length;
		int value = 5;
		int outcome = exponentialSearch(arr,length,value);
		
		if(outcome<0)
		{
			System.out.println( "Element is not present in the array");
		}
		else 
		{
			System.out.println( "Element is  present in the array at index :"+outcome);
		}
	}
	
	public static int exponentialSearch(int[] arr ,int length, int value )
	{
        if(arr[0]==value)
        {
            return 0;
        }
        int i=1;
        while(i<length && arr[i]<=value)
        {
            i=i*2;
        }
        return Arrays.binarySearch(arr,i/2,Math.min(i,length),value);
    }

}
