package Weekday3;

public class LearnString {

	public static void main(String[] args) {

		String cName="TestLeaf";
		String name="Testleaf@2024";
		String comName=new String("TestLeaf");
		
		//length
		int length = name.length();
		System.out.println("length of the string :"+length);
		
		//chatAt
		//index value start from '0'
		char charAt = name.charAt(8);
		System.out.println("print index 8 value :"+charAt);
		
		//contains
		boolean contains = cName.contains("Lea");
		System.out.println("checking the character in the String :"+contains);
	
	  //equals
		if(cName.equals(comName)) {
			System.out.println("its is equals");
		}else {
			System.out.println("not equals");
		}
		
		//what is diff b/w .equals and ==
		//TestLeaf==TestLeaf
		//== => will check memory address the value
		if(cName==comName) {
			System.out.println("its is equals");
		}else {
			System.out.println("not equals");
		}	
		
		
	String v="TestLeaf";
	if(cName==v){
		System.out.println("its is equals");
	}else {
		System.out.println("not equals");
	}	
	
	//equalIngoreCase
	
	String date="Testleaf";
	if(date.equalsIgnoreCase(v)){
		System.out.println("its is equalIngoreCase");
	}else {
		System.out.println("not equalsequalIngoreCase");
	}	
	
	//tocharArray
	String nameId="Purushothaman";
	
	char[] ch = nameId.toCharArray();
	for (int i = 0; i < ch.length; i++) {
		System.out.println(ch[i]);
	}
	
	
	
	}

}