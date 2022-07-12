import java.util.*;
public class WaterCan{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter v1:");
        int v1 =sc.nextInt();
        System.out.println("\nEnter v2:");
        int v2 =sc.nextInt();
        System.out.println("\nEnter v3:");
        int v3 =sc.nextInt();
        int count=2;
        if(v3>v1 && v3>v2){
            System.out.print("-1");
        }
        while(v1>v3 || v2>v3){
            int temp = v2;
            v1 = v1-v2;
            // v2 = v2+v2;
            // v3 = v2-temp;
            ++count;
            System.out.println("v1:"+v1+"\nV2:"+v2+"\ncount:"+count);
            if(v1==v3){
                System.out.print(count);
            }
        }
    }
}