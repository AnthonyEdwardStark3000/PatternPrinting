import java.util.*;
public class SortingOddEvenIndex {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter a count:");
        int count = sc.nextInt();
        int[] numbers = new int[count+1];
        int[] odd = new int[count+1]; int[]even = new int[count+1];
        int e=0,o=0,i,j;
        for(i=1;i<=count;i++)
        {
            System.out.println("\nEnter a number:");
            numbers[i] = sc.nextInt();
            sc.nextLine();
        }
        for(i=1;i<=count;i++){
            if(i%2==0){
                even[e++] = numbers[i]; 
            }
            else{
                odd[o++] = numbers[i];
            }
        }
        for(i=0;i<e;i++){
            for(j=i+1;j<e;j++){
                if(even[i]<even[j]){
                    int temp = even[i];
                    even[i] = even[j];
                    even[j] = temp;
                }
            }
        }

        for(i=0;i<o;i++){
            for(j=i+1;j<o;j++){
                if(odd[i]>odd[j]){
                    int temp = odd[i];
                    odd[i] = odd[j];
                    odd[j] = temp;
                }
            }
        }

        for(i=0,j=0;i<e && j<o;i++,j++){
            System.out.print(odd[j]+" ");
            System.out.print(even[i]+" ");
        }

        while(i<e){
            System.out.print(even[i]);
            i++;
        }

        while(i<o){
            System.out.print(odd[i]);
            i++;
        }
    }
}
