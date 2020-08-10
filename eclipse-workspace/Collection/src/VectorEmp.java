
import java.util.Enumeration;
import java.util.Scanner;
import java.util.Vector;

public class VectorEmp 
{
	int id;
	String name;
	double salary;
	
	static Vector<VectorEmp> list= new Vector<VectorEmp> ();
	
	public VectorEmp(int i,String n,double d)
	{
		this.id=i;
		this.name=n;
		this.salary=d;
	}
	public String toString() {
	    return "id: " + this.id +  "  Name: " + this.name+ " salary: " + this.salary+ "||";
	}
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner (System.in);
		list.add(0,new VectorEmp(101, "sagar", 23444.3));
		list.add(1,new VectorEmp(102, "kunal", 4444.3));
		list.add(2,new VectorEmp(103, "raj", 13444.3));
		list.add(3,new VectorEmp(104, "rohit", 83444.3));
		list.add(4,new VectorEmp(105, "akd", 93444.3));
		
		System.out.println(list);
		
		Enumeration<VectorEmp> e=list.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
		System.out.println("enter emplyee id");
		int k=sc.nextInt();
		
		for(VectorEmp emp:list)
		{
			if(emp.id==k)
			{
				System.out.println("found");
				System.out.println(emp);
			}
		}
		
	}

}
