public class LinearSearchEvenNumberOfDigits {
    public static void main(String[] args)
    {
        int[] numbers = {12,345,2,6,7896,12,90,1234};
        System.out.println(search(numbers));
    }
    static int search(int[] num){
        int digit =0,count=0;
        for(int n:num)
        {
            while(n!=0)
            {
                n = n/10;
                digit++;
            }
            if(digit %2 ==0){
                count++;
            }
            digit =0;
        }
        return count;
    }
}
