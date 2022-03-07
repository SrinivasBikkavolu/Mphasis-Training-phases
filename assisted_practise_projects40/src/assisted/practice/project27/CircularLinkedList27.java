package assisted.practice.project27;

//Write a program to create and perform operations on the circular linked list.

public class CircularLinkedList27 
{
	public class Node 
	{
		int data;
		Node next;

		public Node(int data) 
		{
			this.data = data;
		}
	}

	public Node head = null;
	public Node tail = null;

	public void add(int data) 
	{
		Node newNode = new Node(data);
		if (head == null) 
		{
			head = newNode;
			tail = newNode;
			newNode.next = head;
		}
		else 
		{
			tail.next = newNode;
			tail = newNode;
			tail.next = head;
		}
	}
	public void display() 
	{
		Node current = head;
		if (head == null) 
		{
			System.out.println(" Given that list is empty");
		}
		else 
		{
			System.out.println(" The number of nodes of the circular linked list are: ");
			do 
			{
				System.out.print(" " + current.data);
				current = current.next;
			}
			while (current != head);
			System.out.println();
		}
	}

	public static void main(String[] args) {
		CircularLinkedList27 CLList = new CircularLinkedList27();
		CLList.add(2);
		CLList.add(5);
		CLList.add(6);
		CLList.add(7);
		CLList.add(8);
		CLList.display();
	}

}
