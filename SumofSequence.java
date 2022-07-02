import java.util.*;
public class SumofSequence {
    static void process(int n){
        int number = n;
        int total = n;
        if(number%2==0){
            while(number>=1){
                total += number/2;
                number = number/2;
                // System.out.println("Total becomes:"+number);
            }
        }
        else{
            while(number>=1){
                System.out.print("Total is :"+number+"+");
                total += (3* number)+1;
                number = total/2;
            }
        }
        System.out.println(total);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the number count:");
        int count = sc.nextInt();
        int[] numbers = new int[1000];
        for(int i=0;i<count;i++){
            System.out.println("\nEnter number : "+(i+1));
            int temp = sc.nextInt();
            numbers[i] = temp;
            process(numbers[i]);
        }
    }
}
