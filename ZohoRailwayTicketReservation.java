import java.util.*;
import java.util.HashMap;
class Passenger{
    static int id =1;
    String name;
    String gender;
    String berthpreference;
    int age ;
    int passengerID = id++;
    String alloted;
    int number;
    public Passenger(String name, int age, String gender, String bp){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.berthpreference = bp;
        alloted = " ";
        number = -1;
    };
}

class TicketBooking{
    static int AvailableLowerBerth = 21;
    static int AvailableMiddleBerth = 21;
    static int AvailableUpperBerth = 21;
    static int AvailableRAC = 9;
    static int AvailableWaitingList = 10;

    static List<Integer>LowerBerthPosition = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21));
    static List<Integer>MiddleBerthPosition = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21));
    static List<Integer>UpperBerthPosition = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21));
    static List<Integer>RACPosition = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9));
    static List<Integer>WaitingListPosition = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

    static Queue<Integer>WaitingList = new LinkedList<Integer>();
    static Queue<Integer>RacList = new LinkedList<Integer>();
    static List<Integer> BookedTicketList= new ArrayList<Integer>();
    static Map<Integer, Passenger> PassengersData = new HashMap<Integer, Passenger>();

    public void bookTicket(Passenger p, int SeatNumber, String allotedBerth){
        p.number = SeatNumber;
        p.alloted = allotedBerth;
        PassengersData.put(p.passengerID, p);
        BookedTicketList.add(p.passengerID);
        System.out.print("Passenger ID:"+p.passengerID+"\nPassenger Name :"+p.name+"\nPassenger Age :"+p.age+"\nGender :"+p.gender+"\nPassenger Seat :"+p.number+p.alloted);
        System.out.println("---Ticket Booked Successfully---");
    }
}


public class ZohoRailwayTicketReservation {

    public static void bookTicket(Passenger p){

        TicketBooking tb = new TicketBooking();

        if(p.berthpreference.equalsIgnoreCase("L") && TicketBooking.AvailableLowerBerth>0 || p.berthpreference.equalsIgnoreCase("M") && TicketBooking.AvailableMiddleBerth>0 || p.berthpreference.equalsIgnoreCase("U") && TicketBooking.AvailableUpperBerth>0){

            if(p.berthpreference.equalsIgnoreCase("L") && TicketBooking.AvailableLowerBerth>0 ){
                tb.bookTicket(p, (TicketBooking.LowerBerthPosition.get(0)),"L");
                tb.LowerBerthPosition.remove(0);
                tb.AvailableLowerBerth--;
                System.out.println("Lower Berth is Given");
            }
            else if(p.berthpreference.equalsIgnoreCase("M")  && TicketBooking.AvailableMiddleBerth>0){
                tb.bookTicket(p, (TicketBooking.MiddleBerthPosition.get(0)),"M");
                tb.MiddleBerthPosition.remove(0);
                tb.AvailableMiddleBerth--;
                System.out.println("Middle Berth is Given");
            }
            else if(p.berthpreference.equalsIgnoreCase("U") && TicketBooking.AvailableUpperBerth>0){
                tb.bookTicket(p, (TicketBooking.UpperBerthPosition.get(0)),"U");
                tb.UpperBerthPosition.remove(0);
                tb.AvailableUpperBerth--;
                System.out.println("Upper Berth is Given");
            }

        }
    }
    public static void main(String[] args)
    {
        int choice =0;
        Scanner sc = new Scanner(System.in);
        boolean repeat = true;
        while(repeat)
        {
            System.out.print("\n1. Book\n2. Cancel\n3. Available Tickets\n4. Booked Tickets\n5. Exit\nEnter your choice :");
            choice = sc.nextInt();
            switch(choice)
            {
                case 1:
                {
                    System.out.println("Enter the Passenger Name :");
                    String name = sc.next();
                    System.out.println("Enter the Passenger Age :");
                    int age = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter the Passenger Gender : (M/F)");
                    String gender = sc.next();
                    System.out.println("Enter the Berth Preference : (L/M/U)");
                    String bp = sc.next();
                    Passenger p = new Passenger(name, age, gender, bp);
                    break;
                }
                case 5:
                {
                    System.out.print("\nThank You");
                    repeat = false;
                    break;
                }
            }
        }
    }
}
