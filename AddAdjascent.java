import java.util.*;
public class AddAdjascent {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter a count:");
        int count = sc.nextInt();
        int[] numbers = new int[count];
        int total=0;
        for(int i=0;i<count;i++){
            System.out.println("\nEnter the number:");
            numbers[i] = sc.nextInt();
        }
        for(int i=0;i<count;i+=2){
            total = numbers[i]+numbers[i+1];
            System.out.println(total);
            total=0;
        }
    }
}
