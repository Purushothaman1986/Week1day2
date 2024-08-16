package Week1day2;

public class LearnOperators {

	public static void main(String[] args) {

		System.out.println(8+6);//14
		System.out.println(20/5);//4
		System.out.println(10%2);//0
		
		int a=6;
		System.out.println(a+=7);
		//a=a+7=> a=6+7=> 13
		//a=13
		System.out.println(a-=3);
		//a=a-3=> 13-3=>10
		
		System.out.println(5>7);
		System.out.println(3<1);
		System.out.println(5==5);
		System.out.println(6!=9);
		
		System.out.println((5<6)&&(4==5));
		//true && false = false
		System.out.println((5<6)||(4==5));
		//true || false= true
	}

}