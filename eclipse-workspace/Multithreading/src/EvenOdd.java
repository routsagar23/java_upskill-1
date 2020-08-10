/*Create two threads, one thread to display all even numbers between 1 & 20, 
 * another to display odd numbers between 1 & 20.
Note: Display all even numbers followed by odd numbers
Hint: use join*/
public class EvenOdd implements Runnable
{
	public static void main(String[] args)
	{
		Thread th1= new Thread(new EvenOdd());
		
		
		th1.start();
		for(int i=1;i<=20;i++)
		{	
			
			if(th1.isAlive())
			{
				try {
					th1.join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("complted");
			}
			if(i%2!=0)
			{
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(i);
			}
		}
		
		
	}

	@Override
	public void run() {
		
		for(int i=1;i<=20;i++)
		{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(i%2==0)
			{
				
				System.out.println(i);
			}
		
		}
		
	}
	

}
