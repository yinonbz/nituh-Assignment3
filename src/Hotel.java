import java.util.*;

public class Hotel implements  ITestable{
    private String name;
    private HashMap<Client, ReservationSet> allReservation;
    private HashMap<Service, HotelService> services;
    private HashMap<Integer,Room> rooms;
    private String city;
    private Group group;
    private int rate;



    public Hotel(String city, String name,int rate){
        this.city = city;
        this.name = name;
        this.rate = rate;
        rooms = new HashMap<Integer,Room>();
        allReservation = new HashMap<Client, ReservationSet>();
        services = new HashMap<Service, HotelService>();

    }

    public void addReservationSet(Client client,ReservationSet reservationSet){
        allReservation.put(client,reservationSet);
    }

    public void addService(Service service, HotelService hotelService){
        services.put(service,hotelService);
    }

    public void addRoom(int roomNumber, Room room){
        rooms.put(roomNumber,room);
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

    public HashMap<Client, ReservationSet> getAllReservation(){return allReservation;}

    public HashMap<Service, HotelService> getServices(){
        return services;
    }

    public int getRate(){return rate;}

    @Override
    public boolean checkConstraints() {
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
