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

        //-------------------END OF TESTING CONSTRAINT NR. 4--------------------
        System.out.println("------------------------------------------------------------- TESTING CONSTRAINT NR. 6 -------------------------------------------------------------");

        Room testRoom = new Room(45);
        Room testRoom2 = new Room(30);
        Room testRoom3 = new Room(50);
        RoomCategory testRoomCategory = new RoomCategory(45, RoomCategory.RoomType.VIP);
        RoomCategory testRoomCategory2 = new RoomCategory(45, RoomCategory.RoomType.BASIC);
        RoomCategory testRoomCategory3 = new RoomCategory(45, RoomCategory.RoomType.BASIC);

        testingModel.create_link_room_roomCategory(testRoom, testRoomCategory);
        testingModel.create_link_room_roomCategory(testRoom2, testRoomCategory2);
        testingModel.create_link_room_roomCategory(testRoom3, testRoomCategory3);

        testingModel.create_link_hotel_room(testRoom, testingHotel);
        testingModel.create_link_hotel_room(testRoom2, testingHotel);
        testingModel.create_link_hotel_room(testRoom3, testingHotel);


        System.out.println(testingModel.checkModelConstraints());

        System.out.println("------------------------------------------------------------- TESTING CONSTRAINT NR. 8 -------------------------------------------------------------");

        Model testingModel3 = new Model();
        ReservationSet testingReservation = new ReservationSet();
        Reservation testReservation = new Reservation(new Date(), new Date(), 54);
        testingModel3.create_link_reservation_roomCategory(testReservation, new RoomCategory(45, RoomCategory.RoomType.SUITE));
        testingModel3.create_link_reservationSet_reservation(testingReservation, testReservation);

        Room testRoom4 = new Room(50);
        testingModel3.create_link_room_roomCategory(testRoom4, new RoomCategory(50, RoomCategory.RoomType.SUITE));
        Booking testBookin = new Booking(new Date(), testRoom4);
        testingModel3.create_link_reservation_booking(testBookin, testReservation);
        testingModel3.create_link_room_Booking(testRoom4, testBookin);

        testingModel3.addObjectToModel(testingReservation);
        testingModel3.addObjectToModel(testReservation);
        testingModel3.addObjectToModel(testRoom4);
        testingModel3.addObjectToModel(testBookin);

        System.out.println(testingModel3.checkModelConstraints());

        System.out.println("------------------------------------------------------------- TESTING CONSTRAINT NR. 10 -------------------------------------------------------------");

        Model testingModel4 = new Model();

        Hotel testHotel = new Hotel("Rehovot", "Mulan Rooze", 2);
        CommunityService serviceTest = new CommunityService("Pool");
        HotelService testHotelService3 = new HotelService(50, 5);
        Review testReview = new Review(4, "Lovely", new Date());

        testingModel4.create_link_hotel_service_hotelService(testHotel, serviceTest, testHotelService3);
        testingModel4.create_link_hotelService_booking(testHotelService3, testBookin);
        testingModel4.create_link_booking_review(testBookin, testReview);

        testingModel4.addObjectToModel(testHotel);
        testingModel4.addObjectToModel(serviceTest);
        testingModel4.addObjectToModel(testHotelService3);
        testingModel4.addObjectToModel(testReview);
        testingModel4.addObjectToModel(testBookin);

        System.out.println(testingModel4.checkModelConstraints());


        System.out.println("------------------------------------------------------------- TESTING CONSTRAINT NR. 12 -------------------------------------------------------------");

        /*
        Date testDet = new Date(Model.getDateFromString("20-12-2019"));
        Date testDate = new Date();
        Date.
        */


    }

}
