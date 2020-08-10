
public class HareRace implements Runnable
{

	public static void main(String[] args) 
	{
		Thread th1=new Thread(new HareRace(),"Hare Running");
		Thread th2=new Thread(new HareRace(),"Tortoise Running");
		
		th1.setPriority(10);
		th2.setPriority(1);
		th1.start();
		th2.start();
		
		
		
	}

	
	public void run() 
	{
	/*for(int i=1;i<=100;i++)
	{
		System.out.println(i+" "+Thread.currentThread().getName());
		if(i==100)
		{
			System.out.println("congoo "+Thread.currentThread().getName()+" wins the race");
			System.exit(0);
		}
	}*/
	String s=Thread.currentThread().getName();
	if(s.equalsIgnoreCase("Hare Running"))
	{
		for(int i=1;i<=60;i++)
		{
			System.out.println(i+" "+Thread.currentThread().getName());
		}
		try {// sleeps for 1sec
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i=61;i<=100;i++)
		{
			System.out.println(i+" "+Thread.currentThread().getName());
			
			
			if(i==100)
			{
				
				System.out.println("congoo "+Thread.currentThread().getName()+" wins the race");
				System.exit(0);
			}
		}
	}
	
	else
	{
		for(int i=1;i<=100;i++)
		{
			System.out.println(i+" "+Thread.currentThread().getName());
			if(i==100)
			{
				System.out.println("congoo "+Thread.currentThread().getName()+" wins the race");
				System.exit(0);
			}
		
	}
	}
		
		
	

	}
	}

