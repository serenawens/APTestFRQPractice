package FRQ2016.Question2;

public class LogMessage {
    private String machineId;
    private String description;

    /** Precondition: message is a valid log message. */
    public LogMessage(String message)
    {
        int indexOfCol = message.indexOf(":");
        machineId = message.substring(0, indexOfCol);
        description = message.substring(indexOfCol+1);
    }

    public String toString()
    {
        return machineId + ":" + description;
    }


    /** Returns true if the description in this log message properly contains keyword
     *          false otherwise*/
    public boolean containsWord(String keyword)
    {
        int keywordIndex = description.indexOf(keyword);
        int keywordEndIndex = description.indexOf(keyword) + keyword.length();
        int keywordLastIndex = description.lastIndexOf(keyword);
        int keywordLastEndIndex = description.lastIndexOf(keyword) + keyword.length();

        boolean isInDescription = description.contains(keyword);
        if(!isInDescription)
        {
            return false;
        }

        boolean atBeginning = keywordIndex ==0;

        boolean spaceBefore = !atBeginning && (description.substring(keywordIndex-1,keywordIndex).equals(" ")
                                || description.substring(keywordLastIndex-1, keywordLastIndex).equals(" "));

        boolean atEnd = keywordLastEndIndex == description.length();

        boolean spaceAfter = !atEnd && (description.substring(keywordEndIndex, keywordEndIndex+1).equals(" ")
                    || description.substring(keywordLastEndIndex, keywordLastEndIndex+1).equals(" "));

        return  (atBeginning || spaceBefore) && (atEnd || spaceAfter);
    }

    public String getMachineId()
    {
        return machineId;
    }
    public String getDescription()
    {
        return description;
    }


}
