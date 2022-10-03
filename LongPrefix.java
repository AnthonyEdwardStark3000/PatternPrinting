import java.util.*;
public class LongPrefix{
    public static void main(String[] args){ 
        String[]words = {"welcome","well","west","wool"};
        System.out.print("The longest Prefix is :"+longPrefix(words));
    }
    public static String longPrefix(String[] str){
        int len = str.length;
        if(len == 0){
            return " ";
        }
        else if(len==1){
            return str[0];
        }
        Arrays.sort(str);
        int end = Math.min(str[0].length(), str[len-1].length());
        int i=0;
        while(i<end && str[0].charAt(i) == str[len-1].charAt(i)){
            i++;
        }
        String value = str[0].substring(0,i);
        return value;
    }
}