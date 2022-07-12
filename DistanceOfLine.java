import java.util.*;
public class DistanceOfLine {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter coordintates of Line 1:");
        String input1= sc.nextLine();
        String[] values1 = input1.split(" ");
        System.out.println("\nEnter coordintates of Line 2:");
        String input2= sc.nextLine();
        String[] values2 = input2.split(" ");
        double x1,y1,x2,y2;
        x1= Double.parseDouble(values1[0]);
        y1= Double.parseDouble(values1[1]);
        x2= Double.parseDouble(values2[0]);
        y2= Double.parseDouble(values2[1]);
        double ans = Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
        System.out.printf("%.2f",ans);
    }
}
