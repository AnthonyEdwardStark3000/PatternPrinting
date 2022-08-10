//Print Next greatest Number in array
public class zohoNextGreatNumberInArray{
    public static void main(String[] args)
    {
        int[] numbers = {2,4,8,97,85,57};
        int position =0 ;
        for(int i=0;i<numbers.length;i++)
        {
            int temp = 0;
            int value = numbers[position];
            int minimumValue = Integer.MAX_VALUE;
            for(int j =position+1;j<numbers.length;j++)
            {
                if(numbers[j]< minimumValue && numbers[j] >value){
                    minimumValue = numbers[j];
                    position = j;
                    temp =1;
                }
            }
            if(temp ==1)
            {
                System.out.print(minimumValue+" ");
            }
            else
            {
                System.out.print("-1"+" ");
            }
        }
    }
}
