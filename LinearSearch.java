import java.util.*;
public class LinearSearch{
    public static void main(String[] args)
    {
        int[] numbers = {-1,2,3,4,5,6,7,8,9};
        int target = -1;
        int el = linearSearch(numbers, target);
        if(el>=0)
        {
            System.out.print("Element found at index "+el);
        }
        else{
            System.out.print("\nEntered element does not exist on the array");
        }
    }
    static int linearSearch(int[] arr, int target){
        int count =0;
        if(arr.length<=0){
            return -1;
        }
        for(int a:arr)
        {
            if(a==target)
            {
                return count;
            }
            count++;
        }
        return -1;
    }
}