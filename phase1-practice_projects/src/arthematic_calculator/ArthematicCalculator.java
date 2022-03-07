package arthematic_calculator;

import java.util.Scanner;

public class ArthematicCalculator 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("eneter the two numbers : ");
		
		int number1=sc.nextInt();
		int number2= sc.nextInt();
		
		System.out.println("Enter the operator : ");
		
		char op=sc.next().charAt(0);
		double Ans=0;

		switch(op)
		{
		 case '+': Ans = number1 + number2;
		 break;
		 case '-': Ans = number1 - number2;
		 break;
		 case '*': Ans = number1 * number2;
		 break;
		 case '/': Ans = number1 / number2;
		 break;
		}
		System.out.println("the answer is : " +Ans);
	}

}
