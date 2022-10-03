import java.util.*;
public class ExtraElement{
    public static void main(String[] args){
        int[] a = {2,4,6,8,9,10,12};
        int[] b = {2,4,6,8,10,12};
        System.out.println("The missing element index is :"+check(a,b));
    }
    public static int check(int[] arr1, int[] arr2){
        int begin=0, end=arr1.length-1, middle,index=0;
        while(begin<=end){
             middle = (begin+end)/2;
             if(arr1[middle] == arr2[middle]){
                begin = middle+1;
             }
             else{
                index = middle;
                end = middle-1;
             }
        }
        return index;
    }
}