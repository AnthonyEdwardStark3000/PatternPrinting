public class LinearSearchSearchInrange {
    public static void main(String[] args)
    {
        int[] array = {1,2,3,4,5,6,7};
        int start = 1;
        int end = 4;
        int target = 3;
        System.out.print("The presence of number "+target+" is "+search(array,start,end,target));
    }
        static boolean search(int arr[],int s,int e,int t)
    {
        if(arr.length==0)
        {
            return false;
        }
        for(int i=s;i<=e;i++)
        {
            if(arr[i]==t)
            {
                return true;
            }
        }
        return false;
    }
}
