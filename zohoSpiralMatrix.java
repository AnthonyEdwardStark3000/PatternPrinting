import java.util.*;
class Spiral{
     List<Integer> spiralOrder(int[][] matrix)
        {
            List<Integer> result = new ArrayList<>();
            if(matrix.length == 0 || matrix[0].length == 0)
            {
                return result;
            }
            int rowStart = 0, rowEnd = matrix.length-1, colStart = 0, colEnd = matrix[0].length-1;
            
            while(rowStart <= rowEnd && colStart <=colEnd)
            {
                //Left to right printing
                for(int col=colStart;col<=colEnd;col++)
                {
                    result.add(matrix[rowStart][col]);
                    System.out.print(matrix[rowStart][col]+" ->");
                }
                rowStart ++;
                
                //rightTop to rightBottom
                for(int row=rowStart;row<=rowEnd;row++)
                {
                    result.add(matrix[row][colEnd]);
                    System.out.print(matrix[row][colEnd]+" ->");
                }
                colEnd--;
                
                //checking for a condition
                if(rowStart>rowEnd || colStart>colEnd)
                {
                    break;
                }
                // System.out.println();
                
                //Bottom right to Bottom left
                for(int col=colEnd;col>=colStart;col--)
                {
                    result.add(matrix[rowEnd][col]);
                    System.out.print(matrix[rowEnd][col]+" ->");
                }
                rowEnd --;
                //Bottom left to top left
                
                for(int row=rowEnd;row>rowStart;row--)
                {
                    result.add(matrix[row][colStart]);
                    System.out.print(matrix[row][colStart]+" ->");
                }
                // System.out.println();
                colEnd ++;
            }
            
            return result;
        }
}

public class zohoSpiralMatrix{
    public static void main(String[] args)
    {
        Spiral s = new Spiral();
        int[][] numbers = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("\n"+s.spiralOrder(numbers));
    }
}