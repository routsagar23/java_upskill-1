import java.util.Scanner;

/*Create  a base class Fruit which has name ,taste and size as its attributes.
 A method called eat() is created which describes the name of the fruit and its taste.  
 Inherit the same in 2 other class Apple and Orange and override the eat() method to
  represent each fruit taste.*/
class F
{
	String name;
	String taste;
	int size;
	
	void eat(String n,String t)
	{
		this.name=n;
		this.taste=t;
		System.out.println("The fruit is:"+this.name);
		System.out.println("The taste is:"+this.taste);
	}
	
}
class Apple extends F
{
	void eat()
	{
		//super.eat("xyz","abx");
		
		
	}
}
class Orange extends F
{
	void eat()
	{
	//.eat("xyz","abx");
	}
}
		
public class Fruit {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		F ob= new F();
		System.out.println("enter size");
		ob.size=sc.nextInt();
		System.out.println("size of fruit is:"+ob.size);
		F ob1;
		ob1=new Apple();
		ob1.eat("apple", "sweet");
		ob1=new Orange();
		ob1.eat("orange", "sour");
		//Orange o = new Orange();
		//o.eat();
		
		
		

	}

}
