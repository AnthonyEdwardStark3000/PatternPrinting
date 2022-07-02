import java.util.*;
public class MissingPalindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input;
        System.out.println("\nENter a string:");
        input = sc.nextLine();
        char[] ch = input.toCharArray();
        for(int i=0;i<ch.length/2;i++)
        {
            for(int j=ch.length-1;j>=i;j--)
            {
                if(ch[i]!=ch[j]){
                    if(ch[i]==ch[j-1]&&(i!=j-1))
                    {
                        System.out.println(ch[j]);
                        break;
                    }
                    else{
                        System.out.println(ch[i]);
                        break;
                    }
                }
                    
        }
}
}
}