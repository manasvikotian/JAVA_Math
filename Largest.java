import java.io.*;
class Largest
{
	public static void main(String args[])
	{
		int a=1999,b=2344,c=5400,d;
		System.out.print("The numbers we have are "+a+", "+b+" and "+c+".\n");
		if(a>b)
		{
			d=a;
		}
		else
		{
			d=b;
		}
		if (d>c)
		{
			System.out.print(d+" is the greatest number.\n");
		}
		else
		{
			System.out.print(c+" is the greatest number.\n");
		}
	}
}
