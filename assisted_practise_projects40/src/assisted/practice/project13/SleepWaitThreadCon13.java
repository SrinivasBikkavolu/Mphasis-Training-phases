package assisted.practice.project13;

//You are given a project to demonstrate the execution of sleep(), wait(), and its uses in the threading concept.

public class SleepWaitThreadCon13
{
	private static Object obj = new Object();

	public static void main(String[] args)  throws InterruptedException 
	{		
		Thread.sleep(2000);
		
		System.out.println(Thread.currentThread().getName() + " Thread is invoked after two second");
	
		synchronized (obj)
		{
			obj.wait(2000);
	
			System.out.println(obj + " Object is in waiting state and invoked after 2 seconds");
		}
			

	}

}
