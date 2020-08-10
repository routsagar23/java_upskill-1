import java.util.*;
public class Htbvectr {

	public static void main(String[] args)
	{
		
Hashtable<Integer,String> map= new Hashtable<Integer,String> ();
map.put(100, "raja");
map.put(101, "baja");

map.put(200, "caja");

map.put(100, "daja");

map.put(101, "eaja");
System.out.println(map);
 
Vector<Integer> v  = new Vector<Integer>();
v.addElement(11);
v.addElement(13);
v.add(0, 34);
v.remove(0);
System.out.println(v);


	}

}
