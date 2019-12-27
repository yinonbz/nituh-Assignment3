import java.util.*;

public class Booking implements  ITestable{
    private Date date;
    private Room room;
    private ArrayList<HotelService> services;
    private Reservation reservation;
    private Review review;


    public Booking(Date a_date, Room a_room){
        date = a_date;
        room = a_room;
        services = new ArrayList<HotelService>();
    }

    public void addService(HotelService s){
        services.add(s);
    }

    public void addReview(Review a_review) {review  = a_review; }

    public void addReservation(Reservation r){
        reservation = r;
    }

    public void assignRoom(Room room){
        this.room = room;
    }


    // getters

    public Date getDate() {
        return date;
    }

    public Room getRoom() {
        return room;
    }

    public ArrayList<HotelService> getServices() {
        return services;
    }

    public Reservation getReservation() {
        return reservation;
    }

    public Review getReview() {
        return review;
    }


    @Override
    public boolean checkConstraints() {

        //saaif 5
        if(room.getRoomCategory().getType() == RoomCategory.RoomType.VIP){
            for(HotelService hService: services){
                if(!(hService.getService() instanceof VipService)){
                    return false;
                }
            }
        }

        //saaif 9
        for(HotelService hService: services){
            if((hService.getService() instanceof VipService)){
                if(review==null){
                    return false;
                }
            }
        }

        //saaif 13
        for(HotelService hs: services){
            Hotel hotel = hs.getHotel();
            if(!hotel.getServices().containsValue(hs.getService())){
                return false;
            }
        }

        return true;
    }

    public static boolean checkAllIntancesConstraints(Model model){
        //saaif 12
        Set<Hotel> hotels = new HashSet<>();
        for(Object o: model.allObjects){
            if(o instanceof Hotel){
                Hotel hotel = (Hotel) o;
                hotels.add(hotel);
            }
        }

        for(Hotel hotel : hotels){
            Map<Integer,Integer> incomes = new TreeMap<>();
            for(Object o: model.allObjects){
                if(o instanceof Booking){
                    Booking bookingObj = (Booking)o;
                    for(HotelService hs: bookingObj.getServices()){
                        if(hs.getHotel().equals(hotel)){
                            if(!incomes.containsKey(bookingObj.getDate().getYear())){
                                incomes.put(bookingObj.getDate().getYear(),hs.getPrice());
                            }
                            else{
                                incomes.put(bookingObj.getDate().getYear(),incomes.remove(bookingObj.getDate().getYear())+hs.getPrice());
                            }
                        }
                    }


                }
            }
            int prevSum =-1;
            for(Integer sum: incomes.values()){
                if(sum<prevSum){
                    return false;
                }
                else{
                    prevSum=sum;
                }
            }
        }

        return true;
    }
}
