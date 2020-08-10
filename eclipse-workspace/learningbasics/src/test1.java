import java.lang.reflect.Array;

import java.util.Arrays;
import java.util.Scanner;

class test1
{
	static int x;
	public static void main(String[] args) 
	{
		try
		{
		x=Integer.parseInt(args[0]);
		}
		catch(NumberFormatException e)
		{
			System.out.println("caught");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("hhhhh");
		}
		System.out.println(x);
		
	}
}