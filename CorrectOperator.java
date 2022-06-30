import java.util.*;
public class CorrectOperator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the string:");
        String input = sc.nextLine();
        input = input.replace("+", "=");
        input = input.replace("-", "=");
        input = input.replace("*", "=");
        input = input.replace("/", "=");
        String[] numbers = input.split("=");
        int number1 = Integer.parseInt(numbers[0]);
        int number2 = Integer.parseInt(numbers[1]);
        int number3 = Integer.parseInt(numbers[2]);
        if(number1+number2 ==number3)
        {
            System.out.println("+");
        }
        else if(number1-number2 ==number3)
        {
            System.out.println("-");
        }
        else if(number1*number2 ==number3)
        {
            System.out.println("*");
        }
        else if(number1-number2 ==number3)
        {
            System.out.println("/");
        }
    }
}
