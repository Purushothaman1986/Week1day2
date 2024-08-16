package Weekday3day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LearnListMethods {

	public static void main(String[] args) {

		List<String> mentors=new ArrayList<String>();
		
		//index value will start from '0'
		mentors.add("saicharan");
		mentors.add("Eswara");
		mentors.add("haricharan");
		mentors.add("brindha");
		mentors.add("Purushothman");
		
		
		mentors.add(2, "Anburaj");
		mentors.add("Vineeth");	
		mentors.add("Muthu");


		
		System.out.println(mentors);
		
		int size = mentors.size();
		System.out.println("size of the List :" +size);
		
		
		boolean contains = mentors.contains("brindha");
		System.out.println(contains);
		
		mentors.remove(5);
		
		System.out.println(mentors);
		
		
		String string = mentors.get(5);
		System.out.println(string);
		
		for (int i = 0; i < mentors.size(); i++) {
			System.out.println(mentors.get(i));
			
		}
		
		
		Collections.sort(mentors);
		System.out.println(mentors);
		
		mentors.clear();
		System.out.println(mentors);
		
		int[] age= {2,5,6,7,4,2};
		String[] name= {"saicharan","haricharan","eswar"};
		List<Integer> value=new ArrayList<Integer>();
		for (int i = 0; i < age.length; i++) {
			value.add(age[i]);
		}
		System.out.println(value);

	}
	


}