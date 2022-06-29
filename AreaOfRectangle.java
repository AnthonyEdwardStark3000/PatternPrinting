import java.util.*;
public class AreaOfRectangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the participants:");
        String input = sc.nextLine();
        System.out.println("\nEnter the length:");
        String length = sc.nextLine();
        String[] values = input.split(" "); //Alen , tim
        String[] lengths = length.split(" "); //Alen length, tim length
        int Alen = Integer.parseInt(values[0]);
        int tim = Integer.parseInt(values[1]);
        
        int AlenLength = Integer.parseInt(lengths[0]);
        int timLength = Integer.parseInt(lengths[1]);
        
        int AlenDiff = Alen/5;
        int Alenfinal = AlenDiff/AlenLength;
        int timDiff = tim/5;
        int timfinal = timDiff/timLength;
        float total = timfinal - Alenfinal;
        System.out.printf("%.2f",Math.abs(total));
    }
}
