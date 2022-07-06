import java.util.*;
public class ReverseTill{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter a string :");
        String input = sc.nextLine();
        int index = input.indexOf("_");
        if(index==-1){
            System.out.println(new StringBuffer(input).reverse().toString());
        }
        else if(index==0){
           System.out.println(input);
        }
        else {
            if(index==input.length()-1){
                String[] s2 = input.split("_");
                System.out.print(new StringBuilder(s2[0]).reverse().toString()+"_");
            }
            else{
                String[] s2 = input.split("_");
                System.out.print(new StringBuilder(s2[0]).reverse().toString()+"_"+s2[1]);
            }
        }
    }
}