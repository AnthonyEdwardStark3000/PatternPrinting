import java.util.*;
public class PalindromeMissingLetter {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input;
        System.out.println("\nENter a string:");
        input = sc.nextLine();
        char[] ch = input.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            int check = ch.length-1;
                if(ch[i]<=ch[check]){
                System.out.println(ch[i]);
                System.out.println("INdex:"+i+"\nchecker:"+check);
                }
            else{
                check--;
            }  
        }       
        }
}
