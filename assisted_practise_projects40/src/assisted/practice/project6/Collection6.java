package assisted.practice.project6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Vector;

public class Collection6 {

	public static void main(String[] args) {
		//creating arraylist
		System.out.println("ArrayList");
		ArrayList<String> city=new ArrayList<String>();   
	      city.add("Vijag");//
	      city.add("Amaravathi");    	   
	      System.out.println(city);  
		
		//creating vector
	      System.out.println("\n");
	      System.out.println("Vector");
	      Vector<Integer> vec = new Vector();
	      vec.addElement(10); 
	      vec.addElement(20); 
	      System.out.println(vec);
		
		//creating linkedlist
	      System.out.println("\n");
	      System.out.println("LinkedList");
	      LinkedList<String> names=new LinkedList<String>();  
	      names.add("Vas");  
	      names.add("kanthi");  	      
	      Iterator<String> itr=names.iterator();  
	      while(itr.hasNext())  
	       System.out.println(itr.next());  
	       
	       //creating hashset
	       System.out.println("\n");
	       System.out.println("HashSet");
	       HashSet<Integer> set=new HashSet<Integer>();  
	       set.add(111);  
	       set.add(112);  
	       set.add(113);
	       set.add(114);
	       System.out.println(set);
	       
	       //creating linkedhashset
	       System.out.println("\n");
	       System.out.println("LinkedHashSet");
	       LinkedHashSet<Integer> set1=new LinkedHashSet<Integer>();  
	       set1.add(11);  
	       set1.add(13);  
	       set1.add(12);
	       set1.add(14);	       
	       System.out.println(set1);
	}

}
