import java.util.*;

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

        //----END OF CONSTRAINT NR. 2----


        //-------CONSTRAINT NR. 6-------
        double countRooms = 0;
        int vipRooms = 0;
        for (Map.Entry<Integer, Room> entry : rooms.entrySet()) {
            Room tempRoom = entry.getValue();
            countRooms++;
            if(tempRoom.getRoomCategory() != null){
                if(tempRoom.getRoomCategory().getType() == RoomCategory.RoomType.VIP){
                    vipRooms++;
                }
            }
        }
        countRooms = countRooms / 10;
        int countRoomsRoundNumber = (int)countRooms;
        if(vipRooms > countRoomsRoundNumber){
            return false;
        }

        //------END OF CONSTRAINT NR. 6------


        //------CONSTRAINT NR. 10------

        if (rate == 5) {
            int numOfReviews = 0;
            int countRanksOfReviews = 0;
            for (Map.Entry<Integer, Room> entry : rooms.entrySet()) {
                for (Map.Entry<Date, Booking> tempBooking : entry.getValue().getBookings().entrySet()) {
                    if (tempBooking.getValue().getReview() != null) {
                        numOfReviews++;
                        countRanksOfReviews = countRanksOfReviews + tempBooking.getValue().getReview().getRank();
                    }
                }
            }
            if (((double) countRanksOfReviews / numOfReviews) <= 7.5) {
                return false;
            }
        }

        //------END OF CONSTRAINT 10------

        //saaif 11
        Set<String> name = new HashSet<>();
        for(Service service: services.keySet()){
            if(!name.contains(service.getServiceName())){
                name.add(service.getServiceName());
            }
            else{
                return false;
            }
        }

        return true;
    }

    public static boolean checkAllIntancesConstraints(Model model){
//------CONSTRAINT NR. 10------
        int numOfHotelsWithRateFive = 0;
        int numOfReviews = 0;
        int countRanksOfReviews = 0;
        for(Object obj : model.allObjects) {
            if(obj instanceof Hotel){
                Hotel hotelObj = (Hotel)obj;
                if (hotelObj.rate == 5) {
                    numOfHotelsWithRateFive++;
                    for (Map.Entry<Integer, Room> entry : hotelObj.rooms.entrySet()) {
                        for (Map.Entry<Date, Booking> tempBooking : entry.getValue().getBookings().entrySet()) {
                            if (tempBooking.getValue().getReview() != null) {
                                numOfReviews++;
                                countRanksOfReviews = countRanksOfReviews + tempBooking.getValue().getReview().getRank();
                            }
                        }
                    }
                }
            }
        }
        if (((double) countRanksOfReviews / numOfReviews) <= 7.5 && numOfHotelsWithRateFive > 0) {
            return false;
        }

        //------END OF CONSTRAINT NR. 10------

        // saaif 1
        Map<String,Integer> cities = new HashMap<>();
        for(Object o: model.allObjects){
            if(o instanceof Group){
                Group group = (Group) o;
                for(Hotel hotel: group.getHotels()){
                    if(cities.containsKey(hotel.getCity())){
                        cities.put(hotel.getCity(),cities.remove(hotel.getCity())+1);
                    }
                    else{
                        cities.put(hotel.getCity(),1);
                    }
                }
                for(Map.Entry<String,Integer> me:cities.entrySet()){
                    if(me.getValue()>1){
                        return false;
                    }
                }
                cities.clear();
            }
        }
        return true;
    }
}
