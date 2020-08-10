import java.util.Scanner;

class InvalidCountryException extends Throwable
{
	
}
public class ex  
{
	static Scanner sc= new Scanner(System.in);
	

	public static void main(String[] args) 
	{
	new ex().register();

	}


	private void register() {
		System.out.println("enter country");
		String s=sc.nextLine();
		if(s.equalsIgnoreCase("India"))
		{
			System.out.println("registerd");
		}
		else
		{
			try
			{
				throw new InvalidCountryException();
			}
			catch(InvalidCountryException e)
			{
				System.out.println("cannot register outside india");
			}
		}
		
	}

}
