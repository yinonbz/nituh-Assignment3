import java.util.Date;

public class Main {

    public static void main(String[] args) {

        //--------------------TESTING CONSTRAINT NR. 2----------------------
        System.out.println("------------------------------------------------------------- TESTING CONSTRAINT NR. 2 -------------------------------------------------------------");
        Model testingModel = new Model();
        Hotel testingHotel = new Hotel("Beer Sheva", "Hilton", 5);
        Client testingClient = new Client(312178312, 25, "Itay", "Beer Sheva");

        ReservationSet testingResSet = new ReservationSet();
        Reservation testRes = new Reservation(new Date(), new Date(), 54);
        testRes.addRoomCategory(new RoomCategory(54, RoomCategory.RoomType.BASIC));
        testingResSet.addReservation(testRes);
        Reservation testRes2 = new Reservation(new Date(), new Date(), 63);
        testRes2.addRoomCategory(new RoomCategory(100, RoomCategory.RoomType.SUITE));
        testingResSet.addReservation(testRes2);

        testingHotel.addReservationSet(testingClient, testingResSet);
        testingModel.addObjectToModel(testingHotel);

        System.out.println(testingModel.checkModelConstraints());
        //-------------------END OF TESTING CONSTRAINT NR. 2--------------------

        //-------------------TESTING CONSTRAINT NR. 4---------------------------
        System.out.println("------------------------------------------------------------- TESTING CONSTRAINT NR. 4 -------------------------------------------------------------");

        Model testingModel2 = new Model();
        Group testGroup = new Group(5);

        Hotel testingHotel2 = new Hotel("Beer Sheva", "Magic", 3);
        Hotel testingHotel3 = new Hotel("Tel Aviv", "Magic", 4);

        CommunityService testCommunityService = new CommunityService("Spa");
        HotelService testHotelService = new HotelService(54, 2);
        VipService testVipService = new VipService("Vip");
        HotelService testHotelService2 = new HotelService(65, 5);

        testingModel2.create_link_hotel_service_hotelService(testingHotel2, testCommunityService, testHotelService);
        testingModel2.create_link_hotel_service_hotelService(testingHotel3, testCommunityService, testHotelService2);

        testingModel2.create_link_group_hotel(testingHotel2, testGroup);
        testingModel2.create_link_group_hotel(testingHotel3, testGroup);

        testingModel2.addObjectToModel(testGroup);
        testingModel2.addObjectToModel(testingHotel2);
        testingModel2.addObjectToModel(testingHotel3);
        testingModel.addObjectToModel(testCommunityService);
        testingModel.addObjectToModel(testHotelService);
        testingModel.addObjectToModel(testVipService);
        testingModel.addObjectToModel(testHotelService2);

        System.out.println(testingModel2.checkModelConstraints());
    }

}
