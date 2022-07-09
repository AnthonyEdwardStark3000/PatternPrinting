import java.util.*;
public class SortingbySum {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the count:");
        int count = sc.nextInt();
        int []numbers = new int[count];int[]addition = new int[count];
        int rem,total=0;
        for(int i=0;i<count;i++){
            System.out.println("\nEnter the number:");
            numbers[i] = sc.nextInt();
        }
        for(int i=0;i<count;i++){
            int n=numbers[i];
            while(n>0){
                rem = n%10;
                total+=rem;
                n=n/10;
            }
            addition[i] = total;
            total=0;
        }
        for(int i=0;i<count;i++){
            for(int j=i+1;j<count;j++){
                if(addition[i]==addition[j]){
                    int t= addition[i]; int temp = numbers[i];
                    addition[i] = addition[j]; numbers[i] = numbers[j];
                    addition[j] = t; numbers[j] = temp;
                }
                else if(addition[i] > addition[j]){
                   
                    int t= addition[i]; int temp = numbers[i];
                    addition[i] = addition[j]; numbers[i] = numbers[j];
                    addition[j] = t; numbers[j] = temp; 
                }
            }
            System.out.print(numbers[i]+" ");
        }
    }
}
