package assisted.practice.project2;

//Write a program to demonstrate how and when access modifiers are used.

public class AccessModifiers2 
extends A 
{
public static void main(String[] args) 
  {

	A object = new A();
	// Private modifier will be accessed Within the class only
	// Only Public Modifier will be Accessed
	System.out.println(object.name1);
	// Only Protected modifier will be Accessed
	System.out.println(object.name3);
	// Only Default modifier will be Accessed
	System.out.println(object.name4);

	
	
   }

}

			class A 
			{

				public String name1 = "Srinu";
				private String name2 = "Kanthi";
				protected String name3 = "Venky";
				String name4 = "SMS";

				public String getName1(String input) 
				{
					return input;

				}

				private String getName2(String input) 
				{
					return input;

				}

				protected String getName3(String input) 
				{
					return input;

				}

				String getName4(String input) 
				{
					return input;
				

	}

}
