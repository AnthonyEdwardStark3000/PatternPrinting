import java.util.*;
public class RearrangeDesc{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.nextLine();
        char[] characters = input.toCharArray();
        Arrays.sort(characters);
        String sorted = new String(characters);
        String op="";
        for(int i=sorted.length()-1;i>=0;i--)
        {
            op+= sorted.charAt(i);
        }
        for(int i=0;i<op.length();i++)
        {
            int flag=0;
            for(int j=0;j<i;j++)
            {
                 if(op.charAt(i) == op.charAt(j) && i!=j)
                 {
                    flag=1;
                    break;
                 }
            }
            if(flag==0){
                System.out.print(op.charAt(i));
            }
        }
    }
}