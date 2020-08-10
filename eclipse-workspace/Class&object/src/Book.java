import java.util.Scanner;

/*CCreate a class called Author is designed as follows:

It contains:
• Three private instance variables: name (String), email (String), and gender
 (char of either ‘m’ or ‘f’).
• One constructor to initialize the name, email and gender with the given values.

And, a class called Book is designed as follows:
It contains:
• Four private instance variables: name (String), author (of the class Author you
have just created), price (double), and qtyInStock (int). Assuming that each book is 
written by one author.
• One constructor which constructs an instance with the values given.
• Getters and setters: getName(), getAuthor(), getPrice(), setPrice(), getQtyInStock(),
setQtyInStock(). Again there is no setter for name and author.
Write the class Book (which uses the Author class written earlier). 
Try:
1. Printing the book name, price and qtyInStock from a Book instance.
 (Hint: aBook.getName())
2. After obtaining the “Author” object, print the Author (name, email & gender)
 of the book.*/
class Author
{
	private String name;
	private String email;
	private char gender;
	
	Author(String n,String e,char g)
	{
		this.name=n;
		this.email=e;
		this.gender=g;
		System.out.println("The name of author is:"+this.name);
		System.out.println("The email of author is:"+this.email);
		System.out.println("The gender of author is:"+this.gender);
	}

	Author() 
	{
		
	}
	
}
public class Book
{
	Scanner sc= new Scanner(System.in);
	private String name;
	
	private double price;
	private int qty;
	
	
	

	Book()
	{
	}
	Book(String x)
	{
		name=x;
	
	}
	
	
	void setPrice()
	{
		System.out.println("enter price");
		 price=sc.nextDouble();
		
	}
	void setQtyInStock()
	{
		System.out.println("enter qty");
		 qty=sc.nextInt();
	}
	void getAuthor()
	{
		System.out.println("Author details are: "+new Author("rs.agarwal","maim@com",'m')
		);
	}
	void getName()
	{
		System.out.println("The name of the book is: "+this.name);
	}
	void getPrice()
	{
		System.out.println("the price of the book is: "+this.price);
	}
	void getQtyInStock()
	{
		System.out.println("the qty of the book is: "+this.qty);
	}
	
	public static void main(String[] args) 
	{
		
		Book b= new Book();
		Book b1=new Book("xyz");
		b1.getName();
		b.setPrice();
		b.getPrice();
		b.setQtyInStock();
		b.getQtyInStock();
		
		b.getAuthor();
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
}
