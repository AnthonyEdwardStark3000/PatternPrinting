import java.util.*;
public class ArraySubSet{
    public static void main(String[] args){
        int a1[] = {1,2,3,4,5,6};
        int a2[] = {1,2,4};
        Arrays.sort(a1);
        Arrays.sort(a2);
        // System.out.println(contains(a1,a2));
        contains(a1,a2);
    }
    public static int contains(int[] arr1, int[] arr2){
        int number = -1;
        for(int i=0;i<arr2.length;i++){
            for(int j=0;j<arr1.length;j++){
                if(arr2[i] == arr1[j]){
                System.out.println(arr2[i]);
                }
            }
        }
        return number;
    }
}