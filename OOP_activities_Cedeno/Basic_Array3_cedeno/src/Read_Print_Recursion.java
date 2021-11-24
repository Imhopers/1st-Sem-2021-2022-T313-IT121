import java.util.Scanner;
public class Read_Print_Recursion {
static void PrintArray(int arr[], int i, int n)
{
	if(i>=n)
		return;
	System.out.print(arr[i]+" ");
	PrintArray(arr,i+1,n);
}
	public static void main(String[] args) {
		Scanner cs=new Scanner(System.in);
		int n,i;
		System.out.println("Enter your Array Size:");
		n=cs.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the Array Element:");
		for(i=0;i<n;i++)
		{
			arr[i]=cs.nextInt();
		}
		System.out.print("Array Element Are:");
		PrintArray(arr,0,n);
		cs.close();

	}
}





















