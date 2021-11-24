import java.util.Scanner;
public class Sum_OfAll_Array {
	int sum=0;
	int SumOfArray(int arr[], int n)
	{
	    int i;
	    if(n>0)
	    {
	        i=n-1;
	        sum=sum+arr[i];
	        SumOfArray(arr,i);
	    }
	return sum;
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
			Sum_OfAll_Array ob=new Sum_OfAll_Array();
			System.out.print("Sum of Array Element is:"+ob.SumOfArray(arr,n));
			cs.close();
		}
	}