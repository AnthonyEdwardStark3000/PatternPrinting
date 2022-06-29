import java.util.*;
public class FirstRepeatingCharacterFromLast {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input;
        int count=0;
        System.out.println("\nENter the String:");
        input = sc.nextLine();
        for(int i=input.length()-1;i>=0;i--)
        {
           char c = input.charAt(i);
           for(int j=i-1;j>=0;j--)
           {
               if(c==input.charAt(j)){
                count++;
                if(count==1){
                    System.out.println(c);
                }   
               }
           }
        }
    }
}
