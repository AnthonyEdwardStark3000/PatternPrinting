import java.util.*;
public class FindCapital {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the number of country:");
        int number =sc.nextInt();
        sc.nextLine();
        String[] country = new String[number]; 
        String[] capital = new String[number]; 
        String ans="";
        for(int i=0;i<number;i++){
            System.out.print("\nEnter the data:"+(i+1));
            String temp = sc.nextLine();
            String[] temporary = temp.split(" ");
            country[i] = temporary[0];
            capital[i] = temporary[1];
        }
        System.out.println("\nEnter a country name:");
        String name = sc.nextLine();
        for(int i=0;i<number;i++){
            if(country[i].equals(name)){

                ans=capital[i];
                break;
            }
            else if(i==number-1){
                ans="none";
            }
        }
        System.out.println("Answer is:"+ans);
    }
}
