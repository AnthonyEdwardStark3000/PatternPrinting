import java.util.*;
public class ReverseString{
    public static void main(String[] args){
        String originalString = "I.Love.Programming.very.Much!..";
        System.out.println("The answer is :"+reversed(originalString));
    }
    public static String reversed(String s){
        String emptyString = "";
        Stack <String> words = new Stack<>();

        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '.'){
                words.push(emptyString);
                words.push(".");
                emptyString = "";
            }
            else{
                emptyString+= s.charAt(i);
            }
        }
        words.push(emptyString);
        
        String answer = "";
        answer += words.peek();
        words.pop();

        while(!words.empty()){
            answer+= words.peek();
            words.pop();
        }

        return answer;
    }
}