import java.util.*;
public class Patternprint1 {
    public static void main(String[] args){
        // pattern1(5);
        // pattern2(5);
        // pattern3(5);
        // pattern4(5);
        // pattern5(5);
        // pattern28(5);
        // pattern30(5);
        // pattern17(4);
        pattern31(4);
    }
    static void pattern1(int n){
        System.out.println("\nPattern 1:\n");
        for(int row=0;row<n;row++){
            //step 2 run col for every row.
            for(int col=0;col<n;col++){
                System.out.print("* ");
            } 
            //when one row is printed , print new line
            System.out.println();
        }
    }
    static void pattern2(int n){
        System.out.println("\nPattern 2:\n");
        for(int row=0;row<n;row++){
            //step 2 run col for every row.
            for(int col=0;col<=row;col++){
                System.out.print("* ");
            } 
            //when one row is printed , print new line
            System.out.println();
        }
    }
    static void pattern3(int n){
        System.out.println("\nPattern 3:\n");
        for(int row=0;row<n;row++){
            for(int col=n;col>row;col--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern4(int n){
        System.out.println("\nPattern 4:\n");
        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
    static void pattern5(int n){
        for(int row=0;row<2*n;row++){
            int totalCol = row> n ? 2 * n - row : row;
            for(int col=0;col<totalCol;col++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern28(int n){
        for(int row=0;row<2*n;row++){
            int totalCol = row> n ? 2 * n - row : row;
            int spaces = n-totalCol;
            for(int i=0 ;i<spaces;i++)
            {
                System.out.print(" ");
            }
            for(int col=0;col<totalCol;col++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern30(int n){
        for(int row=1;row<=n;row++)
        {
            int spaces = n-row;
            for(int i=0;i<=spaces;i++)
            {
                System.out.print("  ");
            }
            for(int col=row;col>=1;col--){ 
                System.out.print(col+" ");
            }
            for(int col2=2;col2<=row;col2++)
            {
                System.out.print(col2+" ");
            }
            System.out.println();
        }
}

    static void pattern17(int n){
        for(int row=1;row<= 2*n ;row++)
        {
            int c = row>n? 2*n-row:row;
            for(int space=0;space<n-c;space++)
            {
                System.out.print("  ");
            }
            for(int col=c;col>=1;col--){ 
                System.out.print(col+" ");
            }
            for(int col=2;col<=c;col++)
            {
                System.out.print(col+" ");
            }
            System.out.println();
        }
}
    static void pattern31(int n){
        int originalN = n;
        n=2*n;
        for(int row=0;row<=n;row++){
            for(int col=0;col<=n;col++)
            {
                int atIndex = originalN-Math.min(Math.min(row,col),Math.min(n-row,n-col));
                System.out.print(atIndex+" ");
            }
            System.out.println();
        }
    }
}
