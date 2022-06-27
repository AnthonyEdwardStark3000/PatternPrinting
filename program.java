import java.util.Scanner;
public class program {

	public static void main(String args[])
	{

//		problem1();  
//        problem2();
//        problem3();
      //  problem4();
		//problem5();
		//problem6();
		//problem7();
		problem8();
	}
	public static void problem1()
	{
//		In this challenge, you must read an integer, a double, and a String from stdin, then print the values according to the instructions in the Output Format section below.
//		To make the problem a little easier,
//		a portion of the code is provided for you in the editor.
		
		Scanner scan = new Scanner(System.in);
        
        String number=scan.nextLine();
        int i= Integer.parseInt(number);
        String number2=scan.nextLine();
        double d = Double.parseDouble(number2);
        String value=scan.nextLine();
        System.out.println("String: "+ value);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);	
	}
	public static void problem2()
	{
		/*
		 * Java's System.out.printf function can be used to print formatted output. 
		 * The purpose of this exercise
		 *  is to test your understanding of formatting output using printf.
         To get you started, a portion of the solution is provided for you
         in the editor; you must format and print the input to complete the solution.
         ================================
		 java           100 
		 cpp            065 
		 python         050 
		 ================================
         */
		 Scanner sc = new Scanner(System.in);
		 System.out.println("================================");
         for(int i=0;i<3;i++){
//        	 System.out.print("Enter a string:");
             String s1=sc.next();
//        	 System.out.print("Enter a number:");
             int x=sc.nextInt();
//             System.out.format("%-15s%03d%n",s1,x);
         }
         System.out.println("================================");
		
		
	}
	
	public static void problem3()
	{
//		Given an integer,N , print its first 10 multiples. 
//		Each multiple N*1 (where ) should be printed on a new line in the form: N x i = result.
		
//              2 x 1 = 2
//			      :
//				2 x 10 = 20
		 Scanner sc = new Scanner(System.in);
	         System.out.print("Enter a number:");
	        int number=1;
	        int a=sc.nextInt();
	        for(int i=1;i<=10;i++)
	        {
	            number=i*a;
	            System.out.println(a+" x "+i+" = "+number);
	        }
		
		
	}
	
	public static void problem4()
	{
		Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            int answer=a;
           for(int j=0;j<n;j++)
           {
            answer+=(Math.pow(2,j)*b);
            System.out.print(answer+" ");
           }
        System.out.println();
        }
        sc.close();
	}
	
	public static void problem5()
	{
		System.out.println("Find the data types where the number can be fitted:");
		       Scanner sc = new Scanner(System.in);
		       System.out.println("Enter the number of numbers:");
		        int t=sc.nextInt();

		        for(int i=0;i<t;i++)
		        {
		        	System.out.println("Enter the number"+i+":");
		            try
		            {
		                long x=sc.nextLong();
		                System.out.println(x+" can be fitted in:");
		                if(x>=-128 && x<=127)
		                System.out.println("* byte");
		                if(x>=-32768 && x<=32767)
		                {
		                    System.out.println("* short");
		                }
		                if(x>=-2147483648 && x<=2147483647)
		                {
		                    System.out.println("* int");
		                } 
		                if(x>=-9223372036854775808L && x<= 9223372036854775807L)                
		                {
		                    System.out.println("* long");
		                }
		            }
		            catch(Exception e)
		            {
		                System.out.println(sc.next()+" can't be fitted anywhere.");
		            }

		        }
		    } 
	
	public static void problem6()
	{
		/*Input Format

Read some unknown  lines of input from stdin(System.in) until you reach EOF; each line of input contains a non-empty String.

Output Format

For each line, print the line number, followed by a single space, and then the line content received as input.*/
	        Scanner sc = new Scanner(System.in);
		       int count=1; 
		       while (sc.hasNext()) {
		       String input = sc.nextLine(); 
		    //    StdOut.println(count+" "+input);
		    System.out.println(count+" "+input);
		       count++;
		   }
		  }
	
	public static void problem7()
	
	{
			/*
			 * There are two lines of input. The first line contains : the breadth of the parallelogram. The next line contains : the height of the parallelogram.
			 *If both values are greater than zero, then the main method must output the area of the parallelogram. Otherwise, print "java.lang.Exception: Breadth and height must be positive" without quotes. 
			 * 
			 import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
static int B;
static int H;
static boolean flag= true;

static
{
     Scanner sc = new Scanner(System.in);
     B=sc.nextInt();
     H=sc.nextInt();
if(B<=0 || H<=0)
   {
    System.out.println("java.lang.Exception: Breadth and height must be positive");
    flag=false;
   }
}
public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of cl
			 **/		
	}
	
	public static void problem8()
	{
		/*You are given an integer , you have to convert it into a string.

Please complete the partially completed code in the editor. If your code successfully converts  into a string  the code will print "Good job". Otherwise it will print "Wrong answer".
		 * 
		 * import java.util.*;
import java.security.*;
public class Solution {
 public static void main(String[] args) {

  DoNotTerminate.forbidExit();

  try {
   Scanner in = new Scanner(System.in);
   int n = in .nextInt();
   in.close();
   //String s=???; Complete this line below

   //Write your code here
   String s=Integer.toString(n);

   
   if (n == Integer.parseInt(s)) {
    System.out.println("Good job");
   } else {
    System.out.println("Wrong answer.");
   }
  } catch (DoNotTerminate.ExitTrappedException e) {
   System.out.println("Unsuccessful Termination!!");
  }
 }
}

//The following class will prevent you from terminating the code using exit(0)!
class DoNotTerminate {

 public static class ExitTrappedException extends SecurityException {

  private static final long serialVersionUID = 1;
 }

 public static void forbidExit() {
  final SecurityManager securityManager = new SecurityManager() {
   @Override
   public void checkPermission(Permission permission) {
    if (permission.getName().contains("exitVM")) {
     throw new ExitTrappedException();
    }
   }
  };
  System.setSecurityManager(securityManager);
 }
}

		 * */
	}
	
}//end of class

	
	
	
	
