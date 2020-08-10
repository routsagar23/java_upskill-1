
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class VideoStore extends video
{
	 
	String arr[];
	void addVideo()
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		Scanner sc= new Scanner(System.in);
		System.out.println("enter no of videos u want to add");
		int n=sc.nextInt();
		arr=new String[n];
	
		System.out.println("enter the videos");
		for (int i = 0; i < arr.length; i++) 
		{
			try {
				arr[i]=br.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		/*void add(String[] err)
		 * {
		 *  String n[]=new String[err.length];
		 * for(int i = 0; i < err.length; i++)
		 * {
		 * n[i]=err[i];
		 *sys(n[i]);
		 * }
		 * }
	
		 */
		
		
	}
	void checkOut(String y)
	{
		super.title=y;
		//int u=Arrays.binarySearch(arr, y);
		
		for (int i = 0; i < arr.length; i++)
		{
			if(arr[i].equals(y))
			{
					for (int j = i; j < arr.length-1; j++)
					{
						arr[j]=arr[j+1];
				
				
					}
						flag=true;
						super.checked();
						//listInvetory();// if this, it will show duplicate array also
						for (int j = 0; j < arr.length-1; j++)//display array
						{
							System.out.println(arr[j]);
							
						}
			}
			

						
			
			
			}
			
			
			
		
	
		
		
		
		
		
	}
	void returnVideo(String z)
	{
		super.title=z;
		this.arr[arr.length-1]=z;
		super.flag=false;
		super.returned();
		listInvetory();
		System.out.println("video successfully added");
		
		
	}
	void receiveRating(String p,float a)
	{
		super.title=p;
		super.rating=a;
		super.rating();
		
		
		
	}
	
	void listInvetory()
	{
		System.out.println("The current list of videos present are:");
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.println(arr[i]);
		}
		
	}

}
class video
{
	String title="";
	boolean flag=false;
	float rating=0;
	
	void rating()
	{
		System.out.println("The rating of "+this.title+" is: "+this.rating);
	}
	void checked()
	{
		if(this.flag==true)
		System.out.println("congratulations!"+this.title+" video chcked out,user please return in time");
		
	}
	void returned()
	{
		if(flag==false)
		{
			System.out.println("thankyou "+this.title+" has been returned");
		}
		
	}

	
	
}
public class VideoStoreLauncher 
{
	static String k="";
	public static void main(String[] args)
	{
		Scanner scc= new Scanner(System.in);
		VideoStore vs= new VideoStore();
		vs.addVideo();
		vs.listInvetory();
		
		for (int i = 0; i <vs.arr.length; i++) 
		{
			System.out.println("enter rating of "+vs.arr[i]);
			
			vs.receiveRating(vs.arr[i], scc.nextInt());
			
		}
		vs.listInvetory();
		for (int i = 0; i <vs.arr.length; i++) 
		{
			 k=vs.arr[0];
		vs.checkOut(k);
		//vs.listInvetory();
		vs.returnVideo(k);
		}
		//vs.checkOut("pk");
		
		//vs.returnVideo("pk");
		
		
		
	}

}
