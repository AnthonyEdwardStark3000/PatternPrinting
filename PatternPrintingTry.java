/**1
24
369
481216
510152025
61218243036
7142128354249
816243240485664
91827364554637281
102030405060708090100 */
import java.util.*;
public class PatternPrintingTry{
    public static void main(String[] args)
    {
        for(int row=1;row<=10;row++)
        {
            for(int col=1;col<=row;col++){
                System.out.print(col*row);
            }
            System.out.println();
        }
    }
}

/**1
23
345
4567
56789 

import java.util.*;
public class Main{
    public static void main(String[] args)
    {
           for(int row=1;row<=5;row++)
           {
               for(int col=0;col<row;col++)
               {
                   int printVar = row;
                   System.out.print(printVar+col);
               }
               System.out.println();
           }
        }
        
    }

1
212
32123
4321234
543212345

public class Main{
    public static void main(String[] args)
    {
        for(int row=1;row<=4;row++)
        {
            for(int col1=0;col1<row;col1++)
            {
                System.out.print(row-col1);    
            }
            
            for(int col1=2;col1<=row;col1++)
            {
                System.out.print(col1);    
            }
            
            System.out.println();
        }
    }
}

1   5
 2 4 
  3  
 2 4 
1   5

import java.util.*;
public class Main{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        // System.out.println("\nEnter the string:");
        // String input=sc.nextLine()
        for(int row=1;row<=5;row++)
        {
            for(int col=1;col<=5;col++)
            {
                if(col==5+1-row){
                    System.out.print(col);
                }
                else if(row==col)
                {
                    System.out.print(col);
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
Cry


C y  
 r   
C y  

import java.util.*;
public class Main{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the string:");
        String input=sc.nextLine();
        for(int row=1;row<=input.length();row++)
        {
            for(int col=1;col<=input.length();col++)
            {
                if(col==input.length()+1-row){
                    System.out.print(input.charAt(col-1));
                }
                else if(row==col)
                {
                    System.out.print(input.charAt(col-1));
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

*/