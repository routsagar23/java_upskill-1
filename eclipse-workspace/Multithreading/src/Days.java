import java.util.Iterator;

/*1. Create class of SalesPersons as a thread that will display   
 *  fives sales persons name.
2. Create a class as Days as other Thread that has array of seven days.
3. Call the instance of SalesPersons in Days and start both the 
  threads
4. suspend SalesPersons on Sunday and resume on wednesday 
Note: use suspend, resume methods from thread*/
class Salesperson implements Runnable
{
	String name[]= {"ram","xyz","pqr","abc","mmm"};


@Override
public void run()
{
	for (int i = 0; i < name.length; i++) 
	{
		try {
			Thread.sleep(1000);
			System.out.println(name[i]);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
	
}
}
public class Days 
{
	static String days[]= {"SUN","M","T","W","TH","F","SAT"};

	
		@SuppressWarnings("deprecation")
		public static void main(String[] args) 
		{
			
			Thread th2= new Thread(new Salesperson());
			
			
			
			
			th2.start();
			for (int i = 0; i < days.length; i++) 
			{
				if(days[i].equals("SUN"))
				{
					th2.suspend();
				}
				if(days[i].equals("W"))
				{
					th2.resume();
				}
				try {
					Thread.sleep(1000);
					System.out.println(days[i]);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				
				
				
					
					
			}
				
				
			}
			
			
			
		


		

			
		}
		
	
	

