import java.lang.*;
public class Start
{
	public static void main(String[] args)
	{
		System.out.println("Hello!");
		SavingsAccount sa1 = new SavingsAccount();
		sa1.setAno(101);
		sa1.setBalance(-500);
		sa1.setBalance(1000);
		sa1.setTenureYear(3);
		
		sa1.display();
		
		SavingsAccount sa2 = new SavingsAccount(102, 1500, 5);
		sa2.display();
		
		System.out.println("sa1.balance: "+sa1.getBalance());
		System.out.println("sa2.balance: "+sa2.getBalance());
		
		sa1.deposit(500);
		sa2.deposit(500);
		
		System.out.println("sa1.balance: "+sa1.getBalance());
		System.out.println("sa2.balance: "+sa2.getBalance());
		CurrentAcc Ca1 = new CurrentAcc(102, 1500, 50000);
		Ca1.setAno(101);
		Ca1.setBalance(1000);
		Ca1.setDailyLimit(50000);
		System.out.println("Ca1.balance: "+Ca1.getBalance());
		System.out.println("Ca2.balance: "+Ca1.getBalance());
		//System.out.println("Daily Limit= "+DailyLimit);
		
	}
	
	static
	{
		System.out.println("Hello from Start");
	}
}