package src;

import java.util.Objects;

public class Item implements Comparable<Item>{
	private String description;
	private int partNumber;
	
	public Item(String aDescription , int aPratNUmber){
		description = aDescription;
		partNumber = aPratNUmber;
	}
	
	public String getDescription(){
		return description;
	}
	
	public String toString(){
		return "[desccrition=" + description +", partNumber=" + partNumber+ "]";
	}
	
	public boolean queuals(Object otherObject){
		if(this == otherObject) return true;
		if(otherObject == null) return false;
		if(getClass()!= otherObject.getClass()) return false;
		Item other = (Item) otherObject;
		return Objects.equals(description , other.description) && partNumber == other.partNumber;
	}
	
	public int hashCode(){
		return Objects.hash(description,partNumber);
	}

	public int compareTo(Item o) {
		return Integer.compare(partNumber, o.partNumber);
	}
	

}
