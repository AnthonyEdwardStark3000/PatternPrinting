import java.util.*;
public class PrintMiddle3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter a String:");
        String input = sc.nextLine();
        int position = input.length()/2;
        System.out.println(input.charAt(position-1)+""+input.charAt(position)+""+input.charAt(position+1));
    }    
}
