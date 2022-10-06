import java.util.*;
public class SumLowerUpperTri{
    public static void main(String[] args){
        Vector<Integer> answer = new Vector<>();
        int[][] matrix={{6,5,4},{1,2,5},{7,9,7}};
        int i_length = matrix[0].length;
        int upperSum =0, lowerSum =0;
        for(int i=0;i<i_length;i++){
            for(int j=0;j<i_length;j++){
                if(i==j){
                    upperSum += matrix[i][j];
                    lowerSum += matrix[i][j];
                }
                else if(i<j){
                    upperSum += matrix[i][j];
                }
                else{
                    lowerSum += matrix[i][j];
                }
            }
        }   
        answer.add(upperSum);
        answer.add(lowerSum);
        System.out.println(answer.toString());
    }
}