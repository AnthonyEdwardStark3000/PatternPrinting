public class MinimumNumberLinearSeach {
    public static void main(String[] args)
    {
        int[] arr = {1,2,4,5,-2,-1,-10};
        System.out.println(search(arr));
    }
    static int search(int[] arr){
        int min =0;
        if(arr.length==0)
        {
            return -1;
        }
        min = arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }
}
