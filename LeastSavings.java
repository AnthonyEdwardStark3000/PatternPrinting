import java.util.*;
public class LeastSavings{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nenter the count:");
        int n = sc.nextInt();
        sc.nextLine();
        String[] values = new String[n];
        String[] products = new String[n];
        int[] prices = new int[n];
        int index=0,minimum=0;
        for(int i=0;i<n;i++)
        {
            System.out.println("\nEnter item:");
            String s = sc.nextLine();
            values[i] = s;
        }
        for(int i=0;i<values.length;i++){
            String[] temp = values[i].split(" ");
            products[i] = temp[0];
            for(int j=1;j<temp.length;j++){
                int val= Integer.parseInt(temp[1]);
                int val2= Integer.parseInt(temp[2]);
                int finalVal = val*(val2)/100;
                prices[i] = finalVal;
            }
        }
        minimum = prices[0];
        for(int i=1;i<prices.length;i++){
            if(prices[i]<minimum){
                minimum = prices[i];
                index=i;
            }
        }
        System.out.println(products[index]);
    }
}