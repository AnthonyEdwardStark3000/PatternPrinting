import java.util.*;
public class CountOfWords {
    public static void main(String[] args){
        String input;
        int count=1;
        System.out.println("\nEnter the string :");
        Scanner sc = new Scanner(System.in);
        input = sc.nextLine();
        for(int i=0;i<input.length();i++)
        {
            char letter = input.charAt(i);
            if(letter==' '){
                count++;
            }
        }
        System.out.println("\nThe total letters is :"+count);
    }
}
