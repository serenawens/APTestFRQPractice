package FRQ2013.Question1;

public class DownloadInfo {
    private String songTitle;
    private int timesDownloaded;
    /** Creates a new instance with the given unique title and sets the
     * number of times downloaded to 1.
     * @param title the unique title of the downloaded song*/
    public DownloadInfo(String title)
    {
        songTitle=title;
        timesDownloaded=0;
    }
    public DownloadInfo(String title, int downloadTimes)
    {
        songTitle=title;
        timesDownloaded=downloadTimes;
    }
    /** @return the title */
    public String getTitle()
    {
        return songTitle;
    }
    /** Increment the number times downloaded by 1 */
    public void incrementTimesDownloaded()
    {
        timesDownloaded++;
    }
    public String toString()
    {
        return songTitle + ": " + timesDownloaded;
    }

}
