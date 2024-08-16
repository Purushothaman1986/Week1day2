package Weekday3day2;

public class LearnStringMethods {

	public static void main(String[] args) {

		String name="Test Leaf";
		//input =amazon have launched 100 products
		//output =amazonhavelaunched100prodcuts
		
		String[] split = name.split(" ");
		for (int i = 0; i < split.length; i++) {
			System.out.print(split[i]);
		}
		
		System.out.println();
		
		String replaceAll = name.replaceAll("[ ]", "");
		System.out.println("replaceAll method : "+replaceAll);
		
		String name1="Purushothaman";
		String replace = name1.replace('i', '*');
		System.out.println("replace method :"+ replace);
		
		//subString
		String value="selenium webdriver";
		
		//subString the index value will start with '0'
		String substring = value.substring(9);
		System.out.println("SubString with beginindex :"+substring);
		
		String substring2 = value.substring(7, 18);
		//endindex - 1
		//18-1=17
		System.out.println(substring2);
		
		//lowercase & uppercase
		String comName="Test@Leaf20";
		
		String lowerCase = comName.toLowerCase();
		System.out.println(lowerCase);
		
		String upperCase = comName.toUpperCase();
		System.out.println(upperCase);
		
		String price="2000";
		//string to int format
		int parseInt = Integer.parseInt(price);
		System.out.println(parseInt);
		
		
	}

}