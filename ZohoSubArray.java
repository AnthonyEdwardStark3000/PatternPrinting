import java.util.*;
public class ZohoSubArray {
    public static void main(String[] args)
    {
        int[] inputs = {1, 2, 4, 3, 5, 6};
        int sum = 5;
        for(int i=0;i<inputs.length;i++){
            result(inputs ,i ,sum ,inputs[i], String.valueOf(inputs[i]));
        }
    }
    static void result(int[] arr, int i, int sum, int CurrentIndexvalue, String s){
        for(int j=i+1;j<arr.length;j++){
            if(CurrentIndexvalue+arr[j]==sum){
                System.out.println("("+s+" & "+String.valueOf(arr[j])+")");
            }
            else
            {
                result(arr ,j ,sum ,CurrentIndexvalue+arr[j], String.valueOf(s+" "+arr[j]));
            }
        }
    }
}
