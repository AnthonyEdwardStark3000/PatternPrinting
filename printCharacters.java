import java.util.*;
public class printCharacters{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter tha string:");
        String input = sc.nextLine();
        String count="";
        int counter=0;
        for(int i=0;i<input.length();i++){
            int value = input.charAt(i);
            if(value >=48 && value<=57){
                count+= input.charAt(i);
            }
            else{
                counter = Integer.parseInt(count);
                for(int j=0;j<counter;j++){
                    System.out.print(input.charAt(i));
                }
                count="";
            }
        }
    }
}