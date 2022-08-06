import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

class Bus{
    private int BusNo;
    private boolean ac;
    private int capacity; 

    public Bus(int no, boolean ac, int capacity){
        this.BusNo = no;
        this.ac = ac;
        this.capacity = capacity;
    }

    public int getBusno(){
        return BusNo;
    }

    public boolean isAc(){
       return ac;
    }

    public void SetAc(boolean ac){
       this.ac = ac;
    }

    public int getCapacity(){
        return capacity;
    }

    public void setCapacity(int capacity){
        this.capacity = capacity;
    }

    public void displayBusInfo(){
        System.out.println("\nBus No :"+BusNo+"\nAc :"+ac+"\nTotal Capacity :"+capacity);
    }

}

class Booking{
    String passengerName; 
    int BusNo;
    Date date;

    public Booking(){
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the Name :");
        passengerName = sc.nextLine();
        System.out.print("\nEnter the BusNo :");
        BusNo = sc.nextInt();
        System.out.print("\nEnter the Date dd-mm-yyyy:");

        String dateInput = sc.next();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

        try {
            date = dateFormat.parse(dateInput);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public boolean isAvailable(List<Booking> bookings, List<Bus> buses) {
        int capacity = 0; 
        for(Bus bus: buses){
            
            if(bus.getBusno() == BusNo){ 
            capacity = bus.getCapacity();
            }

        }
        int booked = 0;

        for(Booking b: bookings)
        {
            if(b.BusNo == BusNo && b.date.equals(date)){
                booked ++;
            }
        }
        
        return booked< capacity ? true: false;
    }
}

public class BusTicketReservation {
    public static void main(String[] args)
    {
        List<Bus> buses= new ArrayList<>();
        buses.add(new Bus (1,true, 2));
        buses.add(new Bus (2,false, 1));
        buses.add(new Bus (3,true, 2));

        List<Booking> bookings= new ArrayList<>();
        
        Scanner sc = new Scanner(System.in);
        int choice = 0; 
        System.out.println("\nWelcome to SB ticket booking ....");

        for(Bus b: buses)
        {
            b.displayBusInfo();
        }
        
        while(choice!=2)
        {
            System.out.println("\nDo you want to continue with the booking 1 to continue 2 to cancel :");
            choice = sc.nextInt();
            if(choice ==1)
            {
                Booking booking = new Booking();
                if(booking.isAvailable(bookings, buses)){
                    bookings.add(booking);
                    System.out.print("Booking ...\nYour Booking has been successfully executed.");
                }
                else
                {
                    System.out.print("Sorry bus is full try another bus or date.");
                }
            }
        }

    }
}
