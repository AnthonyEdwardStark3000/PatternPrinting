import java.util.*;
public class SumofOdd {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter number count:");
        int count = sc.nextInt();
        int[] numbers = new int[count];
        int total =0;
        for(int i=0;i<count;i++){
            System.out.println("\nENter a number:");
            numbers[i] = sc.nextInt();
        }
        for(int i=1;i<count;i++){
            if(i%2!=0){
                total+= numbers[i];
            }
        }
        System.out.println("\nAnswer is :"+total);
    }
}
