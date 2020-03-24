package FRQ2013.Question1;

import java.util.ArrayList;

public class MusicDownloadsTest {
    public static void main(String[] args) {
        DownloadInfo heyJude = new DownloadInfo("Hey Jude", 5);
        DownloadInfo soulSister = new DownloadInfo("Soul Sister", 3);
        DownloadInfo aquaLung = new DownloadInfo("Aqualung",10);
        MusicDownloads playlist = new MusicDownloads();
        playlist.add(heyJude);
        playlist.add(soulSister);
        playlist.add(aquaLung);
        System.out.println(playlist);
        ArrayList<String> newSongs = new ArrayList<String>();
        newSongs.add("Lights");
        newSongs.add("Aqualung");
        newSongs.add("Soul Sister");
        newSongs.add("Go Now");
        newSongs.add("Lights");
        newSongs.add("Soul Sister");
        playlist.updateDownloads(newSongs);
        System.out.println(playlist);
    }
}
