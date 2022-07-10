import java.util.*;
public class MergeElements{
    public static void main(String[] args)
    {
        int[] a1= {2,4,5,6,7,9,10,13};
        int[] a2= {2,3,4,5,6,7,8,9,11,15};
        Set<Integer> finalanswer = new HashSet<Integer>();
        for(int a:a1){
            finalanswer.add(a);
        }
        for(int a:a2){
            finalanswer.add(a);
        }
        for(int a:finalanswer){
            System.out.print(a+" ");
        }
    }
}
