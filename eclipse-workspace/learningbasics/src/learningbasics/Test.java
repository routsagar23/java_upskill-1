package learningbasics;

public class Test
{
	public static void main(String[] args)
	{
		Subclass s1 = new Subclass();
		s1.foo();
		Super s = new Subclass();
		s.foo();
	}
}

class Super
{
   void foo()
	{
		System.out.println("hii");
	}
}

class Subclass extends Super
{
	
	public void foo()
	{
		System.out.println("heyyy");
	}
	
}
