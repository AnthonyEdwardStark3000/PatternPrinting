import java.util.*;
public class PrintArticles {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the string:");
        String input = sc.nextLine();
        int counter =0;
        input = input.replaceAll("[^a-zA-Z0-9]", " ");  
        String[] values = input.split(" ");
        for(int i=0;i<values.length;i++){
            System.out.println(values[i]);
            if(values[i].equalsIgnoreCase("a")||values[i].equalsIgnoreCase("an")||values[i].equalsIgnoreCase("the")){
                counter++;
            }
        }
        System.out.println(counter);
    }
}

