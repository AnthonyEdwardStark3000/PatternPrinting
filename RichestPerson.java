import java.util.Arrays;

class RichestPerson{
    public static void main(String[] args)
    {
        int[][] numbers = {{1,2,3},{1,2,3}};
        System.out.print(total(numbers));
    }
    static int total(int[][] n)
    {
        if(n.length==0)
        {
            return -1;
        }
        int []t  = new int[n.length];
        int sum =0, maximumValue=0; 
        for(int row=0;row<n.length;row++)
        {
            for(int col=0;col<n[row].length;col++)
            {
                sum+= n[row][col];
            }
            t[row]=sum;
            sum=0;
        }
        for(int i=0;i<t.length;i++)
        {
            if(t[i]>maximumValue)
            {
                maximumValue = t[i];
            }
        }
        return maximumValue;
    }
}