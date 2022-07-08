import java.util.*;
public class FrequencyOfNumbers {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the number count:");
        int count = sc.nextInt();
        int[] numbers = new int[count];
        for(int i=0;i<count;i++){
            System.out.print("Enter number "+(i+1)+" :");
            numbers[i] = sc.nextInt();
        }
        int[] freq = new int[count];
        int visited =-1;
        for(int row=0;row<count;row++){
            int counter = 1;
            for(int col=row+1;col<count;col++){
                if(numbers[row]==numbers[col]){
                    counter++;
                    freq[col] = visited;
                }
            }
            if(freq[row]!=visited){
                freq[row] = counter;
            }
        }
        for(int i=0;i<count;i++){
            if(freq[i]!=visited && i==0){
                System.out.print(numbers[i]+"("+freq[i]+")");
                continue; 
            }
            if(freq[i]!=visited){
                System.out.print(","+numbers[i]+"("+freq[i]+")");
            }
        }
    }
}
