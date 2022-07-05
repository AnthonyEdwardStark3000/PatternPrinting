import java.util.*;
public class MatrixSum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("\nENter the row and col count:");
        int count = sc.nextInt();
        int total =0;
        int[][] values = new int[count][count];
        for(int row=0;row<count;row++)
        {
            for(int col=0;col<count;col++){
                System.out.print("Enter the element in []"+row+"[]"+col+":");
                values[row][col] = sc.nextInt(); 
            }
        }
        for(int row=0;row<count;row++){
            for(int col=0;col<count;col++){
                System.out.print(values[row][col]+" ");
            }
            System.out.println();
        }
        total+= values[0][0];
        total+= values[0][count-1];
        total+= values[count-1][0];
        total+= values[count-1][count-1];
        System.out.println(total);
    }
}
