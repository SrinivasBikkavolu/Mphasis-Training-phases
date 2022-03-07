package assisted.practice.project37;

   //   You are given a project to demonstrate the workflow of an insertion sort algorithm.

public class InsertionSortAlgorithm37 
{
    public static  void main(String[] args)
    {
        int[] arr = {2,22,5,64,89,3,4,};
        insertionSort(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
     }
    public static void insertionSort(int[] arr)
    {
    	int len = arr.length;    
    	for(int j=1;j<len;j++)
    	{
    		int key = arr[j];
    		int i=j-1;
    		while ((i>-1) && (arr[i]>key))
    		{
    			arr[i+1]=arr[i];
    			i--;
            } 
    		arr[i+1]=key;
         }
	}

}
