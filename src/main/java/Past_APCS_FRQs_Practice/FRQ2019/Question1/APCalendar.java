package Past_APCS_FRQs_Practice.FRQ2019.Question1;

public class APCalendar {
    private static boolean isLeapYear(int year)
    {
        return true;
    }
    // AP ID: 99V0W60Y
    // SW
    // QUESTION 1: Part A
    /**
     *  SCORE: 5/5
     */
    public static int numberOfLeapYears(int year1, int year2)
    {
        int numLeapYears = 0;
        for(int currYear= year1; currYear<=year2; currYear++)
        {
            if(isLeapYear(currYear))
                numLeapYears++;
        }
        return numLeapYears;
    }

    public static int getFirstDayOfYear(int month, int day, int year)
    {
        return -1;
    }

    public static int getDayOfYear(int month, int day, int year)
    {
        return 0;
    }

    // AP ID: 99V0W60Y
    // SW
    // QUESTION 1: Part A
    /**
     *  SCORE: 3/4
     */
    public int dayOfWeek(int month, int day, int year)
    {
        int firstDayOfYear = getFirstDayOfYear(month, day, year);
        int dayOfYear = getDayOfYear(month, day, year);
        return (firstDayOfYear + dayOfYear-1) %7;
        //EDITED to -1 in the return statement because it was off by one
        // incorrect :( :(
    }

}
