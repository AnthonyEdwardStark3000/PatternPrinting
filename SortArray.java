import java.util.*;
public class SortArray{
    public static void main(String[] args){
        int c0 =0;
        int c1 =0;
        int c2 =0;
        int n =5;
        int[] numbers = {0,2,1,2,0};
        for(int i=0;i<n;i++){
            if(numbers[i]==0){
                c0++;
            }
            else if(numbers[i]==1){
                c1++;
            }
            else{
                c2++;
            }
        }

        for(int j=0;j<c0;j++){
            numbers[j] =0;
        }

        for(int j=c0;j<c0+c1;j++){
            numbers[j] =1;
        }

        for(int j=c0+c1;j<c0+c1+c2;j++){
            numbers[j] =2;
        }
        System.out.println("The final array result is :"+Arrays.toString(numbers));
    }
}