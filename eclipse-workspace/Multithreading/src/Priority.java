/*Create three threads- with different priorities – MAX, MIN, NORM- and start 
 * the threads at the same time. Observe the completion of the threads.*/
public class Priority implements Runnable
{
	public static void main(String[] args) 
	{
		Thread th1=new Thread(new Priority(),"a");
		Thread th2=new Thread(new Priority(),"b");
		Thread th3=new Thread(new Priority(),"c");
		
		th1.setPriority(1);
		th2.setPriority(5);
		th3.setPriority(10);
		System.out.println(th1.getPriority());
		System.out.println(th2.getPriority());
		System.out.println(th3.getPriority());
		
		
		th1.start();

		th2.start();

		th3.start();
		
	}

	@Override
	public void run() {
		for (int i = 1; i <=5; i++)
		{
			
				System.out.println(i+" "+Thread.currentThread().getName());
			
			
		}
		
	}

}
