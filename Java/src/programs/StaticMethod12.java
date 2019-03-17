package programs;

public class StaticMethod12 
{
	
	static void marry()
	{
		System.out.println("Hello World!");

	}
}

class Child extends StaticMethod12 
{
	static void marry()
	{
		System.out.println("Hello World!");

	}
	
	public static void main(String[] args) 
	{
		Child c = new Child();
		c.marry();

	}
}


