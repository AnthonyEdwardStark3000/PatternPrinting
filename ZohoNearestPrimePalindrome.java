import java.util.*;
public class ZohoNearestPrimePalindrome{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int number = sc.nextInt();
        int highest = number;
        int lowest = number;
        lowest --;
        while(true)
        {
            if(isPalindrome(highest)*isPrime(highest)==1){
                System.out.print("Nearest Palindrome Prime number is :"+highest);
                break;
            }
            if(isPalindrome(lowest)*isPrime(lowest)==1){
                System.out.print("Nearest Palindrome Prime number is :"+lowest);
                break;
            }
            highest++;
            lowest--;
        }
        
    }
    static int isPalindrome(int n){
        int temp =n, remainder =0;
        while(n!=0)
        {
            remainder = remainder*10+n%10;
            n/=10;
        }
        System.out.println(remainder);
        if(temp!=remainder){
            return 0;
        }
        else
        {
            return 1;
        }
    }
    
    static int isPrime(int n)
    {
        int flag =1;
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0)
            {
                flag = 0;
                break;
            }
        }
        return flag;
    }
}