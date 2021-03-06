package FRQ2005.Question1;

import java.util.ArrayList;
import java.util.Arrays;

public class Hotel {
    private Reservation[] rooms;
    private ArrayList<String> waitList;

    public Hotel(int numOfRooms) {
        rooms = new Reservation[numOfRooms];
        waitList = new ArrayList<String>();
    }

    public Reservation requestRoom(String guestName)
    {
        for (int index =0; index <rooms.length; index++)
        {
            if(rooms[index] ==null)
            {
                Reservation newRes = new Reservation(guestName, index);
                rooms[index] = newRes;
                return newRes;
            }
        }
        waitList.add(guestName);
        return null;
    }

    public Reservation cancelAndReassign(Reservation res)
    {
        rooms[res.getRoomNumber()] = null;
        if (waitList.size() >0)
        {
            Reservation newRes = new Reservation(waitList.get(0), res.getRoomNumber());
            waitList.remove(waitList.get(0));
            rooms[res.getRoomNumber()] = newRes;
            return newRes;
        }
        return null;
    }

    public Reservation[] getRooms() {
        return rooms;
    }

    public ArrayList<String> getWaitList() {
        return waitList;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "rooms=" + Arrays.toString(rooms) +
                ", waitList=" + waitList +
                '}';
    }
}
