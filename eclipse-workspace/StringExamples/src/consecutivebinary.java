
import java.io.*;
import java.util.*;

class consecutivebinary
{
	
public static void main(String[] args)
{
    Scanner sc = new Scanner(System.in);
    int count=1,maxcount=1;
    System.out.println("enter no");
    int n = sc.nextInt();
    String s="";
    if(n>0)
    {
    s= Integer.toBinaryString(n);
    System.out.println(s);
    char arr[]=s.toCharArray();
    for (int i = 0; i<arr.length-1; i++) 
    {
   if(arr[i]==arr[i+1] && arr[i]=='1') 
   {
	   count++;
	   if(count>maxcount)
	   {
		   maxcount=count;
	   }
	   
   }
  else //incase of 6=110,3333333
  	{
   
	   count=1;
	   
   }
		
			
	}
    
    System.out.println("count:"+(maxcount));//if 1 then directly 1
    
    }
    else	//if n=0;
    {
    	System.out.println("0"); //for zero
    	System.out.println("count:"+0);
    }
    
    
}
}
//check op as
/*
0
1
5
6
7
23
333333
33333333
65535
*/

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

