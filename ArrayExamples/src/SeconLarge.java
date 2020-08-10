
public class SeconLarge 
{

static int largest;
static int Secondlargest;
	public static void main(String[] args) 
	{
		
int arr[]= {10,3,55,6,7,66,8888};
largest=arr[0];
for (int i = 1; i < arr.length; i++)
{
	if(arr[i]>largest)
	{
		largest=arr[i];
		arr[i]=arr[0];
		arr[0]=largest;
	}
}

System.out.println("largest is"+largest);
for (int i = 0; i < arr.length; i++) {
	

System.out.println(arr[i]);
}
Secondlargest=arr[1];
for (int i = 2; i < arr.length; i++)
{
	if(arr[i]>Secondlargest)
	{
		Secondlargest=arr[i];
	}
}
System.out.println("second largest is"+Secondlargest);
}
}