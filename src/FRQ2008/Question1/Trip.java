package FRQ2008.Question1;

import java.util.ArrayList;

public class Trip
{
    private ArrayList<Flight> flights;
    // stores the flights (if any) in chronological order

    /** @return the number of minutes from the departure of the first flight to the arrival
     * of the last flight if there are one or more flights in the trip;
     * 0, if there are no flights in the trip
     */
    public int getDuration()
    {
        if(flights.size() !=0)
        {
            return flights.get(0).getDepartTime().minutesUntil(flights.get(flights.size()-1).getArriveTime());
        }
        return 0;
    }

    /** Precondition: the departure time for each flight is later than the arrival time of its
     * preceding flight
     * @return the smallest number of minutes between the arrival of a flight and the departure
     * of the flight immediately after it, if there are two or more flights in the trip;
     * -1, if there are fewer than two flights in the trip
     */
    public int getShortestLayover()
    {
       if(flights.size()>=2)
       {
           int i=0;
           ArrayList<Integer> layoverTimes = new ArrayList<Integer>();
           while(i<flights.size() && i+1!= flights.size()-1)
           {
               layoverTimes.add(flights.get(i).getArriveTime().minutesUntil(flights.get(i+1).getDepartTime()));
           }
           int min = layoverTimes.get(0);
           for(int timeInLayover: layoverTimes)
           {
               while(timeInLayover<min)
               {
                   min=timeInLayover;
               }
           }
           return  min;
       }
       return -1;
    }
    // There may be instance variables, constructors, and methods that are not shown.
}