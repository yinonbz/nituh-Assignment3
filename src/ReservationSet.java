import java.util.ArrayList;

public class ReservationSet implements ITestable {
    private Client client;
    private Hotel hotel;
    private ArrayList<Reservation> reservations;

    public ReservationSet() {
        reservations = new ArrayList<Reservation>();
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public void addReservation(Reservation reservation) {
        reservations.add(reservation);
    }


    public Client getClient() {
        return client;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public ArrayList<Reservation> getReservations() {
        return reservations;
    }

    @Override
    public boolean checkConstraints() {

        //------CONSTRAINT NR. 8------

        for (Reservation tempReservation : reservations) {
            RoomCategory orderedRoomCategory = tempReservation.getRoomCategory();
            RoomCategory bookedRoomCategory = tempReservation.getBookings().getRoom().getRoomCategory();
            if (orderedRoomCategory.getType() == RoomCategory.RoomType.BASIC) {
                continue;
            } else if (orderedRoomCategory.getType() == RoomCategory.RoomType.SUITE) {
                if (bookedRoomCategory.getType() == RoomCategory.RoomType.BASIC) {
                    return false;
                }
            } else {
                if(bookedRoomCategory.getType() != RoomCategory.RoomType.VIP){
                    return false;
                }
            }
        }


        //------END OF CONSTRAINT NR. 8------


        //saaif 7
        if(hotel.getCity().equalsIgnoreCase("LAS VEGAS")){
            if(client.getAge()<21){
                return false;
            }
        }
        return true;
    }

    public static boolean checkAllIntancesConstraints(Model model){
        //saaif 3
        for(Object o:model.allObjects){
            if(o instanceof ReservationSet){
                ReservationSet oRs = (ReservationSet)o;
                Hotel hotel = oRs.getHotel();
                if(!hotel.getAllReservation().containsValue(oRs)){
                    return false;
                }
                for(Object ob:model.allObjects){
                    if(ob instanceof Hotel){
                        Hotel hotelOb = (Hotel)ob;
                        if(!hotelOb.equals(hotel) && hotelOb.getAllReservation().containsValue(oRs)){
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
}
