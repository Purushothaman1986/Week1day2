package Week1day2;

import java.util.Arrays;

public class LearnArrays {

	public static void main(String[] args) {
int[] data= {20,43,45,67,21,56};

//find length of the array
int length = data.length;
System.out.println("total length of array :"+length);
	
//find last value from the array
System.out.println(data[length-1]);
//data[6-1]=>data[5]

//find largest number in the array
//sort the array
Arrays.sort(data);
//20,21,43,45,56,67
	
System.out.println("Largest value in the array :"+data[length-1]);

System.out.println("Pick one value from array :"+data[3]);

//print all value for sort
for (int i = 0; i < length; i++) {
	System.out.println(data[i]);
}

for (int i = length-1; i >=0; i--) {
	System.out.println(data[i]);
}




	}

}