package assisted.practice.project12;

//Thread creation using Runnable interface

public class ImpThreadCreationMechanism12a implements Runnable {

	public void run() 
	{
		for (int i = 0; i <= 15; i++)
		{
			System.out.println(i);
		}
		System.out.println("run method logic executed");
	}

	public static void main(String[] args) 
	{
		ImpThreadCreationMechanism12a threadObject = new ImpThreadCreationMechanism12a();
		
		Thread obj = new Thread(threadObject);
	
		obj.start();
	}

}
