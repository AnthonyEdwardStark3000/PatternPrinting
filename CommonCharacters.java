import java.util.*;
public class CommonCharacters {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter first String:");
        String input = sc.nextLine();
        System.out.println("\nEnter second String:");
        String input2 = sc.nextLine();
        char[] ch1 = input.toCharArray();
        char[] ch2 = input2.toCharArray();
        Arrays.sort(ch1);
        String sorted1 = new String(ch1);
        Arrays.sort(ch2);
        String sorted2 = new String(ch2);
        System.out.println(sorted1+"\n"+sorted2);
    }
}
