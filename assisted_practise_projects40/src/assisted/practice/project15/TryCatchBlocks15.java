package assisted.practice.project15;

//You are given a project to demonstrate the uses of try-catch blocks in Java.

public class TryCatchBlocks15 
{
  public static void main(String args[]) 
  {
     
	int[] array = new int[2];
    try 
    {
        array[6] = 2;
    }
    catch (ArrayIndexOutOfBoundsException e) 
    {
        System.out.println("Array index is out of bounds!"); 
    }
    finally 
    {
        System.out.println("The array is of size " + array.length);
    }	  
   }

}
