import java.util.*;
public class zohoReverseArray{
    public static void main(String[] args)
    {
        int[] numbers = {1,2,3,4,5,6};
        int[] reversedNumbers = new int[numbers.length];
        int start =0, end=numbers.length-1, middle=end/2;
        for(int i=start;i<numbers.length;i++)
        {
            reversedNumbers[i] = numbers[end];
            end--;
        }
        System.out.println(Arrays.toString(reversedNumbers));
    }
}