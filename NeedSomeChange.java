import java.util.*;
public class NeedSomeChange{
    public static void main(String[] args){
        int[] numbers = {1,2,3,4,5};
        int temp;
        int n = numbers.length;
        for(int i=0;i<n-2;i++){
            temp = numbers[i+2];
            numbers[i+2] = numbers[i];
            numbers[i] =  temp;
        }
        System.out.println("The value after swapping is: "+Arrays.toString(numbers));
    }
}