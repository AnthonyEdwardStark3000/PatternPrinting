import java.util.*;
public class PrintVowel{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the string:");
        String input = sc.nextLine();
        int count=0;
        for(int i=input.length()-1;i>=0;i--){
            char c = input.charAt(i);
            System.out.println(c);
            String op = "";
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
                System.out.print(op);
                // continue;
            }
            else{
                // count++;
                op += input.charAt(i);
                }
            // System.out.println("Count:"+count);
        }
        count=0;
    }
}