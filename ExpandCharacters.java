import java.util.*;
public class ExpandCharacters{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int count = 0;
        System.out.println("\nEnter the string:");
        String input = sc.nextLine();
        for(int i=0;i<input.length();i++)
        {
            if(i%2==0)
            {
                String temp = Character.toString(input.charAt(i));
                count = Integer.parseInt(temp);
            }
            else{
                for(int x=0;x<count;x++)
                {
                    System.out.println(input.charAt(i));
                }
            }
        }

    }
}