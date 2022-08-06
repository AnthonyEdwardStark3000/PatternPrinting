import java.util.*;
public class ZohoMerge{
    public static void main(String[] args)
    {
        int[] arr1 = {2,4,5,6,7,9,10,13};
        int[] arr2 = { 2,3,4,5,6,7,8,9,11,15};
        int last =0;
        int len = arr1.length+arr2.length;
            Set<Integer> finalArr = new HashSet<Integer>();
        for(int i=0;i<arr1.length;i++){
            finalArr.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){
            finalArr.add(arr2[i]);
        }
        Iterator iterator = finalArr.iterator();
        
        for(int i=0;i<finalArr.size()-1;i++)
        {
            System.out.print(iterator.next()+",");
        }
        while(iterator.hasNext())
        {
            last = (int) iterator.next();
        }
        System.out.print(last);
    }
}public class ZohoMerge {
    
}
