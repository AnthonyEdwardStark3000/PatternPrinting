import java.util.*;
public class NextNumberPalindrome {
    public static int reverseNumber(int number){
        int revnumber = 0;
        while(number>0){
            revnumber += number%10;
            revnumber*=10;
            number=number/10;
        }
        revnumber = revnumber/10;
        return revnumber;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter a number:");
        int number = sc.nextInt();
        int reverse = reverseNumber(number);
        while(true){
            if(number==reverse){
            System.out.print(number);
            break;
        }
        else{
            number++;
            reverse = reverseNumber(number);
        }
    }

    }
}
