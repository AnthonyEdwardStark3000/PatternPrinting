import java.util.*;
public class StringReverseRecurssion{
    public static void printRev(String s, int number){
        String data = s;
        int place = number;
        String[] datas = data.split(" ");
        for(int i=datas.length-1;i>=0;i--){
            System.out.print(datas[i]+" ");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter a string:");
        String input = sc.nextLine();
        int length = input.length();
        printRev(input,length);
    }
}