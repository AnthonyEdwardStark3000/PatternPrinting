import java.util.*;
public class CricketInnings{
    public static void main(String[] args){
        int count;
        String inning;
        String[] inningsSplit = new String[12452];
        float team1avg = 0,team2avg =0;
        Scanner sc = new Scanner(System.in);
        Hashtable<Integer,Integer> score = new Hashtable<Integer,Integer>();
        System.out.println("\nEnter the count of innings\t:");
        count = sc.nextInt(); 
        sc.nextLine(); 
        for(int i=1;i<count+1;i++){
            System.out.println("Enter the score of Innings :"+i);
            inning = sc.nextLine();
            // System.out.println("Value in the inning:"+inning);
            String[] innings = inning.split(" ");
            inningsSplit = innings;
            score.put(Integer.parseInt(innings[0]),Integer.parseInt(innings[1]));
        }
        for(Map.Entry<Integer, Integer> entry: score.entrySet()){
            team1avg += entry.getKey();
            team2avg += entry.getValue();
        }
        System.out.printf("%.2f\n",team1avg/count);
        System.out.printf("%.2f",team2avg/count);
    }
}