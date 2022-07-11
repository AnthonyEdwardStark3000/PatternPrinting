import java.util.*;
public class DistinctElementCount{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter a number of row and col:");
        String length = sc.nextLine();
        System.out.println("\nEnter a number row1:");
        String arr1 = sc.nextLine();
        String[] array1 = arr1.split(" ");
        Set<String>set1 = new HashSet<>();
        Set<String>set2 = new HashSet<>();
        System.out.println("\nEnter a number row2:");
        String arr2 = sc.nextLine();
        String[] array2 = arr2.split(" ");
        for(int i=0;i<array1.length;i++){
            set1.add(array1[i]);
        }
        for(int i=0;i<array2.length;i++){
            set2.add(array2[i]);
        }
        ArrayList<Integer>arraylist = new ArrayList<>();
        
        for(int i=0;i<array1.length;i++)
        {
            for(int j=0;j<array2.length;j++)
            {
                if(array1[i].equals(array2[j])){
                    System.out.println("\nCommon characters:"+array1[i]);
                }
            }
        }
        
    }
}