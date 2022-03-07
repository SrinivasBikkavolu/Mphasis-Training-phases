package assisted.practice.project12;

//You are given a project to demonstrate the implementation of thread creation mechanisms

public class ImpThreadCreationMechanism12 extends Thread {

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
		ImpThreadCreationMechanism12 threadObject = new ImpThreadCreationMechanism12();
	
		threadObject.start();
	}
}