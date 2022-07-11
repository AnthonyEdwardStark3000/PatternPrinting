import java.util.*;
public class StringPassword {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter your password:");
        String input = sc.nextLine();
        int len = input.length();
        int flag=1;
        boolean isNumber=false,isSpecialCharacter=false,isUpperCase=false,isLowerCase=false;
        int count=0;

        for(int i=0;i<input.length();i++){
            // System.out.println("\n"+input.charAt(i));
            int val = (int) input.charAt(i);
            if(val>=48 && val<=57){
                ++count;
            }
            if(count>=2){
                isNumber = true;
            }

            if(val==35 ||val==33||val==95||val==36|| val==64){
                isSpecialCharacter = true;
            }

            if(val>=65 && val<=90){
                isUpperCase = true;
            }

            if(val>=97 && val<=122){
                isLowerCase = true;
            }

            if((len>=8 && len<=25) && isNumber && isSpecialCharacter && isUpperCase && isLowerCase){
                flag =0;
            }
           
        }
        if(flag==0){
            System.out.println("\nVALID");
        }
        else{
            // System.out.println("\nSpecial character:"+isSpecialCharacter+"\nisNumber:"+isNumber+"\nisUpperCase:"+isUpperCase+"\nisLowerCase:"+isLowerCase+"\nLength:"+len);
            System.out.println("\nINVALID");
        }
    }
}
