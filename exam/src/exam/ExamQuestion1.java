package exam;

public class ExamQuestion1 {

	public static void main(String[] args) {
		String name="John Doe";
		String city ="Charlotte";
		String state ="NC";
		double grossSalary = 100000;
		double  tax = 0.2;
		double net_salary= grossSalary - grossSalary *tax;
		System.out.println("Hello my name is "+name+ ",I live in Charlotte NC," + "my gross salary is "+grossSalary +"." 
		+" I pay $" +grossSalary *tax +" in tax and I take home $" +net_salary +".");
		
		

	}

}


/* Write a program that have variables 
Name (String)
city_and_state (String)
gross salary (double)
tax (double) = 0.2
net_salary(double)
//Tax is always 20%.
And print out the following.
Eg: Hello my name is John Doe, I live in Charlotte NC, 
my gross salary is $100,000. I pay $20,000 in tax and I take home $80,000.
  */