public class LinearSearchNumberOfDigits {
    public static void main(String[] args)
    {
        int number = -12344;
        System.out.print(count(number));
    }
    static int count(int n)
    {
        int count=0;
        if(n<0){
            n*=-1;
        }
        if(n==0){
            return 1;
        }
        else {
            count = (int)Math.log10(n)+1;
        }
        return count;
    }
}
