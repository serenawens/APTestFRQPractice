package FRQ2005.Question1;

public class Reservation {
    private String guest;
    private int roomNumber;

    public Reservation(String guestName, int roomNum)
    {
        guest = guestName;
        roomNumber= roomNum;
    }
    public int getRoomNumber()
    {return roomNumber;}

    public String getGuest() {
        return guest;
    }

    @Override
    public String toString() {
        return "Res:" + roomNumber + "/" + guest;
    }
}
