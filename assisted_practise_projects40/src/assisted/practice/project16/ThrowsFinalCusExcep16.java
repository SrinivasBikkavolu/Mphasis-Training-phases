package assisted.practice.project16;

//You are given a project to demonstrate the uses of the throws, throw, finally, and custom exceptions in Java.

class INVALIDAGEEXCEPTION extends Exception
{
	String s1;
	 INVALIDAGEEXCEPTION(String s) 
	 {
		 s1=s;
	 }
	 @Override
	   public String toString()
       { 
	      return ("Output String = "+s1);
	   }
}
public class ThrowsFinalCusExcep16 
{

	private static final String checkAge = null;

	public int m1(int a, int b) 
	{
		return a / b;
	}

	public String m2(String s1) throws NullPointerException
	{
		return s1.concat("Srinu");
	}
	
	public void checkEligibilityToVote(int age) 
	{
		if(age>=18) 
		{
			System.out.println("Eligible for vote");
		}
		else if(age<18)
		{
			try
			{
			throw new INVALIDAGEEXCEPTION("Please enter valid age");
			}
			catch (INVALIDAGEEXCEPTION exception)
			{
				System.out.println(exception);
			}
		}
	}

	public static void main(String[] args)
	{
		ThrowsFinalCusExcep16 object = new ThrowsFinalCusExcep16();
		try 
		{
			System.out.println(object.m1(10, 2));
			System.out.println(object.m2(null));
			object.checkEligibilityToVote(16);
		}
		catch (Exception e) 
		{
			System.out.println(e);
		} 
		finally
		{
			System.out.println("Try Catch is Completed");
		}

	}

}
