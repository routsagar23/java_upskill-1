import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

/*Write a program to create a HashMap to store name and pone number (Telephone book). 
 When name is given, we can get back the corresponding phone number.
 a)Check if a particular key exists or not 
b) Check if a particular value exists or not 
c) Use Iterator to loop through the map key set*/
public class Maphonebook
{
	String pno;
	String name;
	int no;
	public Maphonebook(String string, String i,int j) 
	{
		this.pno=i;
		this.name=string;
		this.no=j;
	}
	public String toString() 
	{
		return "name: "+this.name+" phone number: "+this.pno+" no: "+this.no;
		
	}
	public static void main(String[] args)
	{
		Maphonebook emp;
		Scanner sc= new Scanner(System.in);
		HashMap<String,Maphonebook> map=new HashMap<String,Maphonebook>();
		HashMap<String,String> map1=new HashMap<String,String>();//orignal case
		Maphonebook m=new Maphonebook("sagar","9040484888",121);//another way
		map.put("sagar", m);
		map1.put("rohit","89065432");
		map.put("rohit", new Maphonebook("rohit","4564737372",123));
		map.put("ram", new Maphonebook("ram","36282891374",125));
		
	
		// Iterating over key&value only
		Set<String> set=map.keySet();
	for (String obj : set) 
	{
		
		System.out.println(map.get(obj));
	}
		// Iterating over key only
		for (Object key : map.keySet()) {
		    System.out.println("Key = " + key);
		}

		// Iterating over values only
		for (Object value : map.values()) {
		    System.out.println("Value = " + value);
		    
		  
		   
		}
		//using iterator
		Iterator itr = map.entrySet().iterator();
		while (itr.hasNext()) {
			System.out.println( itr.next());
		 
		   
		}
	
		
		System.out.println("-----------------------------------------");
		System.out.println(map.isEmpty());
		System.out.println("enter search key");
		String  s=sc.next();
		
		System.out.println(map.get(s));
		//System.out.println(map.containsKey("rohit"));//Check if a particular key exists or not 
	
		
		
		//System.out.println(map1.containsValue("89065432"));  
	

		
		
		

		
		
	}
	
	
}
