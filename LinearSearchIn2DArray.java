import java.lang.reflect.Array;
import java.util.Arrays;

public class LinearSearchIn2DArray {
    public static void main(String[] args)
    {
        int[][] arr = {
            {1,2,3},
            {4,5,6},
            {12,18,24}
        };
        int target = 18;
        int[] ans = search(arr,target);
        System.out.print("The presence of number "+target+" in the array "+Arrays.toString(ans));
    }
    static int[] search(int[][] arr, int num)
    {
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++)
            {
                if(arr[row][col] == num){
                    return new int[] {row , col};
                }
            }
        }
        return new int[] {-1, -1};
    }
}
