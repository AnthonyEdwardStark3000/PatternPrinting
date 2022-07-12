import java.util.*;
public class WrongKeyboard {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter a string:");
        String input = sc.nextLine();
        int count=0,value=1;
        for(int i=0;i<input.length();i++){
            char c = input.charAt(i);
            if(c=='T'|| c=='D'|| c=='L'||c=='F'){
                count++;
            }
        }
        for(int i=0;i<count;i++){
            value*=2;
        }
        System.out.println(value);
    }
}
