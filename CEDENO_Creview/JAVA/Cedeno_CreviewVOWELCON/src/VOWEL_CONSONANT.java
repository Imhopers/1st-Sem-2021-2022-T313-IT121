import java.util.Scanner;

public class VOWEL_CONSONANT {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	      
	      System.out.print("Enter an Alphabet: ");
	      char ch = scan.next().charAt(0);
	      
	      int ascii = ch;
	      if(ch==65 || ch==69 || ch==73 || ch==79 || ch==85)
	         System.out.println("\n\'" +ch+ "\' is an Uppercase Vowel.");
	      else if(ch==97 || ch==101 || ch==105 || ch==111 || ch==117)
	         System.out.println("\n\'" +ch+ "\' is a Lowercase Vowel.");
	      else
	      {
	         if((ascii>=65 && ascii<=90) || (ch>=97 && ch<=122))
	            System.out.println("\n\'" +ch+ "\' is a Consonant.");
	         else
	            System.out.println("\n\'" +ch+ "\' INVALID INPUT.");
	      }

	}

}
