
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

import javax.lang.model.element.Element;


class Difference {
  	private int[] elements;
  	public int maximumDifference;
  	int diffr;
	 Difference(int[] a) 
	{
		elements=a;
		
	}
 void computeDifference()
	{
	 for (int i = 0; i< elements.length; i++) 
		{
		
	 for (int j = i+1; j < elements.length; j++) 
		{
			this.diffr=Math.abs(elements[i]-elements[j]);
			
			 if(this.diffr>this.maximumDifference)
				{
					this.maximumDifference=this.diffr;
				}
		}
		}
	
		
	}
}


public class MaxDiffr {

   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int[] a = new int[n];
       for (int i = 0; i < n; i++) {
           a[i] = sc.nextInt();
       }
       sc.close();

       Difference difference = new Difference(a);

       difference.computeDifference();

       System.out.print(difference.maximumDifference);
   }
}