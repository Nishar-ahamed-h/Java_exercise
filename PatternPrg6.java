package session;
import java.util.Scanner;
public class PatternPrg6 {
  public static void main(String[] args) {
	 System.out.println("Enter the number:");
     Scanner input=new Scanner(System.in);
     int n=input.nextInt();
     for(int i=n;i>=1;i--) {
	     for(int j=i;j>=1;j--) {
	    	 System.out.print(j);
			  }  
			 System.out.println();
    	      }
  }	}