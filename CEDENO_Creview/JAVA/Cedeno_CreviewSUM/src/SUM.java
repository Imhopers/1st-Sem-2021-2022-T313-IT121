import java.util.*;
public class SUM {

	public static void main(String[] args) {
		int n, i, num, sum=0;
	      Scanner scan = new Scanner(System.in);
	      
	      System.out.print("Enter the Value of n: ");
	      n = scan.nextInt();
	      System.out.print("Enter " +n+ " Numbers: ");
	      for(i=0; i<n; i++)
	      {
	         num = scan.nextInt();
	         sum = sum + num;
	      }
	      
	      System.out.println("\nSum = " +sum);
	   }
	}

