package FRQ2008.Question2;

public class StringPart
{
    private int startingPos;
    private int lengths;
    /** @param start the starting position of the substring in a master string
     * @param length the length of the substring in a master string*/
    public StringPart(int start, int length)
    {
       startingPos=start;
       lengths = length;
    }

    /** @return the starting position of the substring in a master string
     */
    public int getStart()
    { return startingPos;}

    /** @return the length of the substring in a master string
     */
    public int getLength()
    { return lengths; }
    // There may be instance variables, constructors, and methods that are not shown.
}
