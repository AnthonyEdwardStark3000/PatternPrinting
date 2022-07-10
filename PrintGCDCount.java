import java.util.*;
public class PrintGCDCount{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the count :");
        int n = sc.nextInt();
        int[] numbers = new int[n];
        // int[] factors = new int[1000];
        String factors="";

        for(int i=0;i<n;i++){
            System.out.println("\nEnter the number:");
            numbers[i] = sc.nextInt();
        }
        for(int row=0;row<n;row++){
            for(int col=2;col<numbers[row];col++){
                if(numbers[row]%col==0){
                    System.out.println(col);
                    factors+=col;
                    factors+=" ";
                }
            }
            factors+= "_";
        }
    }
}