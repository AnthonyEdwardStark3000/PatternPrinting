import java.util.*;
public class TopScoringBatsman {
    public static void main(String[] args){
        int count;
        String details;
        String [] batsman = new String[10000];
        Hashtable<String,Integer>playerAndScore = new Hashtable<String,Integer>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total count:");
        count=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<count;i++){
            System.out.println("\nEnter the batsman details:");
            details=sc.nextLine();
            String[] enteredDetails = details.split(",");
            batsman = enteredDetails;
            playerAndScore.put(batsman[0],Integer.parseInt(batsman[1]));
        }
        int maxvalue = (Collections.max(playerAndScore.values()));
        for(Map.Entry<String,Integer> entry:playerAndScore.entrySet()){
            if(entry.getValue()==maxvalue){
                System.out.println(entry.getKey());
            }
        }
        }
}
