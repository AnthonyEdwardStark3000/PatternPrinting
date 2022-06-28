import java.util.*;
public class LateComers {
    public static void main(String[] args){
        String time;
        int count = 0;
        String[] splitTime;
        // String[] finalCheck;
        Hashtable<Integer,ArrayList<Integer>> LateCheck = new Hashtable<Integer,ArrayList<Integer>>();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        System.out.println("\nENter the time:");
        time = sc.nextLine();
        splitTime = time.split(" ");
        for(int i=0;i<splitTime.length;i++)
        {
           String[] finalCheck = splitTime[i].split(":");
            arr.add(Integer.parseInt(finalCheck[1]));
           LateCheck.put(Integer.parseInt(finalCheck[0]), arr);
        }
        for(Map.Entry<Integer,ArrayList<Integer>> entry: LateCheck.entrySet()){
            if(entry.getKey()>10){
                count++;
            }
            else if(entry.getKey()>=10){
                for(Integer i : entry.getValue()){
                    if (i > 0) {
                        System.out.println(entry.getKey() +": "+ i);
                        count++;
                    }
                    
                }
                
            }
        }
        System.out.println("\nThe total Number of late comers is :"+count);
    }
}