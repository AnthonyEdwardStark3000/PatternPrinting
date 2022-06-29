import java.util.*;
public class AverageSpeed{
    public static void main(String[] args){
        String details;
        float Overallvalue;
        float speed=0,time=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the car Details:");
        details = sc.nextLine();
        String[] cars = details.split(" ");
        for(int i=0;i<cars.length;i++){
            String[] speedAndTime = cars[i].split("@");
             speed += Float.parseFloat(speedAndTime[0]);
             time += Float.parseFloat(speedAndTime[1]);
            }
            Overallvalue = speed/time;  
            System.out.printf("The final average is %.2f kmph",Overallvalue); 
    }
}