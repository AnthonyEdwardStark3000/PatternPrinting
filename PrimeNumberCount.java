import java.util.*;
public class PrimeNumberCount{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter a starting number:");
        int start = sc.nextInt();
        System.out.println("\nEnter a ending number:");
        int end = sc.nextInt();
        int count =0,i,j;
        for(i=start;i<=end;i++){
            for(j=2;j<i;j++){
                if(i%j==0){
                    break;
                }
            }
            if(i==j){
                count++;
            }
        }
        System.out.println(count);
    }
}
