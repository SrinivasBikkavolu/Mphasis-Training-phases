package assisted.practice.project33;

   //   You are given a project to demonstrate the workflow of a binary search algorithm.

public class BinerySearchAlgorithm33 
{
    public static  void main(String[] args)
    {
        int[] arr = {5,8,9,3,4,6,10};
        int key = 4;
        int arrlength = arr.length;
        binarySearch(arr,0,key,arrlength);
    }
    public static void binarySearch(int[] arr, int start, int key, int length)
    {
        int midValue = (start+length)/2;
        while(start<=length)
        {
            if(arr[midValue]<key)
            {
                start = midValue + 1;
            }
            else if(arr[midValue]==key)
            {
                System.out.println("The Element is found at index :"+midValue);
                break;
            }
            else 
            {
                length=midValue-1;
            }
            midValue = (start+length)/2;
        }
            if(start>length)
            {
                System.out.println("The Element is not found");
            }
	}

}
