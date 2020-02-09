package FRQ2005.Question1;

public class HotelTester {
    public static void main(String[] args) {
        Hotel hotel = new Hotel(5);
        Reservation res1 = hotel.requestRoom("guest1");
        Reservation res2 = hotel.requestRoom("guest2");
        Reservation res3 = hotel.requestRoom("guest3");
        Reservation res4 = hotel.requestRoom("guest4");
        Reservation res5 = hotel.requestRoom("guest5");
        Reservation res6 = hotel.requestRoom("guest6");
        System.out.println("After 6 guests: " + hotel);
        assert res6 == null;

        res6 = hotel.cancelAndReassign(res3);
        System.out.println("After 3rd cancelled: " + hotel);
    }
}
