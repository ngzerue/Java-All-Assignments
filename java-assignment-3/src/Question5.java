import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		
		
		Scanner input= new Scanner(System.in);
		  double sum=0;
		  int count=0;
		
		System.out.println("Enter number: ");
		
		while(input.hasNextDouble()) { 
			
			double in = input.nextDouble();
			sum = sum + in;
			count++;
			}
		double average =0;
		if(count>0) {
			average = sum/count;
			
		}
		System.out.println(average);
		
		}
	}



/* Use while loop and create a program that calculates the average 
  of the numbers between x and y.
   x and y are the integers the user has to input.  */
