package Week1day2;

import java.util.Arrays;

public class PrintDuplicateValue {

	public static void main(String[] args) {

		int[] value= {23,45,78,43,23,65,89,78};
		
		// 2 for loop -nested for loop
		// 1 for loop
		
		//nested for loop
		//i=23 -outer loop
		//1=45
		for (int i = 0; i < value.length; i++) {
			
			//inner loop
			//0+1=45
			//1+1
			for (int j = i+1; j < value.length; j++) {
				
				if(value[i]==value[j]) {
					System.out.println("duplicate number is "+ value[j]);
				}
			}
		}
		
		
		int[] age= {23,54,56,12,54,67,89,12};
		
		//sort 
		Arrays.sort(age);
		//12,12,23,54,54,56,67,89
		
		for (int i = 0; i < age.length-1; i++) {
			if(age[i]==age[i+1]) {
				System.out.println("Duplicate value using single for loop :"+age[i+1]);
			}
			
		}
	}

}
