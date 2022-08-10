import java.util.*;
public class ZohoSubarrayVowels{
    public static boolean isVowel(char ch)
    {
        if(ch=='A'||ch=='a'||ch=='E'||ch=='e'||ch=='I'||ch=='i'||ch=='O'||ch=='o'||ch=='U'||ch=='u')
        return true;
        else return false;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String input = "Alphabet";
        int[] arr = new int[input.length()];    
        int l=0;
        for(int i=0;i<input.length();i++)
        {
            if(isVowel(input.charAt(i))){
                arr[l++] =i;
                // System.out.println(arr[l-1]+" ");
            }
        }
        int max =-1;
        int start =-1;
        int end =-1;
        for(int i=1;i<l;i++){
            int t = arr[i] - arr[i-1] -1;
            if(max<t)
            {
                max = t;
                start = arr[i-1];
                end = arr[i];
            }
        }
        System.out.print(input.substring(start+1,end));
    }
}
