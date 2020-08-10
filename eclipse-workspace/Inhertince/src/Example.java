*class Test
{
	Test()
	{
		System.out.println("hiii tetd");
	}
	Test(int x)
	{
		System.out.println("hiii int x");
	}
}
public class Example extends Test
{
	Example()
	{
		System.out.println("exam default");
	}

	Example(int x)
	{
		System.out.println("exam int");
	}
	public static void main(String[] args) {
		new Example(23);
		

	}

}
