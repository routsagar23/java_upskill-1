import java.util.*;

public class ascdec {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int count=0;
		int size=sc.nextInt();
		int arr[]= new int[size];
		System.out.println("enter mark of students");
		for (int i = 0; i < arr.length; i++)
		{
			arr[i]=sc.nextInt();
			
		}
		for (int i = 0; i < arr.length; i++)//u can also use Arrays.sort(arr);
		{
			System.out.print(" "+arr[i]);
		}
		//for (int i = 0; i < arr.length; i++) 
		//{
			int temp=0;
			
			for(int j=0;j<arr.length-1;j++)
			{
			if(arr[j]>=arr[j+1])
			{
				temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				
				
			}
			}
			
		//}
		System.out.println("new array is:");
		for (int i = 0; i < arr.length; i++)
		{
			System.out.print(" "+arr[i]);
		}
		System.out.println("array in descnding order");
		
		for (int i = arr.length-1; i>=0; i--) 
		{
			System.out.print(" "+arr[i]);
		}
		
		

	}

}
