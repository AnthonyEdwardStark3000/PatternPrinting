import java.util.*;
public class HashMap{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Map<String, String> names = new java.util.HashMap<String, String>();
        System.out.println("\nEnter the count:");
        int number = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<number;i++){
            String fn = sc.nextLine();
            String ln = sc.nextLine();
            names.put(fn,ln);
        }
        System.out.println("\nEnter the lname:");
        String lname = sc.nextLine();
        String answer = names.get(lname);
        System.out.println(answer);
    }
}