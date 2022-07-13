import java.util.*;
public class AdamantKid {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the string:");
        String input = sc.nextLine();
        System.out.print("\nEnter the values:");
        String value = sc.nextLine();
        String[] values = value.split(" ");
        int start = Integer.parseInt(values[0]);
        int end = Integer.parseInt(values[1]);
        int count = end/(input.length()/2);
        String repeatedChar="";
        for(int i=0;i<count;i++){
            repeatedChar+=input;
        }
        if(repeatedChar.charAt(start-1) ==repeatedChar.charAt(end-1)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
            // System.out.println(repeatedChar);
    }
}
