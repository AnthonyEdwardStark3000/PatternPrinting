import java.util.*;
public class MinimumDiffPair{
    public static void main(String[] args){
        Vector<Integer> numbers = new Vector<>();
        numbers.add(2);
        numbers.add(4);
        numbers.add(5);
        numbers.add(9);
        numbers.add(7);
        Collections.sort(numbers);
        int len = numbers.size();
        int min = Collections.max(numbers);
        for(int i=1;i<len;i++){
            int temp = numbers.get(i)- numbers.get(i-1);
            if(temp < min){
                min = temp;
            }
        }
        System.out.println("The minimum difference of the entered pair "+numbers+" is : "+min);
    }
}