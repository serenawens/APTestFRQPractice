package FRQ2016.Question2;

public class LogMessageA {
    private String machineId;
    private String description;

    /** Precondition: message is a valid log message. */
    public LogMessageA(String message)
    {
        int indexOfCol = message.indexOf(":");
        machineId = message.substring(0, indexOfCol);
        description = message.substring(indexOfCol+1);
    }

    public String toString()
    {
        return machineId + ":" + description;
    }

    public boolean containsWord(String keyword)
    {
        return ( description.endsWith(" " + keyword))
                || (description.startsWith(keyword + " ") )
                || description.contains(" " + keyword + " ")
                || description.equals(keyword);
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
