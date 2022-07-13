import java.util.*;
public class AMorPM {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the time:");
        String input=sc.nextLine();
        String[] values = input.split(":");
        int hr = Integer.parseInt(values[0]);
        int min = Integer.parseInt(values[1]);
        if(hr>=24 && min>0){
            System.out.print("\nINVALIDINPUT");
        }
        else if(hr>=12){
            System.out.print("\nPM");
        }
        else if(hr<12){
            System.out.print("\nAM");
        }
    }
}
