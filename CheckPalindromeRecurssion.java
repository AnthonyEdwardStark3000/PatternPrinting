import java.util.*;
public class CheckPalindromeRecurssion{
    static void rec(String num){
        String initalNum = num;
        String revnum ="";
        int count = 0;
        for(int i=initalNum.length()-1;i>=0;i--){
            revnum+= initalNum.charAt(i);
        }
        for(int i=0;i<initalNum.length();i++){
                if(initalNum.charAt(i) == revnum.charAt(i)){
                    // System.out.println(initalNum.charAt(i)+"\t"+revnum.charAt(i));
                   ++count;
                }
                }
            // System.out.println("count is:"+count);
            if(count == initalNum.length()){
                System.out.println("\nThe number "+initalNum+" is palindrome");
            }
            else{
                System.out.println("\nThe number "+initalNum+" is not palindrome");
            }
            count=0;
        }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the count:");
        int count = sc.nextInt();
        sc.nextLine();
        String[] numbers = new String[100];
        for(int i=0;i<count;i++)
        {
            System.out.println("\nEnter number"+(i+1));
            numbers[i] = sc.nextLine();
            rec(numbers[i]);
        }
    }
}