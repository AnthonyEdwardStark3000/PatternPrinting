import java.util.*;
public class BestMilegeCar {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the count:");
        int number = sc.nextInt();
        sc.nextLine();
        int k=1, count=1;
        float ans;
        float[] mileges = new float[number];
        for(int i=0;i<number;i++){
            System.out.print("\nEnter the milege and petrol:");
            String data = sc.nextLine();
            String[]values = data.split(" ");
            float km = Float.parseFloat(values[0]);
            float petrol = Float.parseFloat(values[1]);
            float milege = petrol/km;
            mileges[i] = milege;
        }
        for(int i=0;i<mileges.length;++i){
            ans=mileges[i];
            while(k<mileges.length){
            if(mileges[k]>ans){
                ans=mileges[k];
            }
            else if(k==mileges.length-1 && ans==mileges[i]){
                break;
            }
            else{
                count++;
                k++;
            }
        }
    }
        System.out.print(count);
    }
}   
