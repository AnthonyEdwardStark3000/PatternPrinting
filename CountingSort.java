import java.util.*;
public class CountingSort{
    public static void main(String[] args){
        int[] count = new int[26];
        String s = "abdes";
        int len = s.length();
        for(int i=0;i<len;i++){
            int temp = s.charAt(i);
            temp -= 97;
            count[temp]++;
        }
        System.out.println(Arrays.toString(count));
        String answer ="";
        for(int i=0;i<len;i++){
            for(int j=0;j<count[i];j++){
                char temp = (char)(i + 97);
                answer += temp;
                answer+= ' ';
            }
        }
        System.out.println(answer);
    }
}