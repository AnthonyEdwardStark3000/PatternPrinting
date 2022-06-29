import java.util.*;
public class RepeatingCharacter{
    public static void main(String[] args){
        String input;
        int count = 0;
        char RepeatingCharacter;
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the String:");
        input = sc.nextLine();
        for(int i=0;i<input.length();i++)
        {
            char c = input.charAt(i);
            for(int j=i+1;j<input.length();j++){
                if(c==input.charAt(j)){
                    count++;
                    if(count==1){
                        RepeatingCharacter = c;
                        System.out.println("\nThe repeated character is :"+RepeatingCharacter);
                    }
                }
            }
        }
        }
    }
