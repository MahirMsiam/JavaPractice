import java.lang.*;
public class Account
{
	private int ano;
	private double balance;
	
	public Account()
	{
		System.out.println("Empty Account");
	}
	public Account(int ano, double balance)
	{
		System.out.println("Param. Account");
		this.ano = ano;
		this.balance = balance;
	}
	public void setAno(int ano)
	{
		this.ano = ano;
	}
	public void setBalance(double balance)
	{
		if(balance>0)
		{
			this.balance = balance;
		}
		else
		{
			System.out.println("Invalid!");
		}
	}
	public int getAno()
	{
		return ano;
	}
	public double getBalance()
	{
		return balance;
	}
	public void deposit(double amount)
	{
		if(amount>0)
		{
			balance = balance+amount;
		}
		else
		{
			System.out.println("Invalid amount!");
		}
	}
	//withdraw(amount) //transfer(acc, amount)
	public void display()
	{
		System.out.println("ANO: "+ano);
		System.out.println("Balance: "+balance);
		
	}
	static
	{
		System.out.println("Hello from Account");
	}
}