import java.util.*;
class CounterNumber {
    public static void printer(int num){
        System.out.print(num+"\t");
        if(num<=0)
        {
            return;
        }
        printer(num-5);
        System.out.print(num+"\t");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the count:");
        int count = sc.nextInt();
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for(int i=0;i<count;i++)
        {
            System.out.println("\nEnter the number :"+(i+1));
            int temp = sc.nextInt();
            sc.nextLine();
            numbers.add(temp);
        }
        for(int i=0;i<numbers.size();i++)
        {
            System.out.println();
            printer(numbers.get(i));
        }
    }
}
