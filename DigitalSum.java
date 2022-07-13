import java.util.*;
public class DigitalSum {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nENter a number:");
        int number = sc.nextInt();
        int finalAns =0,answer=0,secondFinal=0;
        if(number==0){
            System.out.println("0");
        }
        else{
            while(number>0){
                answer+= number%10;
                number=number/10;
            }
        }
        while(answer>0){
            finalAns+=answer%10;
            answer = answer/10;
        }
        while(finalAns>0){
            secondFinal+=finalAns%10;
            finalAns = finalAns/10;
        }
        System.out.print(secondFinal);
    }
}
