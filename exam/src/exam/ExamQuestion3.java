package exam;

import java.util.Scanner;

public class ExamQuestion3 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the string: ");
		String a = s.next();
		if(a.length()==10) {
			
			System.out.println("Valid phone number");
		}
			else if(a.length()>10) {
				System.out.println("Invalid phone number (too long)");
				
			}
			else {
				System.out.println("Invalid phone number (too short)");
				
			}
		

	
	}
}

/*  Write a program that validates a phone number input,  make sure the length of the input is 10 digits
        Example: 	“6414514473” -  		Valid phone number
		      	“62354609845454” - 	Invalid phone number (too long)
			“56454”			Invalid phone number (too short) */
