
public class AvgRoundup {
	
		public static void main(String[] args)
		 {
		 	float sum=0,n=0;float avg=0;
			int no1=Integer.parseInt(args[0]);
			int no2=Integer.parseInt(args[1]);
	for(int i=no1;i<=no2;i++)
	{
			sum=sum+i;
			n++;
	}
	avg=sum/n;
	System.out.println((avg));
	System.out.println(Math.round(avg));

		}
	}

