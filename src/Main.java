import java.util.Date;

public class Main {

    public static void main(String[] args) {

        /*
        System.out.println("*****************test saaif 1*****************");
        Model m1 = new Model();
        Group g = new Group(1);
        Hotel h1 = new Hotel("Haifa", "Dan panorama",4);
        Hotel h2 = new Hotel("Haifa", "Hilton  ",4);
        m1.addObjectToModel(g);
        m1.addObjectToModel(h1);
        m1.addObjectToModel(h2);
        m1.create_link_group_hotel(h1,g);
        m1.create_link_group_hotel(h2,g);
        System.out.println(m1.checkModelConstraints());
        System.out.println("\n");

        System.out.println("*****************test saaif 3*****************");
        m1 = new Model();
        g = new Group(1);
        h1 = new Hotel("Haifa", "Dan panorama",4);
        h2 = new Hotel("Tel-Aviv", "Hilton  ",4);
        m1.addObjectToModel(g);
        m1.addObjectToModel(h1);
        m1.addObjectToModel(h2);
        m1.create_link_group_hotel(h1,g);
        m1.create_link_group_hotel(h2,g);

        ReservationSet rs = new ReservationSet();
        Client tomer = new Client(69,24,"Tomer","Ramat-Gan");
        m1.create_link_client_hotel_reservationSet(tomer,h1,rs);
        Reservation res = new Reservation(new Date(2019,5,23),new Date(2019,9,21),1);
        m1.create_link_reservationSet_reservation(rs,res);

        h1.addReservationSet(tomer,rs);

        m1.addObjectToModel(rs);
        m1.addObjectToModel(tomer);
        m1.addObjectToModel(res);

        System.out.println(m1.checkModelConstraints());
        System.out.println("\n");

        System.out.println("*****************test saaif 5*****************");
        m1 = new Model();

        h1 = new Hotel("LAS VEGAS", "Dan panorama",4);
        h2 = new Hotel("Tel-Aviv", "Hilton  ",4);

        m1.addObjectToModel(g);
        m1.addObjectToModel(h1);
        m1.addObjectToModel(h2);
        m1.create_link_group_hotel(h1,g);
        m1.create_link_group_hotel(h2,g);

        Room room = new Room(2);
        RoomCategory rc = new RoomCategory(500, RoomCategory.RoomType.VIP);

        m1.addObjectToModel(room);
        m1.addObjectToModel(rc);

        m1.create_link_room_roomCategory(room,rc);

        HotelService hsR = new HotelService(220,5);
        HotelService hsV = new HotelService(220,5);

        RegularService reS = new RegularService("wine");
        VipService vs = new VipService("Champagne");

        m1.addObjectToModel(hsR);
        m1.addObjectToModel(hsV);
        m1.addObjectToModel(reS);
        m1.addObjectToModel(vs);
        m1.create_link_hotel_service_hotelService(h1,reS,hsR);
        m1.create_link_hotel_service_hotelService(h1,vs,hsV);

        Booking booking = new Booking(new Date(2019,12,9),room);
        m1.addObjectToModel(booking);

        m1.create_link_hotelService_booking(hsR,booking);
        m1.create_link_hotelService_booking(hsV,booking);
        m1.create_link_room_Booking(room,booking);

        System.out.println(m1.checkModelConstraints());
        System.out.println("\n");

        System.out.println("*****************test saaif 7******************");

        m1 = new Model();
        g = new Group(1);
        h1 = new Hotel("LAS VEGAS", "Dan panorama",4);
        h2 = new Hotel("Tel-Aviv", "Hilton  ",4);
        m1.addObjectToModel(g);
        m1.addObjectToModel(h1);
        m1.addObjectToModel(h2);
        m1.create_link_group_hotel(h1,g);
        m1.create_link_group_hotel(h2,g);

        rs = new ReservationSet();
        tomer = new Client(69,20,"Tomer","Ramat-Gan");
        m1.create_link_client_hotel_reservationSet(tomer,h1,rs);
        res = new Reservation(new Date(2019,5,23),new Date(2019,9,21),1);
        m1.create_link_reservationSet_reservation(rs,res);

        h1.addReservationSet(tomer,rs);

        m1.addObjectToModel(rs);
        m1.addObjectToModel(tomer);
        m1.addObjectToModel(res);

        System.out.println(m1.checkModelConstraints());
        System.out.println("\n");
*/
        /*
        System.out.println("*****************test saaif 9******************");

        Model m1 = new Model();

        Group g = new Group(1);
        Hotel h1 = new Hotel("LAS VEGAS", "Dan panorama",4);
        Hotel h2 = new Hotel("Tel-Aviv", "Hilton  ",4);

        m1.addObjectToModel(g);
        m1.addObjectToModel(h1);
        m1.addObjectToModel(h2);
        m1.create_link_group_hotel(h1,g);
        m1.create_link_group_hotel(h2,g);

        Room room = new Room(2);
        RoomCategory rc = new RoomCategory(500, RoomCategory.RoomType.BASIC);

        m1.addObjectToModel(room);
        m1.addObjectToModel(rc);

        m1.create_link_room_roomCategory(room,rc);

        HotelService hsR = new HotelService(220,5);
        HotelService hsV = new HotelService(220,5);

        RegularService reS = new RegularService("wine");
        VipService vs = new VipService("Champagne");

        m1.addObjectToModel(hsR);
        m1.addObjectToModel(hsV);
        m1.addObjectToModel(reS);
        m1.addObjectToModel(vs);
        m1.create_link_hotel_service_hotelService(h1,reS,hsR);
        m1.create_link_hotel_service_hotelService(h1,vs,hsV);

        Booking booking = new Booking(new Date(2019,12,9),room);
        m1.addObjectToModel(booking);

        m1.create_link_hotelService_booking(hsR,booking);
        m1.create_link_hotelService_booking(hsV,booking);
        m1.create_link_room_Booking(room,booking);

        System.out.println(m1.checkModelConstraints());
        System.out.println("\n");

        */

        /*
        System.out.println("*****************test saaif 11******************");

        Model m1 = new Model();

        Group g = new Group(1);
        Hotel h1 = new Hotel("LAS VEGAS", "Dan panorama",4);
        //h2 = new Hotel("Tel-Aviv", "Hilton  ",4);

        m1.addObjectToModel(g);
        m1.addObjectToModel(h1);
        //m1.addObjectToModel(h2);
        m1.create_link_group_hotel(h1,g);
       // m1.create_link_group_hotel(h2,g);

        Room room = new Room(2);
        RoomCategory rc = new RoomCategory(500, RoomCategory.RoomType.BASIC);

        m1.addObjectToModel(room);
        m1.addObjectToModel(rc);

        m1.create_link_room_roomCategory(room,rc);

        HotelService hsR = new HotelService(220,5);
        HotelService hsV = new HotelService(220,5);

        RegularService reS = new RegularService("wine");
        RegularService vs = new RegularService("wine");

        m1.addObjectToModel(hsR);
        m1.addObjectToModel(hsV);
        m1.addObjectToModel(reS);
        m1.addObjectToModel(vs);
        m1.create_link_hotel_service_hotelService(h1,reS,hsR);
        m1.create_link_hotel_service_hotelService(h1,vs,hsV);

        Booking booking = new Booking(new Date(2019,12,9),room);
        m1.addObjectToModel(booking);

        m1.create_link_hotelService_booking(hsR,booking);
        m1.create_link_hotelService_booking(hsV,booking);
        m1.create_link_room_Booking(room,booking);

        System.out.println(m1.checkModelConstraints());
        System.out.println("\n");
        */

        System.out.println("*****************test saaif 12******************");

        Model m1 = new Model();

        Group g = new Group(1);
        Hotel h1 = new Hotel("Arad", "Dan panorama",4);
        Hotel h2 = new Hotel("Tel-Aviv", "Hilton  ",4);

        m1.addObjectToModel(g);
        m1.addObjectToModel(h1);
        m1.addObjectToModel(h2);
        m1.create_link_group_hotel(h1,g);
        m1.create_link_group_hotel(h2,g);

        Room room = new Room(2);
        RoomCategory rc = new RoomCategory(500, RoomCategory.RoomType.BASIC);

        m1.addObjectToModel(room);
        m1.addObjectToModel(rc);

        m1.create_link_room_roomCategory(room,rc);

        HotelService hsR1 = new HotelService(220,5);
        HotelService hsR2 = new HotelService(220,5);
        HotelService hsR3 = new HotelService(220,5);

        HotelService hsV1 = new HotelService(300,5);
        HotelService hsV2 = new HotelService(300,5);
        HotelService hsV3 = new HotelService(300,5);

        RegularService reS1 = new RegularService("wine1");
        RegularService reS2 = new RegularService("wine2");
        RegularService reS3 = new RegularService("wine3");

        VipService vs1 = new VipService("Champagne1");
        VipService vs2 = new VipService("Champagne2");
        VipService vs3 = new VipService("Champagne3");

        m1.addObjectToModel(hsR1);
        m1.addObjectToModel(hsR2);
        m1.addObjectToModel(hsR3);
        m1.addObjectToModel(hsV1);
        m1.addObjectToModel(hsV2);
        m1.addObjectToModel(hsV3);
        m1.addObjectToModel(reS1);
        m1.addObjectToModel(reS2);
        m1.addObjectToModel(reS3);
        m1.addObjectToModel(vs1);
        m1.addObjectToModel(vs2);
        m1.addObjectToModel(vs3);
        m1.create_link_hotel_service_hotelService(h1,reS1,hsR1);
        m1.create_link_hotel_service_hotelService(h1,reS2,hsR2);
        m1.create_link_hotel_service_hotelService(h1,reS3,hsR3);
        m1.create_link_hotel_service_hotelService(h1,vs1,hsV1);
        m1.create_link_hotel_service_hotelService(h1,vs2,hsV2);
        m1.create_link_hotel_service_hotelService(h1,vs3,hsV3);

        Booking booking1 = new Booking(Model.getDateFromString("09-12-2019"),room);
        Booking booking2 = new Booking(Model.getDateFromString("09-11-2019"),room);
        Booking booking3 = new Booking(Model.getDateFromString("09-10-2019"),room);

        Booking booking4= new Booking(Model.getDateFromString("09-12-2018"),room);
        Booking booking5= new Booking(Model.getDateFromString("09-11-2018"),room);
        Booking booking6= new Booking(Model.getDateFromString("09-10-2018"),room);

        m1.addObjectToModel(booking1);
        m1.addObjectToModel(booking2);
        m1.addObjectToModel(booking3);
        m1.addObjectToModel(booking4);
        m1.addObjectToModel(booking5);
        m1.addObjectToModel(booking6);

        m1.create_link_hotelService_booking(hsR1,booking1);
        m1.create_link_hotelService_booking(hsR2,booking2);
        m1.create_link_hotelService_booking(hsR3,booking3);
        m1.create_link_hotelService_booking(hsV1,booking4);
        m1.create_link_hotelService_booking(hsV2,booking5);
        m1.create_link_hotelService_booking(hsV3,booking6);
        m1.create_link_room_Booking(room,booking1);
        m1.create_link_room_Booking(room,booking2);
        m1.create_link_room_Booking(room,booking3);
        m1.create_link_room_Booking(room,booking4);
        m1.create_link_room_Booking(room,booking5);
        m1.create_link_room_Booking(room,booking6);

        Review rev1 = new Review(4,"",Model.getDateFromString("30-12-2018"));
        Review rev2 = new Review(4,"",Model.getDateFromString("30-12-2018"));
        Review rev3 = new Review(4,"",Model.getDateFromString("30-12-2018"));

        m1.addObjectToModel(rev1);
        m1.addObjectToModel(rev2);
        m1.addObjectToModel(rev3);

        m1.create_link_booking_review(booking4,rev1);
        m1.create_link_booking_review(booking5,rev2);
        m1.create_link_booking_review(booking6,rev3);

        System.out.println(m1.checkModelConstraints());
        System.out.println("\n");

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



        Hotel testHotel = new Hotel("Rehovot", "Mulan Rooze", 6);
        Review testReview = new Review(7, "Lovely", new Date());

        testingModel4.create_link_hotel_room(testRoom4, testHotel);
        testingModel4.create_link_room_Booking(testRoom4, testBookin);
        testingModel4.create_link_booking_review(testBookin, testReview);

        testingModel4.addObjectToModel(testHotel);
        testingModel4.addObjectToModel(testReview);
        testingModel4.addObjectToModel(testRoom4);
        testingModel4.addObjectToModel(testBookin);

        System.out.println(testingModel4.checkModelConstraints());

        // CommunityService serviceTest = new CommunityService("Pool");
        //HotelService testHotelService3 = new HotelService(50, 5);



        /*
        testingModel4.create_link_hotel_service_hotelService(testHotel, serviceTest, testHotelService3);
        testingModel4.create_link_hotelService_booking(testHotelService3, testBookin);
        testingModel4.create_link_booking_review(testBookin, testReview);

        testingModel4.addObjectToModel(testHotel);
        testingModel4.addObjectToModel(serviceTest);
        testingModel4.addObjectToModel(testHotelService3);
        testingModel4.addObjectToModel(testReview);
        testingModel4.addObjectToModel(testBookin);

        System.out.println(testingModel4.checkModelConstraints());
        */

        System.out.println("------------------------------------------------------------- TESTING CONSTRAINT NR. 12 -------------------------------------------------------------");

        /*
        Date testDet = new Date(Model.getDateFromString("20-12-2019"));
        Date testDate = new Date();
        Date.
        */


    }

}
