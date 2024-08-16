package Week4.day1;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDupChar {

	public static void main(String[] args) {

		String name="Selenium";
		//output =   selnium
		char[] ch = name.toCharArray();
		String empty="";
		
		Set<Character>unqi=new LinkedHashSet<Character>();
		
		for (Character character : ch) {
			unqi.add(character);
		}
		//System.out.println(unqi);
		//selnium
		
		for (Character s : unqi) {
			empty+=s;
			//empty=empty+s
		}
		System.out.print(empty);
	}

}


