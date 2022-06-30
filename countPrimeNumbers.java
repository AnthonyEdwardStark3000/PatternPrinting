import java.util.*;
public class countPrimeNumbers {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the starting number:");
        int start = sc.nextInt();
        System.out.println("\nEnter the ending number:");
        int end = sc.nextInt();
        int count = 0;
        for(int i=start+1;i<end;i++)
        {
            int flag=0;
            for(int j=1;j<=i;j++)
            {
                if(i%j==0){
                    flag ++;
                }
            }
            if(flag==2){
                count++;
            }
        }
        System.out.println(count);
    }
}
