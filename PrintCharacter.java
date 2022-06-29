import java.util.*;
public class PrintCharacter{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String input;
        System.out.println("\nEnter the string:");
        input = sc.nextLine();
        int number;
        System.out.println("\nEnter the number:");
        number = sc.nextInt();
        int x = number-1;
        for(int i=x;i<input.length();)
        {
            System.out.print(input.charAt(i));
            i+=number;
        }

}
}