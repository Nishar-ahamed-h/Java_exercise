package examples;
import java.util.Scanner;
public class PatternPrg1
  {
  public static void main(String args[])
  {
	  Scanner input=new Scanner(System.in);
	  int n=input.nextInt();
	  for(int i=n;i>=n;i--) {
      for(int j=n;j>=n;j--) {
        System.out.print(i);
       }
       System.out.println();
  }}}