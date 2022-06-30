import java.util.*;
public class ImmediatePrimeNUmbers {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter a number:");
        int number = sc.nextInt();
        number++;
        for(int i=2;i<number;i++)
        {
            if(number%i==0)
            {
                number++;
                i=2;
            }
            else{
                continue;
            }
        }
        System.out.println(number);
    }    
}
