import java.util.*;
import java.util.function.IntPredicate;
public class RotateString{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the string:");
        String input = sc.nextLine();
        System.out.println("\nEnter the positions:");
        int positions = sc.nextInt();
        String substr1 = input.substring(0,input.length()-positions);
        String substr2 = input.substring(input.length()-positions);
        System.out.println(substr2+""+substr1);
    }
}