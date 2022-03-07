package assisted.practice.project29;

   //  Write a program to perform operations on a stack.

public class Stack29 
{ 
    	static final int MAX = 1000; 
    	int top; 
    	int ar[] = new int[MAX];  
 
    boolean isEmpty() 
    	{ 
        		return (top < 0); 
    	} 
    	Stack29() 
    	{ 
        		top = -1; 
    	}
    	
  	boolean push(int b) 
    	{ 
        		if (top >= (MAX-1)) 
        		{ 
            			System.out.println("Stack Overflow"); 
            			return false; 
        		} 
        		else
        		{ 
            			ar[++top] = b; 
            			System.out.println(b + " pushed into stack"); 
            			return true; 
        		} 
    	} 
   int pop() 
    	{ 
        		if (top < 0) 
        		{ 
            			System.out.println("Stack Underflow"); 
            			return 0; 
        		} 
        		else
        		{ 
            			int b = ar[top--]; 
            			return b; 
        		} 
    	} 
    
    	public static void main(String args[])
{
        		Stack29 St = new Stack29(); 
        		St.push(15); 
        		St.push(25); 
        		St.push(35); 
        		System.out.println(St.pop() + " Popped from Stack"); 
        		System.out.println(St.pop() + " Popped from Stack"); 
        		System.out.println(St.pop() + " Popped from Stack"); 
        		


	}

}
