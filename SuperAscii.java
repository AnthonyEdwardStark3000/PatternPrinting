import java.util.*;
public class SuperAscii{
    public static void main(String[] args){
        String s = "bba";
        if(check(s)){
            System.out.println("The string "+s+" is Super ASCII");
        }
        else{
            System.out.println("The string "+s+" is not Super ASCII");
        }
    }
    public static boolean check(String s){
        int[] characters = new int[26];
        int n = s.length();
        int index;
        for(int i=0;i<n;i++){
            int temp = s.charAt(i);
            index = temp-97;
            characters[index]++;
        }
        for(int i=0;i<n;i++){
            int temp = s.charAt(i);
            index = temp-97;
            if(characters[index]!=(index+1)){
                System.out.println("characters :"+characters[index]+"index : "+(index+1));
                return false;
            }
        }
        return true;
    }
}