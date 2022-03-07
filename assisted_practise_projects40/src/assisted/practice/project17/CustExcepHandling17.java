package assisted.practice.project17;

//You are given a project to demonstrate a program implementing the concept of exception handling available in Java and the custom exception handlers.

public class CustExcepHandling17 
{
	
	String getString(String s) 
	{
		return s.concat("test"); 
	}
	
	 public static void main(String[] args) 
	 {
		 CustExcepHandling17 object = new CustExcepHandling17();
		 try 
		 {
	  		object.getString(null);
	    		
		 }
		 catch (Exception e) 
		 {
	   		System.out.println(e);
	   	 }
		 finally 
	     {
			System.out.println("Hello, I am finally block and I will always execute");
		 }
	    	
	 }

}
