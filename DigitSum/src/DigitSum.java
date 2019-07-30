import java.util.Scanner;
public class DigitSum {
	 public static void main(String args[])
	 {
	   int temp;
	   int digitSum=0;
	   System.out.println("Enter any number b/w 0 and 1000");
	   Scanner sc=new Scanner(System.in);
	   int num=sc.nextInt();
	  
	   if(0<=num && num<=1000)
	   {
		 while (num > 0)
	      {
	        temp = num % 10;
	        digitSum= digitSum + temp;
	        num =num/10;
	      }	
	      System.out.println(digitSum);	  
	   }
	   else
	    System.out.println("Please enter value in given range");
	 }


}
