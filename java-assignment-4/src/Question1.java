
public class Question1 {

	public static void main(String[] args) {
		
		int [] myArray= {2,3,4,5,6};
		int sum = 0;
		
		for(int i=0; i< myArray.length ; i++) {
			  sum += myArray[i];
		}
		  
		 double average = sum / myArray.length; 
		
		 System.out.println(average);
	}

}

 // Write a Java program to calculate the average value of array integers.

