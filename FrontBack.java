import java.util.*;
public class FrontBack{
    public static void main(String[] args){
        String value = "Hello";
        String ans = "";
        int difference = 0; 
        for(int i=0;i<value.length();i++){
           if(Character.isUpperCase(value.charAt(i))){
                int n = value.charAt(i);
                difference = n-65;
                int fans = 90 -difference;
                ans += Character.toString((char)fans);
           }
           else{
                int n = value.charAt(i);
                difference = n-97;
                int fans = 122-difference;
                ans += Character.toString((char)fans);
           }
        }
        System.out.println(ans);
    }
}