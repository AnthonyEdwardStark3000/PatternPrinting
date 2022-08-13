import java.util.*;
public class Main{
    static int lengthFinder(int n){
        int count = 0;
        while(n>0){
        n/=10;
        count++;
        }
        return count;
    }
    public static void main(String[] args){
        int number = 12321, position=0;
        boolean isPalindrome = true;
        int length = lengthFinder(number);
        int [] reversedNumber = new int[length];
        
        while(number>0){
            reversedNumber[position] = number%10;
            number/=10;
            position++;
        }
        
        for(int start=0, end=length-1;start<end;start++,end--)
        {
            if(reversedNumber[start] != reversedNumber[end]){
                isPalindrome= false;
                break;
            }
        }

        if(isPalindrome){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }
        }
}