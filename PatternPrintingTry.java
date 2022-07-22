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

     1 
    2 2 
   3 3 3 
  4 4 4 4 
 5 5 5 5 5 

 public class Main{
    public static void main(String[] args)
    {
        for(int row=1;row<=5;row++)
        {
            for(int space=5;space>=row;space--){
                System.out.print(" ");
            }
            for(int col=1;col<=row;col++)
            {
             System.out.print(row+" ");   
            }
            System.out.println();
        }
    }
}

     1
    21
   321
  4321
 54321
 
 public class Main{
    public static void main(String[] args)
    {
        for(int row=1;row<=5;row++){
            int printCount = row;
            for(int space=5;space>=row;space--){
                System.out.print(" ");
            }
            for(int col=1;col<=row;col++)
            {
                System.out.print(printCount--);
            }
            System.out.println();
        }
    }
}

    A B C D E F G G F E D C B A 
      B C D E F G G F E D C B 
        C D E F G G F E D C 
          D E F G G F E D 
            E F G G F E 
              F G G F 
                G G 

public class Main{
    public static void main(String[] args)
    {
        int div=1;
        char[] letters = {'G','F','E','D','C','B','A'};
        for(int row=6;row>=0;row--){
            for(int spaces=7;spaces>=row;spaces--){
                System.out.print("  ");
            }
            for(int col=row;col>=0;col--){
                System.out.print(letters[col]+" ");
            }
            for(int col=0;col<=row;col++){
                System.out.print(letters[col]+" ");
            }
            System.out.println();
        }
    }
}

1
10
101
1010
10101

public class Main{
    public static void main(String[] args)
    {
        for(int row=1;row<=5;row++){
            for(int col=1;col<=row;col++){
                System.out.print(col%2);
            }
            System.out.println();
        }
    }
}

*/