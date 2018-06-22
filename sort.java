import java.util.Scanner;
import java.util.Arrays;
class sortType
{
	public <X>void sort(X arr[])
	{
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++)
		System.out.print(arr[i]+" ");
	System.out.println("\n");
	}
}
class sort {
public static void main(String[] args)
{
	Integer a[]=new Integer[5];
	Double ar[]=new Double[5];
	sortType si=new sortType();
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
	si.sort(a);
	System.out.println("Double type array is:");
	si.sort(ar);
}
}
