import java.util.ArrayList;
import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

/*Develop a java class with a method saveEvenNumbers(int N) using ArrayList to store
 *  even numbers from 2 to N, where N is a integer which is passed as a parameter to the
 *   method saveEvenNumbers(). The method should return the ArrayList (A1) created. 
 *   In the same class create a method printEvenNumbers()which iterates through the 
 *   arrayList A1 in step 1,  and It should multiply each number with 2 and display it
 *    in format 4,8,12….2*N. and add these numbers in a new ArrayList (A2). 
The new ArrayList (A2) created needs to be returned. Create a method 
printEvenNumber(int N)  parameter is a number N. This method should search the
 arrayList (A1) for the existence of the number ‘N’ passed. 
  If exists it should return the Number else return zero.
  Hint:  Use instance variable for storing the ArrayList A1 and A2.
NOTE: You can test the methods using a main method.*/
public class EvenNo {
	static ArrayList<Integer> list= new ArrayList<Integer>();
	ArrayList<Integer> saveEvenNumbers(int N)
	{
		for(int i=2;i<=N;i++)
		{
			if(i%2==0)
			{
				list.add(i);
				
			}
		}
		return list;
		
		
	}
	ArrayList<Integer> printEvenNumbers(ArrayList<Integer> list)
	{
		int sum=0;
		ArrayList<Integer> arr2 =new ArrayList<Integer> ();;
		for(int x:list)
		{
			
			
			
			 sum=sum+x;
			 arr2.add(x*2);
			 
			 //to eturn sum array we cam  arr2.add(sum);
			 
			 
		}
		
		return arr2;
		
		
		
	}
	
int  searchNumber(int s)
	{
	int c=0;
	
		for(int i=0;i<list.size();i++)
		{
			if(i==s)
			{
				c=s;
			}
		
		
		}
		return c;
		

		
	}
	public static void main(String[] args) 
	{
		System.out.println("enter the range");
		Scanner sc= new Scanner (System.in);
		int n=sc.nextInt();
		ArrayList<Integer> kist=new EvenNo().saveEvenNumbers(n);
		System.out.println(kist);
		ArrayList<Integer> mist=new EvenNo().printEvenNumbers(kist);
		System.out.println(mist);
		
		System.out.println("enter search elemnt");
		int s=sc.nextInt();
		int r=new EvenNo().searchNumber(s);
		System.out.println(r);
		
		
	}
	

}
