import java.util.*;
public class PalindromeMissingLetter {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input;
        System.out.println("\nENter a string:");
        input = sc.nextLine();
        String backup = input;
        String string1 = input.substring(0,(input.length()/2)+1);
        String string2 = input.substring((input.length()/2));
        String newString2="";
        System.out.println(string1+"\t"+string2);
        for(int i=string2.length()-1;i>=0;i--)
        {
            newString2+=string2.charAt(i);
        }
        for(int i=string1.length()-1;i>=0;i--)
        {
            for(int j=0;j<string2.length();j++)
            {
                if(string1.charAt(i)==newString2.charAt(j)){
                    System.out.println(string1.charAt(i));
                }
            }
        }
        }
}
