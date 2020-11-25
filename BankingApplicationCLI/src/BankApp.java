import java.util.Scanner;

public class BankApp {

	public static void main(String[] args) {

		BankAccount ba = new BankAccount("Shiva" , "BS0420");
		ba.showMenu();
		
	}

}

class BankAccount{
	int balance;
	int previousTransaction;
	String customerName;
	String customerId;
	
	
	public BankAccount(String cname , String cid) {
		
		customerName = cname;
		customerId = cid;
	}
	
	void deposit(int amount)
	{
		if(amount !=0) {
			
			balance = balance + amount;
			previousTransaction = amount;
		}
	}
	
	
	void withdraw(int amount)
	{
		if(amount != 0)
		{
			 balance -= amount;
			previousTransaction = -amount;
			
		}
		
	}
	
	void getPreviousTransacton() {
		
		if(previousTransaction > 0)
		{
			System.out.println("Deposited " + previousTransaction);
		}
		else if(previousTransaction < 0)
		{
			System.out.println("Withdrawn " + Math.abs(previousTransaction));
		}
		else
		{
			System.out.println("No Transaction Occured");
		}
		
	}
	
	void showMenu()
	{
	
		char option ='\0';
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome : " + customerName);
		System.out.println("Your ID : "+ customerId);
		System.out.println("\n");
		System.out.println("A. Check Balance");
		System.out.println("B. Deposit");
		System.out.println("C. Withdraw");
		System.out.println("D. Previous Transacion ");
		System.out.println("E. Exit");
		
		
		do {
			System.out.println("============================================================");
			System.out.println("Enter an Option : ");
			System.out.println("============================================================");
			option = sc.next().charAt(0);
			System.out.println("\n");
			
			
			switch(option)
			{
			
			case 'A' :
				System.out.println("------------------------------------------------------------");
				System.out.println("Your Account Balance is : " + balance ); 
				System.out.println("------------------------------------------------------------");
				System.out.println("\n");
				break;
				
			case 'B' :
				System.out.println("------------------------------------------------------------");
				System.out.println("Please Enter the Amount you want to Deposit : " );
				System.out.println("------------------------------------------------------------");
				int amt = sc.nextInt();
				deposit(amt);
				System.out.println("Amount " + amt + " Deposited Successfully");
				System.out.println("\n");
				break;
				
				
			case 'C' :
				System.out.println("------------------------------------------------------------");
				System.out.println("Enter the Amount to Withraw : "  ); 
				System.out.println("------------------------------------------------------------");
				int amt1 = sc.nextInt();
				withdraw(amt1);
				System.out.println("\n");
				break;
				
				
			case 'D' :
				System.out.println("------------------------------------------------------------");
				getPreviousTransacton();
				System.out.println("------------------------------------------------------------");
				System.out.println("\n");
				break;
				
				
			case 'E' :
				System.out.println("--------------- Thank You!! Visit Again !! ---------------");
				break;
				
				
				default : 
					System.out.println("You Entered an Invalid Option!! Please Try Again !!");
					break;
			
			}
			
			
		} while (option != 'E');
		
		System.out.println("--------------- Thank You for using our services ---------------");
		
	}
	
	
}








