import java.util.*;
public class DayCalculator{
    public static void main(String[] args)
    {
        String[] days ={"MON","TUE","WED","THUR","FRI","SAT","SUN"};
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter today:");
        String today = sc.nextLine();
        System.out.println("\nEnter count:");
        int count = sc.nextInt();
        int foundIndex=0,totalIndex=0;
        for(int i=0;i<7;i++){
            if(days[i].equalsIgnoreCase(today)){
                foundIndex =i;
            }
        }
        int val = foundIndex+count;
        System.out.print("Value:"+val);
        val =val%7;
        System.out.print("Value %7:"+val);
        switch(val){
            case 0:
                System.out.println("SUN");
                break;
            case 1:
                System.out.println("MON");
                break;
            case 2:
                System.out.println("TUE");
                break;
            case 3:
                System.out.println("WED");
                break;
            case 4:
                System.out.println("THUR");
                break;
            case 5:
                System.out.println("FRI");
                break;
            case 6:
                System.out.println("SAT");
                break;
            case 7:
                System.out.println("SUN");
                break;
        }
    }
}