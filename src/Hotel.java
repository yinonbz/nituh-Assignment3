import com.sun.jmx.snmp.ServiceName;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Hotel implements ITestable {
    private String name;
    private HashMap<Client, ReservationSet> allReservation;
    private HashMap<Service, HotelService> services;
    private HashMap<Integer, Room> rooms;
    private String city;
    private Group group;
    private int rate;


    public Hotel(String city, String name, int rate) {
        this.city = city;
        this.name = name;
        this.rate = rate;
        rooms = new HashMap<Integer, Room>();
        allReservation = new HashMap<Client, ReservationSet>();
        services = new HashMap<Service, HotelService>();

    }

    public void addReservationSet(Client client, ReservationSet reservationSet) {
        allReservation.put(client, reservationSet);
    }

    public void addService(Service service, HotelService hotelService) {
        services.put(service, hotelService);
    }

    public void addRoom(int roomNumber, Room room) {
        rooms.put(roomNumber, room);
    }


    public void setGroup(Group group) {
        this.group = group;
    }

    public Group getGroup() {
        return group;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public HashMap<Client, ReservationSet> getAllReservation() {
        return allReservation;
    }

    public HashMap<Service, HotelService> getServices() {
        return services;
    }

    public int getRate() {
        return rate;
    }

    @Override
    public boolean checkConstraints() {

        //-----CONSTRAINT NR. 2----
        for (Map.Entry<Client, ReservationSet> entry : allReservation.entrySet()) {
            boolean beenToVIP = false;
            if (entry.getValue().getReservations().size() >= 5) {
                for (Reservation tempReservation : entry.getValue().getReservations()) {
                    if (tempReservation.getRoomCategory().getType() == RoomCategory.RoomType.VIP) {
                        beenToVIP = true;
                        break;
                    }
                }
                if (!beenToVIP) {
                    return false;
                }
            }
        }
        return true;
        //----END OF CONSTRAINT NR. 2----


    }

    public static boolean checkAllIntancesConstraints(Model model) {



        return true;
    }
}
