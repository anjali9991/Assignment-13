import java.util.Scanner;
class printType
{
	public <X>void print(X arr[])
	{
		for(int i=0;i<arr.length;i++)
		System.out.print(arr[i]+" ");
	System.out.println("\n");
	}
}

public class print {
	public static void main(String[] args)
	{
		Integer a[]=new Integer[5];
		Double ar[]=new Double[5];
		printType si=new printType();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter integer type array:");
		for(int i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter double type array:");
		for(int i=0;i<5;i++)
		{
			ar[i]=sc.nextDouble();
		}
		sc.close();
		System.out.println("Integer type array is:");
		si.print(a);
		System.out.println("Double type array is:");
		si.print(ar);
	}
}
