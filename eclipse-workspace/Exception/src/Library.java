import java.util.Scanner;

interface LibraryUser
{
	void registerAccount();
	void requestBook();

}

class KidUser implements LibraryUser
{
int age;
String bookname;
	public KidUser(int i, String string) {
	// TODO Auto-generated constructor stub
		this.age=i;
		this.bookname=string;
}

	@Override
	public void registerAccount() {
		if(age<12)
		System.out.println("You have successfully registered under a Kids Account");  
		else
		System.out.println("Sorry, Age must be less than 12 to register as a kid");

		
	}

	@Override
	public void requestBook() {
		
		if(bookname.equalsIgnoreCase("kids"))
		{
			System.out.println("Book Issued successfully, please return the book within 10 days"); 
					

		}
		else
		{
			System.out.println( "Oops, you are allowed to take only kids books");
		}
		
	} 
	
}
class AdultUser implements LibraryUser
{
	int age;
	String bookname;

	public AdultUser(int i, String string) {
		// TODO Auto-generated constructor stub
		this.age=i;
		this.bookname=string;
	}

	@Override
	public void registerAccount() {
		if(age>12)
			System.out.println("You have successfully registered under a adult Account");  
			else
			System.out.println("Sorry, Age must be more than 12 to register as a adult");
		
		
	}

	@Override
	public void requestBook() {
		if(bookname.equalsIgnoreCase("fiction"))
		{
			System.out.println("Book Issued successfully, please return the book within 7 days"); 
					

		}
		else
		{
			System.out.println( "Oops, you are allowed to take only adult books");
		}
		
	}
	
}
public class Library {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		KidUser k= new KidUser(8,"kids");
		k.registerAccount();
		k.requestBook();
		try
		{
		Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
		AdultUser a= new AdultUser(17,"fiction");
		a.registerAccount();
		a.requestBook();
		}

	}

}
