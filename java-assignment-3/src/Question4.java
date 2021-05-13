import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		
     Scanner sc =new Scanner(System.in);
     System.out.println("Enter a number: ");
     
     int num = sc.nextInt();
     
     
	int i=0;
	do {
    	for(i=1; i<num; i++ ) { 
    		
    		if( i % 2 ==  0) {
    		
    		 	System.out.println(i);
    			
    		i++; 	
    		}	
	}
    	}
	while(i<num);
	 
	}
}

/*
4.Write a program that takes a positive integer input 
and prints all the positive even number less than the number
in order from big to small.
(Use do while loop)
Enter number: 7
6
4
2

*/