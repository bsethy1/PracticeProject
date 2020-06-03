package SeleniumCocept;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class CollectionFramework {

	public static void main(String[] args) {
		/*
		 * List <String> list = new ArrayList(); list.add("Bibhuti");
		 * list.add("Priyanka"); list.add("Soni"); list.add("Pk");
		 * list.add("Priyanka Katare"); Iterator itr= list.iterator();
		 * while(itr.hasNext()) { System.out.println(itr.next());
		 * 
		 */
		List<String> list = new LinkedList();
		list.add("Priyanka");
		list.add("Soni");
		list.add("Madhavi");
	
		
		ListIterator<String> list1=list.listIterator(list.size());  
		 while(list1.hasPrevious())  
         {  
             String str=list1.previous();  
             System.out.println(str);  
         }  
		}

	}


