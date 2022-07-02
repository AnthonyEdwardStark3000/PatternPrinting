import java.util.*;
class HelloWorld {
    public static int operation(String[] num, String operation){
         int[] nums = new int[2];
         nums[0] = Integer.parseInt(num[0]);
         nums[1] = Integer.parseInt(num[1]);
         if(operation == "+"){
            return nums[0] + nums[1];
         }
         if(operation == "-"){
            return nums[0] - nums[1];
         }
         if(operation == "*"){
            return nums[0] * nums[1];
         }
        if(operation == "/"){
            return nums[0] / nums[1];
        }
        return 0;
            
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter a string:");
        String st = sc.nextLine().toUpperCase();
        String addnums[] = st.split("A");
        String divnums[] = st.split("D");
        String subnums[] = st.split("S");
        String mulnums[] = st.split("M");

        if(addnums.length > 1){
            System.out.println(operation(addnums, "+"));
        }
        else if(subnums.length > 1){
            System.out.println(operation(subnums, "-")); 
        }
        else if(mulnums.length > 1){
            System.out.println(operation(mulnums, "*"));
        }
        else if(divnums.length > 1){
            System.out.println(operation(divnums, "/"));
        }
       
        
    }
}