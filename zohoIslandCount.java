class Solution{
    public int numberOfIslands(int[][]value){
        int count =0;
        for(int row=0;row<value.length;row++)
        {
            for(int col=0;col<value[row].length;col++)
            {
                if(value[row][col] == 1){
                    count+=1;
                    callBFS(value,row,col);
                }
            }
        }
        return count;
    }
    
    public void callBFS(int[][]val, int row,int col){
        if(row<0 || row>=val.length || col<0 || col>=val[row].length||val[row][col]== 0 ){
            return;
        }
        val[row][col] = 0;
        callBFS(val,row+1,col); //up
        callBFS(val,row-1,col); //down
        callBFS(val,row,col-1); //left
        callBFS(val,row,col+1); //right
    }
}
public class zohoIslandCount{
public static void main(String[] args)
{
    int[][] numbers = {{1,1,0,0,0}, {1,1,0,0,0}, {0,0,1,0,0}, {0,0,0,1,1}};
    Solution s = new Solution();
    System.out.println(s.numberOfIslands(numbers));
}
}
