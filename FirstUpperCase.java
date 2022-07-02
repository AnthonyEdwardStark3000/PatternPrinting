import java.util.*;
public class FirstUpperCase{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter a string:");
        String input = sc.nextLine();
        String result = "";
        char[] ch = input.toCharArray();
        for(int i=0;i<input.length();i++){
           if(i==0 && ch[i]!=' '|| ch[i] !=' '&& ch[i]==' '){
            if(ch[i]>='a' && ch[i]<='z'){
                ch[i] = (char)(ch[i]-'a' + 'A');
            }
            else if(ch[i]>='A' && ch[i]<='Z'){
                ch[i] = (char)(ch[i]+'a' - 'A');
            }
                result = new String(ch);
           }
        }
        System.out.println(result);
    }
}