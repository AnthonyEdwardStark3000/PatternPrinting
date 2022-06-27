import java.util.*;
public class OnlyAlphabets {
    public static void main(String[] args){
        String input;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string :");
        input = sc.nextLine();
        for(int i=0;i<input.length();i++)
        {
            if(Character.isLetter(input.charAt(i))){
                System.out.print(input.charAt(i));    
            }
        }
    }
}
