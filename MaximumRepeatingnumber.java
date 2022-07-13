import java.util.*;
public class MaximumRepeatingnumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter a string with the input numbers:");
        String input = sc.nextLine();
        String[] numbers = input.split(" ");
        int count=0,maxCount=0;
        String max="";
        for(int i=0;i<numbers.length;i++){
            String num = numbers[0];
            if(num.equals(numbers[i])){
                count++;
                max=num;
            }
        }
        maxCount=count;
        count=0;
    }
}
