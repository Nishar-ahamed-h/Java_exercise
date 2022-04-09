package session;
import java.util.Scanner;
public class PatternPrg7 {
	  public static void main(String[] args) {
			 System.out.println("Enter the number:");
		     Scanner input=new Scanner(System.in);
		     char n=input.next().charAt(0);
		     for(char i=n;i>='a';i--) {
			     for(char j=i;j>='a';j--) {
			    	 System.out.print(j);
					  }  
					 System.out.println();
		    	      }
		  }	}

