import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number: ");
		  
		double input= sc.nextDouble();
		if(input > 0) {
			System.out.println("The number is positive.");
		}
		else if(input<0) {
			System.out.println("The number is negative.");
		}
		else {
			System.out.println("It is zero");
		}
		

	}

}

// Write a Java program to get a number from the user and print whether it is positive or negative 