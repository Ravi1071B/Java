package programs;


class A
{
	static void marry()
	{
		System.out.println("Parent method");
	}
}

class B extends A
{
	static void marry()
	{
		System.out.println("Child123");
	}
}


public class Parent 
{
	public static void main(String[] args) 
	{
		A b = new B();
		b.marry();
	}

}
		
