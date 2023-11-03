import java.lang.*;
public class SavingsAccount extends Account
{
	private int tenureYear;
	public SavingsAccount()
	{
		System.out.println("Empty SavingsAccount");
	}
	public SavingsAccount(int ano, double balance, int tenureYear)
	{
		super(ano, balance);
		System.out.println("Param. SavingsAccount");
		//this.ano = ano;
		//this.balance = balance;
		this.tenureYear = tenureYear;
	}
	public void setTenureYear(int tenureYear)
	{
		this.tenureYear = tenureYear;
	}
	public int getTenureYear()
	{
		return tenureYear;
	}	
	public void display()
	{
		super.display();
		System.out.println("TenureYear: "+tenureYear);
	}
	static
	{
		System.out.println("Hello from SavingsAccount");
	}
}