import java.util.*;
public class CharacterTotalValue{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nENter the string:");
        int answer=0;
        String input = sc.nextLine();
        for(int i=0;i<input.length();i++){
          int temp = input.charAt(i)-96;
          answer+=temp;
        }
        System.out.println(answer);
    }
}