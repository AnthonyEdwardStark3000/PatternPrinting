import java.util.*;
public class CountPairSum{
    public static void main(String[] args){
        int[] arr1 = {1,3,5,7};
        int[] arr2 = {2,3,5,8};
        int sum = 10, count = 0;
        int m = arr1.length;
        int p1 = 0;
        int p2= arr2.length-1;
        while(p1<m && p2>=0){
            int total = arr1[p1]+arr2[p2];
            if(total == sum){
                count ++;
                p1++;
                p2--;
            }
            else if(total<sum){
                p1++;
            }
            else{
                p2--;
            }
        }
        System.out.println("The sum "+sum+" can be obtained from the arrays "+Arrays.toString(arr1)+" and "+Arrays.toString(arr2)+" in "+count+" different ways .");
    }
}