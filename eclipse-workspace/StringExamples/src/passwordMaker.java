import java.util.Scanner;

public class passwordMaker 
{
	public static void main(String[] args) 
	{
		new passwordMaker().make();
	}

	public void make()
	{
		String password="";
		Scanner sc= new Scanner(System.in);
		String s=sc.nextLine();
		String s1[]=s.split(" ");
		String first= "";
		String second = "";
		String third = "";
		String fi= "";
		String sec = "";
		String thir = "";
		
		
			
		int no=s1[0].length()/3;
		first=s1[0].substring(0,no);
		second=s1[0].substring(no,s1[0].length()-no);
		third=s1[0].substring(s1[0].length()-no,s1[0].length());
		
		int no1=s1[1].length()/3;
		fi=s1[1].substring(0,no);
		sec=s1[1].substring(no,s1[1].length()-no);
		thir=s1[1].substring(s1[1].length()-no,s1[1].length());
	
		
				
				
			/*System.out.println(first);
			System.out.println(second);
			System.out.println(third);
			
			System.out.println(fi);
			System.out.println(sec);
			System.out.println(thir);*/
		
	password=second+thir+fi;	
	System.out.println("password is: "+password);
		
		
}
}
/*machine learning
ma
chi
ne
le
arni
ng
password is...chinglea
*/