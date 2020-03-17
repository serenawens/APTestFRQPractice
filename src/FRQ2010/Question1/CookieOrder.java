package FRQ2010.Question1;

public class CookieOrder {
    private String cookieVar;
    private int boxNum;
    /** Constructs a new CookieOrder object. */
    public CookieOrder(String variety, int numBoxes)
    {
        cookieVar = variety;
        boxNum=numBoxes;
    }
    /** @return the variety of cookie being ordered
     */
    public String getVariety()
    {
        return cookieVar;
    }
    /** @return the number of boxes being ordered
     */
    public int getNumBoxes()
    {
       return boxNum;
    }
}
