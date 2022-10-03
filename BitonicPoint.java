import java.util.*;
public class BitonicPoint{
    public static void main(String[] args){
        int n=9;
        int[] arr = {1,15,25,45,42,21,17,12,11};
        System.out.println("The maximum element in the provided Array "+Arrays.toString(arr)+" is :"+answer(arr,n));
    }
    public static int answer(int[] numbers, int len){
        int begin =0;
        int end = len-1;
        int mid;
        while(begin<=end){
            mid = (begin+end)/2;
            if(numbers[mid]>numbers[mid-1] && numbers[mid]> numbers[mid+1]){
                return numbers[mid];
            }
            if(numbers[mid]<numbers[mid+1]){
                begin = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return 0;
    }
}