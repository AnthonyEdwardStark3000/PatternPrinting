import java.util.*;
public class LateComersProgram {
    public static void main(String[] args){
        int count,lateComers=0;
        String time;
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the count of the entries:");
        count=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<count;i++){
            time=sc.nextLine();
            String[] hhmm = time.split(":");
            int hour = Integer.parseInt(hhmm[0]);
            System.out.println("hour value:"+hour);
            int min = Integer.parseInt(hhmm[1]);
            System.out.println("minute value:"+min);
            if(hour>10 | hour>=10 & min>0){
                System.out.println("count increment"+count);
                lateComers++;
            }
        }
        System.out.println("The total number of late comers :"+lateComers);
    }
}
