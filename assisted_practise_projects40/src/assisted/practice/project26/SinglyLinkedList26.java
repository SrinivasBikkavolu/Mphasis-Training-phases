package assisted.practice.project26;

//Write a program to create and perform operations on the singly linked list.

public class SinglyLinkedList26 
{
	public Node head = null;
	public Node tail = null;

	class Node 
	{
		int data;
		Node next;

		public Node(int data) 
		{
			this.data = data;
			this.next = null;
		}
	}

	public void addNode(int data) 
	{
		Node newNode = new Node(data);

		if (head == null) 
		{
			head = newNode;
			tail = newNode;
		}
		else
		{
			tail.next = newNode;
			tail = newNode;
		}
	}

	public void display() 
	{
		Node current = head;

		if (head == null) 
		{
			System.out.println("List is empty");
			return;
		}
		System.out.println("Number of the nodes of singly linked list are: ");
		while (current != null) 
		{
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}

	public static void main(String[] args) 
	{
		SinglyLinkedList26 SLList = new SinglyLinkedList26();

		SLList.addNode(2);
		SLList.addNode(6);
		SLList.addNode(5);
		SLList.addNode(4);
		SLList.addNode(2);
		SLList.addNode(6);
		SLList.addNode(5);
		SLList.addNode(4);
		SLList.display();
	}

}
