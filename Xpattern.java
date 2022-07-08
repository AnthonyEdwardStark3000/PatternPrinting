import java.util.*;
public class Xpattern {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter a number");
        int n = sc.nextInt();
        System.out.println();
        int middle = (n+1)/2;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==j){
                    if(i<middle){
                        System.out.print((n-i+1)+" ");
                    }
                    else{
                        System.out.print(i+" ");
                    }
                }
                else if(i+j== n+1){
                    if(i<middle){
                        System.out.print(i+" ");
                    }
                    else{
                        System.out.print(j+" ");
                    }
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    
}
