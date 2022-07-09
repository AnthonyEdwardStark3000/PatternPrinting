import java.util.*;
public class PatternPrintingLookAndSay {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter count:");
        int count = sc.nextInt();
        System.out.println("1");
        String previousValue ="1";
        int i=1;
        while(i<count){
            String new_PreviousValue = "";
            int printedNumber = 1;
            char c = previousValue.charAt(0);
            //comparing with second character
            for(int j=1;j<previousValue.length();j++){
                if(previousValue.charAt(j)!=previousValue.charAt(j-1)){
                    System.out.print(printedNumber+""+c);
                    new_PreviousValue+= ""+count+""+c;
                    c = previousValue.charAt(j);
                    printedNumber = 1;
                }
                else{
                    count++;
                }

            }
            System.out.print(printedNumber+""+c);
            new_PreviousValue+= ""+count+""+c;
            previousValue = new_PreviousValue;
        }
    }
}
