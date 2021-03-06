package assisted.practice.project24;

//Write a program to demonstrate the Range queries

public class RangeQueries24 
{	
	static int k = 18;
	static int N = 10000; 
	static long table[][] = new long[N][k + 1]; 
    static void buildSparseTable(int arr[], int n) 
    { 
        for (int i = 0; i < n; i++) 
        	table[i][0] = arr[i]; 
	    for (int j = 1; j <= k; j++) 
	    	for (int i = 0; i <= n - (1 << j); i++) 
        	table[i][j] = table[i][j - 1] + table[i + (1 << (j - 1))][j - 1]; 
	} 
    static long query(int L, int S) 
    {
    	long answer = 0; 
    	for (int j = k; j >= 0; j--)  
    	{ 
    		if (L + (1 << j) - 1 <= S)  
    		{ 
    			answer = answer + table[L][j];
    			L += 1 << j; 
	        } 
	    }
    	return answer; 
    }
    public static void main(String[] args)
    { 
    	int arr[] = { 1, 6, 9, 5, 8 }; 
	    int n = arr.length; 
	    buildSparseTable(arr, n); 
	    System.out.println(query(0, 6)); 
	    System.out.println(query(5, 6)); 
	    System.out.println(query(3, 9)); 
	}

}
