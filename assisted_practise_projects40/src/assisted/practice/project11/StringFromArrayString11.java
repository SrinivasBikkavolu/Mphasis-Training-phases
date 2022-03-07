package assisted.practice.project11;

import java.util.Arrays;
import java.util.Scanner;

//Write a program to search String entered by a user from the Array of Strings


public class StringFromArrayString11 {

	public static void main(String[] args)
	{
        String[] array = {"Srinu", "Kanthi", "Venky", "Raj", "Ravi"};
		
		Scanner scr = new Scanner(System.in);
		
		System.out.println("Please enter string : ");
		
		String input = scr.next();
		
		if(Arrays.asList(array).contains(input)) 
		{			
			System.out.println("true");
		}
		else 
		{
			System.out.println("false");
		}

	}

}
