import java.util.*;
public class TopScoringStudent {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int count;
        int total =0;
        String student;
        Hashtable<String,Integer> studentTotal = new Hashtable<String,Integer>();
        System.out.println("\nEnter the number of Students :");
        count=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<count;i++){
            System.out.println("\nEnter the student details");
            student = sc.nextLine();
            String[] tempData = student.split(":");
            int totalMark = Integer.parseInt(tempData[1])+Integer.parseInt(
                tempData[2])+Integer.parseInt(tempData[3]);
            studentTotal.put(tempData[0],totalMark);
        }
        int maxMarkStudent = (Collections.max(studentTotal.values()));
        for(Map.Entry<String,Integer>entry:studentTotal.entrySet()){
            if(entry.getValue()==maxMarkStudent){
                System.out.println(entry.getKey());
            }
        }
    }
}
