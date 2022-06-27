import java.util.*;
public class LowestMilegeCar {
    public static void main(String[] args){
        String completeDetails;
        String []carsDetailsString = new String[12000];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the details:");
        completeDetails=sc.nextLine();
        Hashtable<String,Float> milegeChecker = new Hashtable<String,Float>();
        for(int i=0;i<completeDetails.length();i++){
            String [] carsDetails = completeDetails.split(" ");
            carsDetailsString = carsDetails;
        }
        for(int i=0;i<carsDetailsString.length;i++){
            String[] car = carsDetailsString[i].split("\\@");
            milegeChecker.put(car[0],Float.parseFloat(car[1]));
        }
        Float minValueInMap = (Collections.min(milegeChecker.values()));
        for(Map.Entry<String, Float> entry: milegeChecker.entrySet()){
            if(entry.getValue() == minValueInMap){
                System.out.println(entry.getKey());
            }
        }
    }
}
