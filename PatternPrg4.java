package session;
import java.util.Scanner;
public class PatternPrg4 {
	public static void main(String[] args) {
		System.out.println("Enter the number:");
		  Scanner input=new Scanner(System.in);
	      int n=input.nextInt();
	      for(int i=1;i<=n;i++) {
		     for(int j=1;j<=i;j++) {
		     System.out.print(j);
			  }  
			 System.out.println();
		     }
	}  }
