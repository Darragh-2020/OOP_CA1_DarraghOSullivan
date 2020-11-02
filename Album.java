import javax.swing.*;
//Album.java

public class Album {

    private String name;
    private tracks = Song[]
    private String producer;
    private int releaseYear;
    public int NumberOfTracks;
    public int PlayingTime;

    public Album() {
    }

    public String getName() {
        return name;
    }

    public String getProducer() {
        return producer;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public int getNumberOfTracks(int NumberOfTracks) {
        this.NumberOfTracks = NumberOfTracks;
    }

    public int getPlayingTime(int PlayingTime) {
        this.PlayingTime = PlayingTime;
    }

    public void setName(String name) {
        this.name = name;

        if (name = null || "")
            return ("No name specified.");
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void playTrack(int playTrack) {

        JOptionPane.showInputDialog(null,"Input","Which track number would you like to play?"
                +/*input for track number*/, + JOptionPane.INFORMATION_MESSAGE);

        if

        JOptionPane.showMessageDialog(null,"Playing Track","Now playing track - details are as follows",
                "\n\nTrack number: + " + JOptionPane.INFORMATION_MESSAGE);

        if(trackId >5 || trackId <1)

        JOptionPane.showMessageDialog(null,"Bad Track Number","An invalid track number was supplied!",
                JOptionPane.ERROR_MESSAGE);
    }

    public void shuffle() {

        JOptionPane.showMessageDialog(null,"Shuffled Playlist", "\n\n\n " + ,JOptionPane.INFORMATION_MESSAGE);
    }

    @Override
    public String toString() {
        return "Album{" +
                "name='" + name + '\'' +
                ", producer='" + producer + '\'' +
                ", releaseYear=" + releaseYear +
                ", NumberOfTracks=" + NumberOfTracks +
                ", PlayingTime=" + PlayingTime +
                '}';
    }
}
