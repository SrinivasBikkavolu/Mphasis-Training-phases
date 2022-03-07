package assisted.practice.project20;

 //You are given a project to work and resolve the diamond problem using OOPs concepts.

interface A  
{  
  public default void display()   
  {  
    System.out.println("the method of A is invoked");  
  }  
}  
interface B  
{  
  public default void display()   
  {  
    System.out.println("the method of B is invoked");  
  }  
}  	
public class DiamondProblemOOPs20 implements A,B 
{  
	public void display()   
	{  
		A.super.display();  
		B.super.display();  
	}  
	public static void main(String[] args) 
	{
		DiamondProblemOOPs20 obj = new DiamondProblemOOPs20();  

		obj.display();  
	}  
}

