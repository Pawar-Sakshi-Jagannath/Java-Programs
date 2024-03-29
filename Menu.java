import java.util.*;
class Menu
{
	public static void main(String args[])
	{
		int a,b,result,ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter First Number :");
		a=sc.nextInt();
		System.out.println("\nEnter Second Number :");
		b=sc.nextInt();
		do
		{
			System.out.println("\n1] Addition\n2] Subtraction\n3] Multiplication\n4] Division\n5] Exit\n");
			System.out.println("\nEnter Your Choice :");
			ch=sc.nextInt();
			switch(ch)
			{
				case 1:
				result=a+b;
				System.out.println("\nAddition :"+result);
				break;
				case 2:
				result=a-b;
				System.out.println("\nSubtraction :"+result);
				break;
				case 3:
				result=a*b;
				System.out.println("\nMultiplication :"+result);
				break;
				case 4:
				result=a/b;
				System.out.println("\nDivision:"+result);
				break;
			}
		}while(ch!=5);
	}
}