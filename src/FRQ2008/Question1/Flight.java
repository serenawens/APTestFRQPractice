package FRQ2008.Question1;

public class Flight {
    private Time departTime;
    private Time arriveTime;

    public Flight(Time departure, Time arrival)
    {
        departTime = departure;
        arriveTime = arrival;
    }

    public Time getDepartTime() {
        return departTime;
    }
    public Time getArriveTime()
    {
        return arriveTime;
    }
}
