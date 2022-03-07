package assisted.practice.project14;

//You are given a project to demonstrate the multithreading with and without synchronization.

public class MultiThreadSync14 implements Runnable
{

	public static void main(String[] args)
	{
		MultiThreadSync14 object = new MultiThreadSync14();
		
		Thread threadObject = new Thread(object);
		
		// without synchronization
		
		threadObject.start();
		
		// with synchronization
		
		object.m1();		        
	}
	public void run() 
	{
		System.out.println("Have a graet day..");
		System.out.println("hello..");
		System.out.println("hi..");
	}
	public void m1() 
	{
		synchronized(this)
		{
			for(int i=0;i<10;i++) 
			{
	    		System.out.println(i);
	    	}
			    	
	   }

	}

}
