package Weekday3day2;

public class CountNoOfCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name="Selenium webDriver";
		//e
		//r
		int count=0;
		int countR=0;
		char[] ch = name.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]=='e') {
				//if('e'=='e')
				count++;
			}else if(ch[i]=='r') {
				countR++;
			}
		}
		System.out.println("total number 'e' is presented : "+count);
		System.out.println("total number 'r' is presented :"+ countR);
	}

}