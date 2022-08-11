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

12344321
123**321
12****21
1******1

public class Main{
    public static void main(String[] args)
    {
        for(int row=4;row>=1;row--){
            for(int col=1;col<=row;col++)
            {
                System.out.print(col);
            }
            if(row<4){
                for(int col=3;col>=row;col--){
                    System.out.print("**");
                }
            }
            for(int col=row;col>=1;col--){
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
11 
12 13 
13 14 15 
14 15 16 17 

public class Main{
    public static void main(String[] args)
    {
        int i=0;
        for(int row=11;row<=14;row++){
            for(int col=11;col<=row;col++)
            {
                System.out.print(row+i+" ");
                i++;
            }
            i=0;
            System.out.println();
        }
    }
}

Enter a number : 3
1 4 6 
2 5 
3 

import java.util.*;
public class Main{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :\n");
        int input = sc.nextInt();
        sc.nextLine();
        int a= input,temp=0,i=input-1;
        for(int row=1;row<=input;row++){
            for(int col=input;col>=row;col--)
            {
                if(col==input){
                    System.out.print(row+" ");
                    
                }
                else{
                   temp = row+a;
                   a+=i;
                   System.out.print(temp+" ");
                   i--;
                }
            }
                a=input;i=input-1;
            System.out.println();
        }
    }
}

Enter the number :
\UUU/
L\U/R
LL\RR
L/K\R
/KKK\

import java.util.*;
public class Main{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the number :");
        int input = sc.nextInt();
        int i=0;
        for(int row=1;row<=input;row++){
            for(int col=1;col<=input;col++){
               if(row==col){
                   System.out.print("\\");
               }
               else if(col==input-i){
                   System.out.print("/");
               }
               else if(row<=input/2 && col!=1 && col!=input){
                   System.out.print("U");
               }
               else if(row>=col-i && col<input/2+1 && row!=input){
                   System.out.print("L");
               }
               else if(row==input||row==input-1 && col>=input/2+1 && col!=input){
                   System.out.print("K");
               }
               else{
                   System.out.print("R");
               }
            }
               i++;
            System.out.println();
        }
    }
}

        1
      1 2 1 
    1 2  3 2 1 
  1 2  3  4 3 2 1 

public class MyClass {
    public static void main(String args[]) {
        for(int row=1;row<=4;row++){
            for(int space=4;space>=row;space--){
                System.out.print("  ");
            }
            System.out.print("1");
            for(int col=2;col<=row;col++)
            {   
                System.out.print(" ");
                System.out.print(col+" ");
            }
            if(row>1){
            for(int col2=row-1;col2>=1;col2--){
                System.out.print(col2+" ");
            }
            }
            System.out.println();
        }
    }
}

     *
    ***
   *****
  *******
 *********
  *******
   *****
    ***
     *

public class diamond{
    public static void main(String[] args)
    {
        int n=5;
        for(int row=1;row<=n;row++){
            for(int space=n;space>=row;space--)
            {
               System.out.print(" ");
            }
           for(int col=1;col<=row;col++){
               System.out.print("*");
           }
           for(int col2=1;col2<row;col2++)
           {
               System.out.print("*");
           }
        System.out.println();
        }
        for(int row=1;row<=n;row++){
            for(int space=0;space<=row;space++)
            {
               System.out.print(" ");
            }
           for(int col=n-1;col>=row;col--){
               System.out.print("*");
           }
           for(int col2=n-1;col2>row;col2--)
           {
               System.out.print("*");
           }
        System.out.println();
        }
    }
}

M R . A N T O N 
            Y   
          *     
        E       
      D         
    W           
  A             
R D * S T A R K 
                



public class Main{
    public static void main(String[] args)
    {
        int position =1;
        String input ="MR.ANTONY*EDWARD*STARK";
       // System.out.print(input.length());
        for(int i=1;i<=8;i++)
        {
            System.out.print(input.charAt(position-1)+" ");
            position++;
        }
        System.out.println();
      for(int row=1;row<=8;row++)
      {
              position++;
          for(int col1=1;col1<=8;col1++)
          {
              if(col1 == 8-row){
                  System.out.print(input.charAt(position-2)+" ");
              }
              else if(row==7 && col1>=1 && col1<=8){
                  position++;
                  System.out.print(input.charAt(position-2)+" ");
              }
              else
              {
                  System.out.print("  ");
              }
          }
          System.out.println();
      }
    }
}

        * 
        * 
        * 
        * 
* * * * * * * * * 
        * 
        * 
        * 
        * 


public class Main{
    public static void main(String[] args)
    {
        int n = 9;
        int count = (n+1)/2;
        for(int row=1;row<=n;row++)
        {
            for(int col=1;col<=n;col++)
            {
                if(col==n/2+count){
                    System.out.print("*"+" ");
                }
                else if(row == n/2+1){
                    System.out.print("*"+" ");
                }
                else
                {
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }
    }
}

Enter a number :
                0 
              1 0 1 
            2 1 0 1 2 
          3 2 1 0 1 2 3 
        4 3 2 1 0 1 2 3 4 
      5 4 3 2 1 0 1 2 3 4 5 
    6 5 4 3 2 1 0 1 2 3 4 5 6 
  7 6 5 4 3 2 1 0 1 2 3 4 5 6 7 

import java.util.*;
public class Main{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter a number :\n");
        int n =sc.nextInt();
        for(int row=0;row<=n;row++)
        {
            int val =row;
            for(int space=n;space>=row;space--)
            {
                System.out.print("  ");
            }
            for(int col=0;col<=row;col++)
            {
                System.out.print(val--+" ");
            }
            for(int col=0;col<=row;col++)
            {
               if(row>0 && col>0){
                   System.out.print(col+" ");
                   
               }
            }
            System.out.println();
        }
    }
}

* * * * 
*     * 
*     * 
* * * * 

public class Main{
    public static void main(String[] args)
    {
        int n=5;
        for(int row=1;row<n;row++)
        {
            for(int col=1;col<n;col++)
            {
                if(row==1 || row==n-1){
                    System.out.print("*"+" ");
                }
                else if(col==1||col==n-1){
                    System.out.print("*"+" ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
*/