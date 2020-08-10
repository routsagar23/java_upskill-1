import java.util.Scanner;

/*store color in the form of an array
ex: String colors[]={"white","blue","black","green","red","yellow"};
display all colors repeatedly by generating colour index from Random class. 
If the random colour index matches to red stop display.
Note: perform this task by implementing Runnabe interface*/

public class color implements Runnable
{
	
	 String color[]={"white","blue","black","green","red","yellow"};;
	
	public static void main(String[] args) 
	{
		Thread th1= new Thread(new color());
		th1.start();
		
	}

	@Override
	public void run() 
	{
		for (int i = 0; i < color.length; i++)
		{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(color[i]=="red")
			{
				System.out.println("stoppped.....");
				System.exit(0);
			}
			else
			{
				System.out.println(color[i]);
			}
		}
		
	}

}