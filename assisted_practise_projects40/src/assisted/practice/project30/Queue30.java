package assisted.practice.project30;

   //   Write a program to demonstrate working of a queue.

import java.util.*;

public class Queue30
{
	public static void main(String[] args) 
	{
		Queue<String> locationsQueue = new LinkedList<>();
		
		locationsQueue.add("Rajahmundry");
  		locationsQueue.add("Polavaram");
  		locationsQueue.add("Papikondalu");
   		locationsQueue.add("Pattisam");
   		locationsQueue.add("Vijag");
   		locationsQueue.add("Vijayawada");
   		locationsQueue.add("Tirupati");
   		
   		System.out.println("The Queue is : " + locationsQueue);
   		
   		System.out.println("The Head of the Queue : " + locationsQueue.peek());
   		
   		locationsQueue.remove();

   		System.out.println("After removing the Head of the Queue : " + locationsQueue);
   
   		System.out.println("The Size of the Queue : " + locationsQueue.size());
	}

}
