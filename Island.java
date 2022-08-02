public class Island {
    public static void main(String[] args)
    {
        int[][] question = { 
            {1,-1,-1,1},
            {-1,1,-1,1},
            {-1,-1,1,-1},
            {-1,-1,-1,1}
        };
        System.out.println(count(question));
    }
    static int count(int[][] island)
    {
        int total = 0;
        for(int row=0;row<island.length;row++)
        {
            for(int col=0;col<island[row].length;col++)
            {
                if(row!=0 && col!=0 && row!=island[row].length && col!=island[row].length-1 && row>=col &&island[row][col]==1)
                {
                    total ++;
                }
            }
        }
        return total;
    }
}
