import java.util.*;
public class ReverseTill{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the string:");
        String input = sc.nextLine();
        String[] values = input.split("_");
        String reversedString="";

        for(int i=values[0].length()-1;i>=0;i--)
        {   
            reversedString+= input.charAt(i);
        }

        if(values.length<2){
            System.out.println(reversedString);
        }
        else
        {
            System.out.println(reversedString);
            System.out.print("_"+values[1]);
        }
    }
}