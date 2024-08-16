package Week4.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {

	public static void main(String[] args) {

		int[] num={23,89,90,67,34,90,23,76};
		
		//for-each loop
		//for- int i=0,i>num,inc/dec
		
		Set<Integer> value=new TreeSet<Integer>();
		
		//Integer
		for (Integer i : num) {
			value.add(i);
			
		}
		
		System.out.println(value);
		
		//Set- we can use collection.sort? no
		//Set- we not using get()
		//Set- TreeSet -ascii
		
		//print index 4
	
	//we convert set to list
		
		List<Integer> val=new ArrayList<Integer>(value);
		
		Integer data = val.get(4);
		
		System.out.println(data);
		
	}

}