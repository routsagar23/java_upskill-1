import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/*1. Develop a java class with a instance variable CountryMap  HashMap (M1)  add a method
 *  saveCountryCapital(String CountryName, String capital) , the method should add the
 *   passed country and capital as key/value in the map M1 and return the Map (M1).
Key- Country                          Value - Capital
India                                                Delhi
Japan                                                Tokyo
2. Develop a method getCapital(String CountryName) which returns the capital for the 
country passed from the Map M1 created in step 1.
3. Develop a method getCountry(String capitalName) which returns the country for the
 capital name passed from the Map M1 created in step 1.
4. Develop a method which iterates through the map M1 and creates another map M2 with 
Capital as the key and value as Country and returns the Map M2.
Key – Capital                    Value – Country
Delhi                                      India
Tokyo                                      Japan
5. Develop a method which iterates through the map M1 and creates an ArrayList with all
 the Country names stored as keys. This method should return the ArrayList.
NOTE: You can test the methods using a main method.*/
public class MainCountry
{
 HashMap<String,String> m1= new HashMap<String,String>();
 HashMap<String,String> m2= new HashMap<String,String>();
	
	HashMap<String,String> saveCountryCapital(String CountryName, String capital)	
	{
		m1.put(CountryName, capital);
		return m1;
		
	}

	
	String getCapital(String CountryName)
	{
		 return m1.get(CountryName);
		 
		
		
		
	}
	void getCountry(String capitalName)
	 {
	
		
		
		for (Entry<String, String> e : m1.entrySet())
		{
		
			
		      if (e.getValue().equals(capitalName)) {
		        System.out.println(e.getKey()); ;
		      }
		    }
		    
		

 }
	
	void iteration() //iteration in hashmap
	{
		Iterator itr = m1.entrySet().iterator();
		while (itr.hasNext())
		{
			System.out.println( itr.next());
	
	}
	}
		
	ArrayList<String> array() //condition 5
		{
		
			ArrayList<String> arr=new ArrayList<String>();
			for (String key : m1.keySet()) 
			{
				arr.add(key);
			}
			
		
			
					
			return arr;
			
			
			
		}
	
HashMap<String, String> array2() //condition 4
	{
		for (String value : m1.values()) 
		{
			for (String key : m1.keySet()) 
		    {
		   m2.put(value, key);
		    }
			
		}
		return m2;
		

		
		
		
	}
		
		
	
	 
	public static void main(String[] args)
	{
		MainCountry mc= new MainCountry();
		mc.saveCountryCapital("India","NewDelhi");
		mc.saveCountryCapital("china","beijing");
		mc.saveCountryCapital("UK","London");
		System.out.println(mc.m1);
		String s=mc.getCapital("china");
		System.out.println(s);
		mc.getCountry("beijing");
		//mc.iteration();
		
		HashMap<String, String> n=mc.array2();
		System.out.println(n);
		ArrayList<String> brr=mc.array();
		System.out.println(brr);
		
		
		
		
	}
}
