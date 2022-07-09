import java.util.*;
public class AfollowsB {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int count=0;
        System.out.println("\nEnter a string:");
        String input = sc.nextLine();
        System.out.println("\nEnter character 1:");
        char[] c1 = sc.next().toCharArray();
        System.out.println("\nEnter character 2:");
        char[] c2 = sc.next().toCharArray();
        for(int i=0;i<input.length()-1;i++){
            if(input.charAt(i)==c1[0] && input.charAt(i+1)==c2[0])
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
