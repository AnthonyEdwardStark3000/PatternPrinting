import java.util.*;
public class ZohoSubsets{
    static void sum(int[] numbers,int i,int number,int limit,String s){
        for(int j=i+1;j<numbers.length;j++)
        {
            if(numbers[j]+number==limit){
                System.out.println(s+" "+String.valueOf(numbers[j]));
            }
            else
            {
                sum(numbers,j,number+numbers[j],limit, s+" "+String.valueOf(numbers[j]));
            }
        }
    }
    public static void main(String[] args)
    {
        int[] numbers = {2, 3, 5, 8, 10};
        int limit =10;
        for(int i=0;i<numbers.length;i++)
        {
            if(numbers[i] ==limit){
                System.out.println(numbers[i]);
            }
        sum(numbers,i,numbers[i],limit,String.valueOf(numbers[i]));
        }
    }
}