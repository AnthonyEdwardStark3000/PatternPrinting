import java.util.*;
public class zohoPalindrome{
    public static void main(String[] args)
    {
        int flag=1;
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter a string:");
        String input = sc.next();
        for(int i=0;i<input.length()/2;i++)
        {
            if(input.charAt(i)!=input.charAt(input.length()-i-1)){
                flag=0;
            }
        }
        if(flag==1){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
    
}
