import java.util.*;
public class DiffValue{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numarray = new ArrayList<>();
        int n = 0;
        while(true){
            n=sc.nextInt();
            if(n==0){
                break;
            }
            else{
                numarray.add(n);
            }
        }
        for(int a:numarray){
            System.out.println(a);
        }
    }
}