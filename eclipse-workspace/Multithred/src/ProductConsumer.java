class Product
{
int value=0;
boolean status=false;
	synchronized public void produce(int value) 
	{
		try
		{
			if(!status)//if true then execute
			{
				wait();
			}
		}
		catch(Exception e)
		{
		}
		
		this.value=value;
		System.out.println("produced: "+value);
		
		notify();
		status=false; //so make status false to block consumer thread
		}
		
		
		
	
	synchronized public void consume() 
	{
		try
		{
			if(status) //if false then execute
			{
				wait();
			}
		}
		catch(Exception e)
		{
		}
		
		
		System.out.println("consumed: "+value);
		notify();
		status=true; //so make status true to block producer thread

		
		
	}
	
}
class Producer implements Runnable
{
	Product p;
	public Producer(Product p)
	{
		this.p=p;
		new Thread(this).start();
	}
	
	public void run() 
	{
		int i=0;
		while(true)
		{
			p.produce(i++);
		}
		
		
	}
}
class Consumer implements Runnable
{
	Product p;
	public Consumer(Product p)
	{
		this.p=p;
		new Thread(this).start();
	}
	
	public void run() 
	{
		
		while(true)
		{
			p.consume();
		}
		
		
	}
	
}
public class ProductConsumer {

	public static void main(String[] args) 
	{
		Product p=new Product();
		new Producer(p);
		new Consumer(p);

	}

}
