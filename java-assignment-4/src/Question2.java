import java.util.stream.IntStream;

public class Question2 {

	public static void main(String[] args) {
		int[] num = {4,6,7,9};
	    int toFind = 5;

	    boolean found = IntStream.of(num).anyMatch(n -> n == toFind);

	    if(found)
	      System.out.println(toFind + " is found.");
	    else
	      System.out.println(toFind + " is not found.");

	}

}

// Write a Java program to test if an array contains a specific value. [4, 6, 7, 9] x=5
