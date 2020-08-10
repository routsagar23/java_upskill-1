import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/*Create an ArrayList of Employee( id,name,address,sal) objects and search for 
 particular Employee object based on id number.*/
public class Emplyee {

	int id;
	String name;
	double salary;
	
	static ArrayList<Emplyee> list= new ArrayList<Emplyee> ();
	
	Emplyee(int i,String n,double d)
	{
		this.id=i;
		this.name=n;
		this.salary=d;
	}

	



	public String toString() {
	    return "id: " + this.id +  "  Name: " + this.name+ " salary: " + this.salary;
	}
	
	
	public static void main(String[] args)
	{
		Scanner sc= new Scanner (System.in);
		list.add(new Emplyee(101, "sagar", 23444.3));
		list.add(new Emplyee(102, "kunal", 4444.3));
		list.add(new Emplyee(103, "raj", 13444.3));
		list.add(new Emplyee(104, "rohit", 83444.3));
		list.add(new Emplyee(105, "akd", 93444.3));
		System.out.println(list);
		System.out.println("enter emplyee id");
		int k=sc.nextInt();
		
		for(Emplyee emp:list)
		{
			if(emp.id==k)
			{
				System.out.println(emp);
			}
			
		}
	
		
		
		

	}

}
