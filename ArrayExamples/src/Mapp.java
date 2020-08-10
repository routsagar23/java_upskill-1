import java.util.*;
class Employee
{
	private int id;
	private String name;
	private int age;
	private double salary;

	public Employee(int id,String name,int age,double Salary)
	{
		this.id=id;
		this.name=name;
		this.age=age;
		this.salary=salary;
		
	}
	public String toString()
	{
		return ""+id+"\t"+name+"\t"+age+"\t"+salary;
		
	}
}

public class Mapp {

	public static void main(String[] args) 
	{
	HashMap<Integer,String>map1=new HashMap<Integer,String>();
	
	map1.put(100, "raja");
	map1.put(101, "kaja");
	map1.put(102, "caja");
	map1.put(101, "baja");
	System.out.println(map1);
	
	TreeMap<Integer,Employee>map=new TreeMap<Integer,Employee>();
	map.put(111, new Employee(111,"ajay",23,1000));
	map.put(101, new Employee(101,"bjay",24,1003));
	map.put(11, new Employee(11,"cjay",25,10033));
	map.put(1, new Employee(1,"djay",26,104));
	map.put(120, new Employee(20,"pjay",27,1004));
	System.out.println(map);
	
	Set<Integer> set=map.keySet();
	for(Object obj: set)
	{
		System.out.println(map.get(obj));
	}
	System.out.println(map.get(111));
	
;	
	System.out.println(map);
	

	}

}
