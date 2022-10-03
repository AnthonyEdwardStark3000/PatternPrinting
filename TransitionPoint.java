import java.util.*;
public class TransitionPoint{
    public static void main(String[] args)
    {
        int[] numbers = {0,0,0,1,1};
        int len = numbers.length;
        System.out.println(answer(numbers,len));
    }
    public static int answer(int[] numbers, int length){
        int beginning = 0;
        int ending = length-1;
        int flag =0;
        int middle = 0;
        if(length==1 && numbers[0]==0){
            return -1;
        }
        while(beginning <= ending){
        middle = (beginning + ending)/2;
            if(numbers[middle]==1 && numbers[middle-1]==0){
                return middle;
            }
            else if(numbers[middle]==1 && numbers[middle-1]==1){
               flag = 1;
               ending = middle-1;
            }
            else{
                beginning = middle+1;
            }
        }
        if(flag!=1){
            return -1;
        }
        return middle;
    }
}