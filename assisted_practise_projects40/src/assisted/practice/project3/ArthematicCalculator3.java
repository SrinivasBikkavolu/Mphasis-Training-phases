package assisted.practice.project3;

public class ArthematicCalculator3 {

	public int addition(int a ,int b)
	{
		return a+b;
	}
	
	public int substraction(int a ,int b) {
		return a-b;
	}
	
	public int multiplication(int a ,int b) {
		return a*b;
	}
	public int division(int a ,int b) {
		return a/b;
	}
	
	public static void main(String args[]) {
		ArthematicCalculator3 object = new ArthematicCalculator3();
		/*
		 * int additionResponse = object.addition(2, 3);
		 * System.out.println(additionResponse);
		 */
		
		  System.out.println("Addition of two numbers = "+object.addition(5, 6));
		  System.out.println("Substraction of two numbers = "+object.substraction(9, 4));
		  System.out.println("Multiplication of two numbers = "+object.multiplication(6, 5));
		  System.out.println("Division of two numbers = "+object.division(25, 5));
		
	}

}
