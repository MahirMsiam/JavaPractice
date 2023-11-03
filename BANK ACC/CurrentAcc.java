import java.lang.*;
public class CurrentAcc extends Account
{
	private double DailyLimit;
	public CurrentAcc()
	{
		System.out.println("Empty CurrentAcc");
	}
	public CurrentAcc(int ano, double balance, double DailyLimit)
	{
		super(ano, balance);
		System.out.println("Param. CurrentAcc");
		//this.ano = ano;
		//this.balance = balance;
		this.DailyLimit = DailyLimit;
	}
	public void setDailyLimit(double DailyLimit)
	{
		this.DailyLimit = DailyLimit;
	}
	public double getDailyLimit()
	{
		return DailyLimit;
	}	
	public void display()
	{
		super.display();
		System.out.println("DailyLimit: "+DailyLimit);
	}
}