import java.util.*;
public class Nthnumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the string:");
        String input = sc.nextLine();
        System.out.println("\nEnter the length:");
        String length = sc.nextLine();
        int count = Integer.parseInt(length);
        String[] numbers = input.split(" ");
        int number1=0,number2=0,number3=0;
        number1 = Integer.parseInt(numbers[0]);
        number2 = Integer.parseInt(numbers[1]);
        number3 = Integer.parseInt(numbers[2]);
        int diff1=0,diff2=0;
        diff1 = number2-number1;
        diff2 = number3-number2;
        if(diff1==diff2)
        {
            for(int i=1;i<count;i++)
            {
                number1 += diff1;
            }
        }
        System.out.println(number1);
    }
}
