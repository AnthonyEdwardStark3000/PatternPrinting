import java.util.*;
public class OrderByPrimeOddEven {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter a numbers string:");
        String input = sc.nextLine();
        String[] values = input.split(" ");
        int []intValues = new int[values.length];
        int []arranged = new int[values.length];
        int count=0;
        for(int i=0;i<values.length;i++){
            intValues[i] = Integer.parseInt(values[i]);
        }
        for(int i=0;i<values.length;i++){
            for(int j=2;j<intValues[i];j++){
                if(intValues[i] %j==0 ){
                    count++;
                }
            }
            if(count==1){
                arranged[i] = intValues[i];
            }
            else if(count==2){
                arranged[i] = intValues[i];
            }
            else{
                arranged[i] = intValues[i];
            }
            count=0;
        }

        for(int i=0;i<arranged.length;i++){
            System.out.print(arranged[i]+"\t");
        }
    }
}
