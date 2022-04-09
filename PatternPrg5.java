package session;
import java.util.Scanner;
public class PatternPrg5 {
	  public static void main(String[] args) {
		  System.out.println("Enter the number:");
		  Scanner input=new Scanner(System.in);
	      int n=input.nextInt();
	      for(int i=n;i>=1;i--) {
		     for(int j=1;j<=i;j++) {
		     System.out.print(i);
			  }  
			 System.out.println();
		     }
	}  }// TODO Auto-generated method stub

	}

}
