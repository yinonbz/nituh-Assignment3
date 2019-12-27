import java.util.*;

public class Group implements ITestable {
    private int groupId;
    HashSet<Hotel> hotels;

    public Group(int id) {
        hotels = new HashSet<Hotel>();
        groupId = id;
    }


    public void addHotelToGroup(Hotel hotel) {
        hotels.add(hotel);
    }

    //getters

    public int getGroupId() {
        return groupId;
    }

    public HashSet<Hotel> getHotels() {
        return hotels;
    }

    @Override
    public boolean checkConstraints() {

        //---------CONSTRAINT NR. 4-----------
        for (Hotel h : hotels) {
            HashMap<Service, HotelService> hotelServices = h.getServices();
            for (Map.Entry<Service, HotelService> entry : hotelServices.entrySet()) {
                Service tempService = entry.getKey();
                for (Hotel tempHotel : hotels) {
                    boolean flag = false;
                    for (Service tempHotelService : tempHotel.getServices().keySet()) {
                        if (tempService instanceof CommunityService && tempHotelService instanceof CommunityService) {
                            flag = true;
                            break;
                        } else if (tempService instanceof RegularService && tempHotelService instanceof RegularService) {
                            flag = true;
                            break;
                        } else if (tempService instanceof VipService && tempHotelService instanceof VipService) {
                            flag = true;
                            break;
                        }
                    }
                    if (!flag) {
                        return false;
                    }
                }
            }
        }


        //---------END OF CONSTRAINT NR. 4-------------

        return true;
    }

    public static boolean checkAllIntancesConstraints(Model model) {


        return true;
    }
}
