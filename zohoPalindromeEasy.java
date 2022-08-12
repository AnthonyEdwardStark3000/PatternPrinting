import java.util.*;
public class zohoPalindromeEasy{
    public static void main(String[] args)
    {
        String input = "MADAM";
        int end = input.length()-1;
        int length = input.length();
        int count=0;
        for(int start=0;start<input.length();start++)
        {
            if(input.charAt(start) == input.charAt(end)){
                count++;
            }
            end--;
        }

        if(count == length){
            System.out.print("Palindrome");
        }
        else{
            System.out.print("Non Palindrome");
        }
    }
}