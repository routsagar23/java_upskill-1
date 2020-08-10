public class primespecial
{

void number()
{
    int flag;

    
    for(int num=10;num<100;num++)//for(int num=100;num>10;num--)
    {
        flag=0;
        
    for(int k=2;k<num;k++)
    {
        if(num%k==0)
        {
            flag=1;
            break;
        }
    }
    if(flag==0)
    {
        System.out.println(num);
    }


    
}}
    public static void main(String[] args)
     {
      
         new primespecial().number();
        
        

        
    }
}