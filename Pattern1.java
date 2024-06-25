import java.util.Scanner;

class Pattern1
{

	void Display()
	{
		for(int i=1; i<=4; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
	public static void main(String args[])
	{
		Pattern1 obj = new Pattern1();
		obj.Display();
		
	}
}























