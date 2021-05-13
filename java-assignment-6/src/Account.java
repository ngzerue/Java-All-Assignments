
public class Account {

	private String firstName;
	private String lastName;
	private long accountNumber;
	private double balance;
	public static long accountIncrement=1000;

	public Account(String firstName, String lastName, double balance) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.balance = balance;
		accountIncrement = accountIncrement + 1;
		this.accountNumber = accountIncrement;
		

	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setAccountBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Account [firstName=" + firstName + ", lastName=" + lastName + ", accountNo=" + accountNumber + ", balance="
				+ balance + "]";
	}

	public void calculateDebit(double withdrawAmount) {

		if ( balance < withdrawAmount)
			System.out.println("Insufficient balance");
		    
		else {
			balance = balance - withdrawAmount;
			System.out.println("You have withdrawn " + withdrawAmount + " your current balance = " + balance);
		}

	}

	public void calculateCredit(double depositAmount) {

		balance = balance + depositAmount;
		System.out.println("You have deposited " + depositAmount + " Current Balance " + balance);

	}

}

/*
1. Create a class called Account  that includes four pieces of information as instance variables
First Name (String)
Last Name (String)
Account Number (long) 
balance  (double)
Your class should have a constructor that initializes the four instance variables. 
Provide a set and a get method for each instance variable.

2. add methods called debit and credit 
   debit withdraws money from the Account.   
   Ensure that the debit amount does not exceed the Account’s balance.
   If it does, the balance should be left unchanged and the method should
   print a message “Insufficient balance”
   Credit: that adds money to the balance and prinsorted the final balance.
3. Create an account for “Hagos Gebru” Account number 10001 
  with an initial balance of $5000. Withdraw $3000 and deposit $1000.
4. Create an account for “James Bond” Account number 10002 with initial
   balance $3000 and withdraw $4000. 

5. Modify the Account class so that the account number auto incremensorted every time
   a new account is created.
   Hint: create static variable initialize to 10001 and increment it in the constructor
 */
