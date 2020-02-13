package FRQ2006.Question1;

public class Appointment {
    private TimeInterval time;

    public Appointment(TimeInterval t)
    {
        time =t;
    }

    public TimeInterval getTime()
    {
        return time;
    }
    // returns true if the time interval of this Appointment
    // overlaps with the time interval of other;
    // otherwise, returns false
    public boolean conflictsWith(Appointment other)
    {
        return time.overlapsWith(other.getTime());
    }

}
