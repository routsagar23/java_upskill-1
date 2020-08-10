
public class Matrx3D
{
public static void main(String[] args) 
{
	char ch=65;
	char arr3d[][][]=new char[2][3][4];
	for (int i = 0; i < 2; i++) 
	{
		for (int j = 0; j < 3; j++) 
		{
			for (int k = 0; k < 4; k++)
			{
				arr3d[i][j][k]=ch++;
				System.out.println("array is"+arr3d[i][j][k]);
			}
		}
	}
}
}
