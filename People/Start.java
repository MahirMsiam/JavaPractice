import java.lang.*;
public class Start
{
	
	public static void main(String[] args)
	{
		Student s1 = new Student();
		s1.setName("John");
		s1.setCgpa(2.5);
		Student s2 = new Student("Peter", 2.5);
		
		s1.display();
		s2.display();
		
		
	}
	static
		{
			System.out.println("Hello from Main");
		}
}