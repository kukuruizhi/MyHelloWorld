package src;

import java.util.Comparator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		SortedSet<Item> parts= new TreeSet<Item>();	
		parts.add(new Item("Toaster",3333));
		parts.add(new Item("Widget",2222));
		parts.add(new Item("Modem",4444));
		System.out.println(parts);
		
		SortedSet<Item> sortByDescription = new TreeSet<Item>(new 
			Comparator<Item>(){
			public int compare(Item a, Item b){
				String descrA = a.getDescription();
				String descrB = b.getDescription();
				return descrA.compareTo(descrB);
			}
		});
		
		sortByDescription.addAll(parts);
		System.out.println(sortByDescription);
		
		SortedSet parts2= new TreeSet();
		parts2.add("bbb");
		parts2.add("aaa");
		parts2.add("22");
		parts2.add("111");
		parts2.add("22");
		parts2.add("ccc");
		System.out.println(parts2);
		
		Set parts3= new TreeSet<String>();
		parts3.add("bbb");
		parts3.add("aaa");
		parts3.add("22");
		System.out.println(parts3);
	} 

}
