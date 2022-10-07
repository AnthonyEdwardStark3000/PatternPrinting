import java.util.*;
public class TripletsZeroSum{
    public static void main(String[] args){
        int[] question = {0,1,2,3,1};
        int len = question.length;
         int sum;
        int count =0;

        Arrays.sort(question);
        for(int i=0;i<len;i++){
            int p1 = i+1;
            int p2 = len-1;
            while(p1<p2){
                if(question[i]+question[p1]+question[p2] == 0){
                    System.out.println("0");
                    count =1;
                    return;
                }
                else if(question[i]+question[p1]+question[p2] >0){
                    p2--;
                }
                else{
                    p1++;
                }
            }
        }
            if(count==0){
                System.out.println("That triplet don't exist");
            }
    }
}