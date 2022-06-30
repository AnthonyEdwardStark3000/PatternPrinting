import java.util.*;
public class FirstUpperCase{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String input;
        System.out.println("Enter the string:");
        input = sc.nextLine();
        String[] words = input.split("\\s");
        String capital ="";
        for(String w:words){
            String first = w.substring(0,1);
            String afterFirst = w.substring(1);
            capital +=first.toUpperCase()+afterFirst+" ";
        }
        System.out.print(capital);
    }
}