import java.io.*;
import java.util.*;

public class Demo {

    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
        int count=0;
        int x=sc.nextInt();
        String y=Integer.toBinaryString(x);
        System.out.println(y);
        
        for(int i=0;i<y.length()-2;i++)
        {
            if(y.charAt(i)=='1')
            {
            	count++;
            	System.out.println("a"+count);
            	if(y.charAt(i+1)=='1')
                {
           		 count++;
           		 
           		if(y.charAt(i+2)=='1')
                {
           		 count++;
           		 
                }
           		 
                }
            	
            	System.out.println("b "+count);
            	break;
            	 
                
            }
            
         }
        System.out.println(count);
        
}
}