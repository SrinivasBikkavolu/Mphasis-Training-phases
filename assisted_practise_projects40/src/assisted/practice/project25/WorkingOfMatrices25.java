package assisted.practice.project25;

  //  Write a program to demonstrate working of matrices.

public class WorkingOfMatrices25
{  
	public static void main(String[] args) 
	{  

   //creating two matrices    
		int a[][]={{2,5,4},{6,7,8},{3,8,9}};     
		int b[][]={{1,2,3},{4,8,1},{5,9,3}};    
    
   //creating another matrix to store the sum of two matrices     
		int c[][]=new int[3][3];  //3 rows and 3 columns  
    
   //adding and printing addition of 2 matrices     
		for(int i=0;i<3;i++)
		{    
			for(int j=0;j<3;j++)
			{    
				c[i][j]=a[i][j]+b[i][j];    //use - for subtraction  
				System.out.print(c[i][j]+" ");    
			}    
			System.out.println();//new line    
		}    	
	}

}
