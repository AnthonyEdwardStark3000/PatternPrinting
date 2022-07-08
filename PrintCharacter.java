import java.util.*;
public class PrintCharacter{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter a string :");
        String input = sc.next();
        String numbers="";
        char letter=' ';
        for(char c: input.toCharArray()){
            if(!(c>='0'&&c<='9')){
                if(numbers!=" "){
                    int n = Integer.parseInt(numbers);
                    for(int i=0;i<n;i++){
                        System.out.print(letter);
                    }
                }
                letter=c;
                numbers="";
            }
            else{
                numbers+=c;
            }
        }
        int n = Integer.parseInt(numbers);
                    for(int i=0;i<n;i++){
                        System.out.print(letter);
                    }
    }
}