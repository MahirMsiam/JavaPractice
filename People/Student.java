import java.lang.*;
public class Student extends Person
{
	private double cgpa;
	
	public Student()
	{
		System.out.println("Empty Student.");
	}
	public Student(String name, double cgpa)
	{
		super(name);
		System.out.println("Param. Student.");
		this.cgpa = cgpa;
	}
	public void setCgpa(double cgpa)
	{
		this.cgpa = cgpa;
	}
	public double getCgpa()
	{
		return cgpa;
	}
	public void display()
	{
		//System.out.println("Name: "+name);
		super.display();
		System.out.println("CGPA: "+cgpa);
	}
	static
	{
		System.out.println("Hello from Student");
	}
	
}