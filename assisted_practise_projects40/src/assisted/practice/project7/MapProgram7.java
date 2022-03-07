package assisted.practice.project7;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

public class MapProgram7 {

	public static void main(String[] args) {
		// map
		
		//Hashmap
		HashMap<Integer,String> hm=new HashMap<Integer,String>();      
	      hm.put(1,"Sri");    
	      hm.put(2,"Raj");    
	      hm.put(3,"Sai");   
	       
	      System.out.println("\nThe elements of Hashmap are ");  
	      for(Map.Entry m:hm.entrySet())
	      {    
	       System.out.println(m.getKey()+" "+m.getValue());    
	      }
	      
	     //HashTable
	       
	      Hashtable<Integer,String> ht=new Hashtable<Integer,String>();  
	      
	      ht.put(4,"Kanthi");  
	      ht.put(5,"Kiran");  
	      ht.put(6,"Venky");  
	      ht.put(7,"Ram");  

	      System.out.println("\nThe elements of HashTable are ");  
	      for(Map.Entry n:ht.entrySet())
	      {    
	       System.out.println(n.getKey()+" "+n.getValue());    
	      }
	      
	      
	      //TreeMap
	      
	      TreeMap<Integer,String> tmap=new TreeMap<Integer,String>();    
	      tmap.put(8,"Ravi");    
	      tmap.put(9,"Kumar");    
	      tmap.put(10,"Ammu");       
	      
	      System.out.println("\nThe elements of TreeMap are ");  
	      for(Map.Entry l:tmap.entrySet())
	      {    
	       System.out.println(l.getKey()+" "+l.getValue());    
	      }
	}

}
