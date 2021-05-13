
public class AccountApplication {

	public static void main(String[] args) {
		Account hagosAccount = new Account("Hagos","Gebru",5000);
		Account jamesAccount = new Account("James","Bond",3000);
		System.out.println(hagosAccount);
		hagosAccount.calculateDebit(3000);
		hagosAccount.calculateCredit(1000);
		
		System.out.println("================");
		
		System.out.println(jamesAccount);
		jamesAccount.calculateDebit(4000);
		
		

		    
        
		
	}

}
