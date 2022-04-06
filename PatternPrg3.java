package examples;
import java.util.Scanner;
public class PatternPrg3 {
	public static void main(String[] args) {
		  Scanner input=new Scanner(System.in);
		  char n=input.next().charAt(0);
		  for(char i=n;i>='A';i--) {
	      for(char j=n;j>='A';j--) {
	        System.out.print(i);
	       }
	       System.out.println();
	}
}}