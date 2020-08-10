import java.util.HashSet;

/*Develop a java class with a instance variable Country  HashSet (H1)  add a method 
 * saveCountryNames(String CountryName) , the method should add the passed country to a
 *  HashSet (H1) and return the added HashSet(H1).
Develop a method getCountry(String CountryName) which iterates through the HashSet and 
returns the country if exist else return null. 
NOTE: You can test the methods using a main method.*/




public class country 
{
static HashSet <String> set=new HashSet<String>();
HashSet<String> saveCountryName(String name)
{
	set.add(name);
	return set;
	
}
String getCountry(String name)
{
	String c=null;
	for(String x:set)
	{
		if(x.equalsIgnoreCase(name))
		{
			System.out.println("found");
			c=name;
		}
	}
	
	return c;
	
}
public static void main(String[] args) 
{
	country co=new country();
	co.saveCountryName("india");
	co.saveCountryName("aus");
	co.saveCountryName("pak");
System.out.println(set);
	
	String s=co.getCountry("pak");
	System.out.println(s);
	
}
}
