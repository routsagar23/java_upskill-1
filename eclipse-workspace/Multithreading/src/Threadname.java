/*Create two threads and assign names ‘Scooby’ and ‘Shaggy’ to the two threads.
 *  Display both thread names.*/
public class Threadname implements Runnable
{
public static void main(String[] args) 
{
	Thread th1=new Thread(new Threadname());
	Thread th2=new Thread(new Threadname());
	th1.setName("scooby");
	th2.setName("shaggy");
	System.out.println(th1.getName());
	System.out.println(th2.getName());
	;
	
}

@Override
public void run() {
	// TODO Auto-generated method stub
	
}
}
