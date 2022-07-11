import java.util.*;
public class LeastSum {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the count :");
        int count = sc.nextInt();
        int[] numbers = new int[count];
        int minimum=0,k=1;
        for(int i=0;i<count;i++){
            System.out.println("\nEnter number :");
            numbers[i] = sc.nextInt();
        }
        Arrays.sort(numbers);
        System.out.println(numbers[0]+numbers[1]);
    }
}
