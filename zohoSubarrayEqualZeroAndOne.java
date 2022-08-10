public abstract class zohoSubarrayEqualZeroAndOne {
    public static void main(String[] args)
    {
        int[] numbers = {1,0,1,1,1,0,0};
        int max=-1;
        int p1=-1;
        int p2=-1;
        for(int i=0;i<numbers.length;i++){
            for(int j=i;j<numbers.length;j++)
            {
                int c1=0,c2=0;
                if(max<j-i){
                for(int k=i;k<=j;k++)
                    {
                        //  System.out.print(numbers[k]+" ");
                        if(numbers[k]==1)
                        {
                            c1++;
                        }
                        else{
                            c2++;
                        }
                    }
                    if(c1==c2)
                    {
                        max = j-i;
                        p1 = i;
                        p2 = j;
                    }
                    //  System.out.println();
                    }
            }
        // System.out.print("check");
        }
        if(p1==-1 && p2==-2)
        {
            System.out.println("No sub Array Found");
        }
        else{
            System.out.println(p1+"  "+p2);
        }
    }
}

