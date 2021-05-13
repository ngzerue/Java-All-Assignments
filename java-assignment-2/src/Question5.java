import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		int Sum = 0;
		Scanner input = new Scanner(System.in);
		//System.out.println("Enter two numbers: ");
		
		System.out.print("First number: ");
		int a = input.nextInt();
		System.out.print("Second number: ");
		int b = input.nextInt();
		
		Sum = a + b;
		int Difference = a - b;
		System.out.println("The sum of the two numbers is: " + Sum);
		System.out.println("The difference of two numbers is: " + Difference);

	}

}

/* Write a Java program which reads two integers from the user 
 and prints the sum and difference both in their own line.
  Example Enter first number: 7
          Enter second number: 6
          Sum: 13
          Difference: 1 */
