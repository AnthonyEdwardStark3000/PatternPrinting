public class ZohoTwistedPrimeNumber {
    public static void main(String[] args)
    {
        int number = 40;
        System.out.print(decide(number));
    }
    static String decide(int n){
        boolean isPrime = false;
        int count =0, reverseNumber=0;
        String result="";

        for(int i=1;i<n/2;i++)
        {
            if(n%i==0){
                count++;
            }
        }
        if(count==1)
        {
            result ="Prime Number";
            isPrime = true;
        }
        else if(count>1){
            result ="Non Prime Number";
        }
        count =0;
        while(n>0)
        {
            int temp = n% 10;
            reverseNumber = reverseNumber*10+temp;
            n/=10;
        }
        for(int i=1;i<reverseNumber/2;i++)
        {
            if(reverseNumber%i==0){
                count++;
            }
        }
        if(count==1 && isPrime)
        {
            result = "Twisted Prime Number";
        }
        return result;
    }
}
