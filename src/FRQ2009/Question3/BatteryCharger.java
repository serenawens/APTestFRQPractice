package FRQ2009.Question3;

public class BatteryCharger {
    /** rateTable has 24 entries representing the charging costs for hours 0 through 23. */
    private int[] rateTable;

    /** Determines the total cost to charge the battery starting at the beginning of startHour.
     * @param startHour the hour at which the charge period begins
     * Precondition: 0 ≤ startHour ≤ 23
     * @param chargeTime the number of hours the battery needs to be charged
     * Precondition: chargeTime > 0
     * @return the total cost to charge the battery*/
    private int getChargingCost(int startHour, int chargeTime)
    {
        int chargeCost=0;
        int time = startHour;
        int timeLeft =chargeTime;
        while(timeLeft>0)
        {
            if(time>23)
            {
                time=0;
            }
            chargeCost=chargeCost+rateTable[time];
            time++;
            timeLeft--;
        }
        return chargeCost;
    }

    /** Determines start time to charge the battery at the lowest cost for the given charge time.
     * @param chargeTime the number of hours the battery needs to be charged
     * Precondition: chargeTime > 0
     * @return an optimal start time, with 0 ≤ returned value ≤ 23*/
    public int getChargeStartTime(int chargeTime)
    {
        int minCost = Integer.MAX_VALUE;
        int startTime=0;
        for(int i=0; i<24;i++)
        {
            int chargingCost = getChargingCost(i,chargeTime);
            if(chargingCost<minCost)
            {
                minCost = chargingCost;
                startTime = i;
            }
        }
        return startTime;
    }
    //TIme TAKEN: 21 minutes

}
