package src;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class test1 {

	public static void main(String[] args) {
		short s1 = 1; 
		//s1 = s1 + 1;
		
		short s2 = 1; 
		s2 += 1;
		
		final String a = "ssss";
		//a= a+"123";
		
		final StringBuffer a1=new StringBuffer("immutable");
		a1.append("123");
		System.out.println(a1.toString());
		
		final int i = 1;
		//i=i+1;
		final Integer i1= new Integer(1);
		//i1 ++;
		
		Set set = new HashSet();
		set.add("11");
		set.add("11");
		set.add("22");
		set.add(null);
		for (Iterator iterator = set.iterator(); iterator.hasNext();) {
			String t = (String) iterator.next();
			System.out.println(t);
		}
		
		
		System.out.println(set.toString());
		
		Set set1 = new TreeSet();
		set1.add("1");
		set1.add("1");
		set1.add("2");
		//set1.add(null);  TreeSet value 不能为null
		System.out.println(set1.toString());
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "A");
		map.put(1, "B");
		map.put(2, "B");
		map.put(null, null);
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey()+"_"+entry.getValue());
		}
		System.out.println(map.toString());
		
		Map<String, String> map2 = new HashMap<String, String>();
		map2.put("a", "AA");
		map2.put("b", "BB");
		map2.put("a", "BB");
		for (Map.Entry<String, String> entry : map2.entrySet()) {
			System.out.println(entry.getKey()+"_"+entry.getValue());
		}
		
		Map map3 = new Hashtable();
		map3.put("a", "AAA");
		map3.put("b", "BBB");
		map3.put("a", "BBB");
		//map3.put(null, null);  Hashtable key value 都不能为null
		
		Map<String, String> map4 = new TreeMap<String, String>();
		map4.put("a", "AAAA");
		map4.put("b", "BBBB");
		map4.put("a", "BBBB");
		map4.put("c", null);  //TreeMap key 不能为null
		for (Map.Entry<String, String> entry : map4.entrySet()) {
			System.out.println(entry.getKey()+"_"+entry.getValue());
		}
		
		List list = new  ArrayList();
		list.add(1);
		list.add(null);
		for (Object object : list) {
			if(object != null){
				System.out.println(object.toString());
			}
		}
		
		new son(a, i1).change11();
	
	}
	
	public String testStaic(){
		return "dd";
	} 

}

abstract class father {
	int name;
	String gender;
	public father(String a, int i){
		name = i;
		gender = a;
	}
	
	public void change(){
		this.name ++;
	}
	
	abstract public void change11();
}

class son extends father{
	
	public son(String a, int i) {
		super(a, i);
	}

	public void change11() {
		
	}

}