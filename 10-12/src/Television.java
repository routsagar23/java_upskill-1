
import java.util.*;
public class Television 
{
	static String pow;
	boolean powLed;
	static int vol;
	static int channel;
	static Scanner sc= new Scanner(System.in);
	 static void sunTv(String brand,int size)
	{
		
	System.out.println("A "+ size+"inch "+" of brand "+brand+"has been turned off");	
	power();
	System.out.println("A "+size+"inch "+" of brand "+brand+" has been turned"+pow);
	if(pow.equalsIgnoreCase("ON"))
	{
		getChannel();
		getVolume();
		System.out.println("channel is:"+channel+"volume is:"+vol);
		System.out.println("Too low increase the volume!!!!!!!!!!!!!");
		increaseVolume();
		System.out.println("channel is:"+channel+"volume is:"+vol);
		System.out.println("Too high decrease the volume!!!!!!!!!!!!!");
		decreaseVolume();
		System.out.println("channel is:"+channel+"volume is:"+vol);
	}
	else
	{
		System.out.println("please turn ON the tv");
	}
	
	}
	static void getChannel() 
	{
System.out.println("enter channel no:");
 channel=sc.nextInt();

	}
	static String getManufacture()
	{
		System.out.println("enter manufacture name");
		String MANUFACTURE=sc.nextLine();
		return MANUFACTURE;
		
	}
	static int screenSize()
	{
		System.out.println("enetr size of screen");
		int SIZE=sc.nextInt();
		return SIZE;
		
	}
	static void getVolume()
	{
		System.out.println("enter volume");
		 vol=sc.nextInt();
		
	}
	static void increaseVolume()
	{
		System.out.println("enter increased volume");
		int inc=sc.nextInt();
		vol=vol+inc;
	}
	static void decreaseVolume()
	{
		System.out.println("enter decreased volume");
		int dec=sc.nextInt();
		vol=vol-dec;
	}
	static void power()
	{
		System.out.println("enter power status");
		String powerstatus=sc.nextLine();
		if(powerstatus.equalsIgnoreCase("ON"))
		{
		
			pow="ON";
			
		}
		else
		{
			
			pow="OFF";
		}
	}
	

	public static void main(String[] args)
	{
		int size1=screenSize();
				String brand1=getManufacture();
				Television.sunTv(brand1,size1);
				

	}

	
}
