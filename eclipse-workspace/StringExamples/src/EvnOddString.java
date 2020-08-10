import java.io.*;
import java.util.*;

public class EvnOddString 
{
static String s;
    public static void main(String[] args) {
        String s1="";
        String s2="";
       Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        for(int j=0;j<n+1;j++)
        {
            s=sc.next();
            for(int i=0;i<s.length();i++)
            {
            	if(i%2==0)
    {
        s1=s1+s.charAt(i);
    }
                else
                {
                    s2=s2+s.charAt(i);
    }
                
            }
               System.out.println(s1+"  "+s2);
               s1="";
               s2="";
        }
            
        }
        
        
    

       
    }

