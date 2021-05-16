package exam;

import java.util.Scanner;

public class ExamQuestion2 {
      
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter marks:");
		   int marks = sc.nextInt();
		if(marks >=90 && marks <=100) {
			System.out.println( "Grade A");
	
		}
		else if(marks>=80 && marks<90) {
			System.out.println("Grade B");
			
		}
		else if(marks>=70 && marks<80) {
			System.out.println("Grade C");
		}
       else if(marks>=50 && marks<70) {
    	   System.out.println("Grade D");
		}
     else if(marks>=0 && marks<50) {
    	 System.out.println( "Grade F");
          }
     else {
    	 
    	 System.out.println( "Invalid number.Your mark should be between 0 and 100");
     }
		

	}

}
/*
 * Write a program that accepts mark of a student and prints the grade If the
 * average of marks is >= 90 then prints Grade ‘A’ If the average of mark is
 * >=80 then prints Grade ‘B’ If the average of mark is >=70 then prints Grade
 * ‘C’ If the average of mark is >=50 then prints Grade ‘D’ else prints Grade
 * ‘F’ Note: Mark of a student should be between 0 and 100
 */
