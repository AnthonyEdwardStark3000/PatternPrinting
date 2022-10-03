import java.util.*;
public class EquilibriumPoint{
    public static void main(String[] args){
        int n=7;
        // int[] numbers = {7};
        int[] numbers = {1,3,5,9,2,2,5};
        System.out.println("The maximum Value in the entered array "+Arrays.toString(numbers)+" is :"+numbers[answer(numbers,n)]+" and index is :"+(answer(numbers,n)+1));
    }

    public static int answer(int[]numbers, int len){
        if(len==1){
            return 0;
        }
        int leftSum =0, rightSum=0,answerPoint;
        for(int i=0;i<len;i++){
            rightSum += numbers[i];
        }

        for(int i=0;i<len;i++){
            rightSum -= numbers[i];
            if(rightSum == leftSum)
            {
                return i;
            }
            leftSum+= numbers[i];
        }
        return -1;
    }
}