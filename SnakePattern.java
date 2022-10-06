import java.util.*;
public class SnakePattern{
    public static void main(String[] args){
        Vector<Integer> vector = new Vector<>();
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int len = matrix[0].length;
        for(int i=0;i<len;i++){
            if(i%2==0){
                for(int j=0;j<len;j++){
                    vector.add(matrix[i][j]);
                }
            }
            else{
                for(int j=len-1;j>=0;j--){
                    vector.add(matrix[i][j]);
                }
            }
        }
        System.out.println(vector);
    }
}