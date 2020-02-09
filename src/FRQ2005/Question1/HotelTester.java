package FRQ2005.Question1;

public class HotelTester {
    public static void main(String[] args) {
        Hotel hotel = new Hotel(5);
        Reservation res0 = hotel.requestRoom("guest0");
        Reservation res1 = hotel.requestRoom("guest1");
        Reservation res2 = hotel.requestRoom("guest2");
        Reservation res3 = hotel.requestRoom("guest3");
        Reservation res4 = hotel.requestRoom("guest4");
        Reservation res5 = hotel.requestRoom("guest5");
        System.out.println("After 6 guests: " + hotel);
        assert res5 == null : "guest5 reservation must be null";

        res5 = hotel.cancelAndReassign(res3);
        assert res5.getRoomNumber() == 3 : "Reassigned reservation must be room 3";
        assert res5.getGuest().equals("guest5") : "room 3 must have guest 5";

        System.out.println("After 3rd cancelled: " + hotel);

    }
}
