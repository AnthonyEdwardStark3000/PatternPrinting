import java.util.*;
public class StringAlternateLetters{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter a string:");
        String input = sc.nextLine();
        String[] values = input.split(" ");
        String finalans ="";
        for(int i=0;i<values.length;i++){
            for(int j=0;j<values[i].length();j++){
                if(j%2==0){
                    finalans+=Character.toString(values[i].charAt(j)).toUpperCase();
                }
                else{
                    finalans+=Character.toString(values[i].charAt(j)).toLowerCase();
                }
            }
            finalans+= " ";
        }
        System.out.println(finalans);
    }
}