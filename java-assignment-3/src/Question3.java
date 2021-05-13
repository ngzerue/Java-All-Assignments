import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter number: ");
		
		int day = sc.nextInt();
		switch (day) {
		  case 1:
		    System.out.println("Monday. " +  "Monday is a weekday");
		    break;
		  case 2:
		    System.out.println("Tuesday. " +  "Tuesday is a weekday" );
		    break;
		  case 3:
		    System.out.println("Wednesday. " + "Wednesday is a weekday");
		    break;
		  case 4:
		    System.out.println("Thursday. " + "Thursday is a weekday");
		    break;
		  case 5:
		    System.out.println("Friday. " + "Friday is a weekday");
		    break;
		  case 6:
		    System.out.println("Saturday. " + "Saturday is a weekend");
		    break;
		  case 7:
		    System.out.println("Sunday. " + "Sunday is a weekend");
		    break;
	}

}
}


/*
3.Write a program that takes integer input ( 1 to 7)
 from the a user ,1 representing Monday to 7 representing Sunday. 
 The program should decide whether the day input is a weekend or
  a weekday.(Use switch statement)
  Enter number: 1You entered 1 for MondayMonday is a weekday

*/