import java.util.Arrays;

public class Question4 {

	public static void main(String[] args) {
		int[] arr1 = {3, 4,5,2};
		int[] arr2 = new int[4];
		
		System.out.println("Existing array:  " + Arrays.toString(arr1));
     for(int i=0; i< arr1.length ; i++) {
    	 arr2[i] = arr1[i];
    	 }
    	 System.out.println("The Copied array:" + Arrays.toString(arr2) ); 
	}

}


/*
Write a Java program to copy an array by iterating the array.
 Arr1 [3, 4,5,2] Arr2 [null, null, null, null]
*/