import java.util.*;
public class StringConcatenation {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter string 1:");
        String input1 = sc.nextLine();
        System.out.println("\nEnter string 2:");
        String input2 = sc.nextLine();
        if(input1.length() > input2.length()){
            System.out.println(input1+input2);
        }
        else{
            System.out.println(input2+input1);
        }
    }
}
