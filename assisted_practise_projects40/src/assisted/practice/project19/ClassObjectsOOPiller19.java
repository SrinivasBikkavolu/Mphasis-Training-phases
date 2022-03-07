package assisted.practice.project19;

//You are given a project to demonstrate the uses of classes, objects, and the object-oriented pillars in Java.

public class ClassObjectsOOPiller19   extends Parent {
	
	// method overloading
	public int m1(int a,int b) 
	{
		return a + b;
	}
	
	public long m1(long a, long b, long c) 
	{
		return a + b + c;
	}
	
	@Override
	public void m1() 
	{
		System.out.println("Hello I am child class methods.");
	}
	
	public static void main(String[] args) 
	{
		ClassObjectsOOPiller19 object = new ClassObjectsOOPiller19();
		object.m1();	
		
	}
	
}

class Parent
{
	public void m1() 
	{
		System.out.println("Hello I am parent class method");
	}

}
