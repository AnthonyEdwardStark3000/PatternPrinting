import java.util.*;
public class HeadAndlegsCount{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the head count:");
        int head = sc.nextInt();
        System.out.println("\nEnter the legs count:");
        int legs = sc.nextInt();
        int total = legs/2-head;
        System.out.println(head-total+" "+total);
    }
}