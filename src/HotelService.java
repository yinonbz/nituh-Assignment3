import java.awt.print.Book;
import java.util.HashSet;

public class HotelService implements ITestable {
    private Hotel hotel;
    private Service service;
    private int price;
    private int quality;
    private HashSet<Booking> givenServices;

    public HotelService(int price, int quality) {
        givenServices = new HashSet<Booking>();
        this.price = price;
        this.quality = quality;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public void assignService(Service service) {
        this.service = service;
    }

    public void addBooking(Booking booking) {
        givenServices.add(booking);
    }


    public Hotel getHotel() {
        return hotel;
    }

    public Service getService() {
        return service;
    }

    public int getPrice() {
        return price;
    }

    public int getQuality() {
        return quality;
    }

    public HashSet<Booking> getGivenServices() {
        return givenServices;
    }

    @Override
    public boolean checkConstraints() {

        //------CONSTRAINT NR. 10------
        /*
        if (hotel.getRate() >= 5) {
            int numOfReviews = 0;
            int countRanksOfReviews = 0;
            for (Booking tempBooking : givenServices) {
                if(tempBooking.getReview() != null){
                    numOfReviews++;
                    countRanksOfReviews = countRanksOfReviews + tempBooking.getReview().getRank();
                }
            }
            if(((double)countRanksOfReviews/numOfReviews) <= 7.5){
                return false;
            }
        }
        */
        //------END OF CONSTRAINT NR. 10------
        return true;
    }

    public static boolean checkAllIntancesConstraints(Model model) {
        return true;
    }
}
