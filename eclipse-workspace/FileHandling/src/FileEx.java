/*Create an employee object having properties name, date of birth, department, 
  designation and salary. Let the employee class have appropriate getter/setters
   methods for accessing these properties. Initialize these properties through the 
  setter methods. Store this object into a file "OutObject.txt". 
  Read the same object from the same file and display its properties through getter
   methods.*/
import java.util.*;
   import java.io.*;
  public  class FileEx implements Serializable
   {
   	String name;
   	double salary;
	String dept;
   

   	void getvalues()
   	{
   		System.out.println("the values are");
   		System.out.println("name: "+this.name+" salary :"+this.salary+" dept: "+this.dept);

   	}
   	void setvalues()
   	{
   		Scanner sc= new Scanner(System.in);
   		System.out.println("enter details");
   		name=sc.next();
   		salary=sc.nextDouble();
   		dept=sc.next();


   	}
   	public static void main(String[] args) throws Exception
   	 {

   	 	FileEx e1=new FileEx();
   	 	e1.setvalues();
   	 	e1.getvalues();
   	 	ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("OutObject.txt"));
   	 	oos.writeObject(e1);
   	 	System.out.println("done");

   	 	oos.close();

   		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("OutObject.txt"));
   		FileEx e2=(FileEx) ois.readObject();
   	
   		e2.getvalues();
   	}

   }
