package FRQ2008.Question1;

public class Time {
    private int hrs;
    private int mins;

    public Time(int hour, int minute)
    {
        hrs = hour;
        mins = minute;
    }

    public int getHrs()
    {
        return hrs;
    }
    public int getMins()
    {
        return mins;
    }

    private int convertToMinutes()
    {
        return getHrs()*60 + getMins();
    }

    public int minutesUntil(Time other)
    {
        return other.convertToMinutes()-convertToMinutes();
    }
}

