package FRQ2006.Question1;

import java.util.ArrayList;

public class DailySchedule {
    private ArrayList<Appointment> apptList;

    public DailySchedule()
    {
        apptList=new ArrayList<Appointment>();
    }

    // removes all appointments that overlap the given Appointment
            // postcondition: all appointments that have a time conflict with
            //                 appt have been removed from this DailySchedule
    public void ClearConflicts(Appointment appt)
    {
        for(int i=0; i<apptList.size(); i++)
        {
            if(appt.conflictsWith(apptList.get(i)))
            {
                apptList.remove(apptList.get(i));
            }
        }
    }

    // if emergency is true, clears any overlapping appointments and adds
    // appt to this DailySchedule; otherwise, if there are no conflicting
    // appointments, adds appt to this DailySchedule;
    // returns true if the appointment was added;
    // otherwise, returns false
    public boolean addAppt(Appointment appt, boolean emergency)
    {
        if(emergency)
        {
            ClearConflicts(appt);
            apptList.add(appt);
        }
        else
        {
            for (Appointment time: apptList)
            {
                if (time.conflictsWith(appt))
                {
                    return false;
                }
            }
            apptList.add(appt);
        }
        return true;
    }

}
