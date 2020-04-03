package FRQ2016.Question2;
//Time Taken: 21 minutes
import java.util.ArrayList;
import java.util.List;

public class SystemLog {
    /** Contains all the entries in this system log
     * Guaranteed not to be null and to only contain non-null entries*/
    private List<LogMessage> messageList;

    public SystemLog()
    {
        messageList = new ArrayList<LogMessage>();
        messageList.add(new LogMessage("CLIENT3:security alert - repeated login failures"));
        messageList.add(new LogMessage("Webserver:disk offline"));
        messageList.add(new LogMessage("SERVER1:file not found"));
        messageList.add(new LogMessage("SERVER2:read error on disk DSK1"));
        messageList.add(new LogMessage("SERVER1:write error on disk DSK2"));
        messageList.add(new LogMessage("Webserver:error on /dev/disk"));
    }

    public String toString()
    {
        return messageList.toString();
    }


    /**Removes from the system log all entries whose descriptions properly contain keyword
     * and returns a list (possibly empty) containing the removed entries
     *  Postcondition:
     *      -Entries in the returned list properly contain keyword and
     *      are in the order in which they appeared in the system log
     *      -The remaining entries in the system log do not properly contain keyword and
     *      are in their original order
     *      -The returned list is empty if no messages properly contains keyword*/
    public ArrayList<LogMessage> removeMessages(String keyword)
    {
        ArrayList<LogMessage> containsKey = new ArrayList<LogMessage>();
        for(int i=0; i<messageList.size(); i++)
        {
            if(messageList.get(i).containsWord(keyword))
            {
                containsKey.add(messageList.remove(i));
                i--;
            }
        }

        return containsKey;
    }

}
