//Song.java

public class Song {

    private int trackId;
    private int trackNumber;
    private String title;
    private String artist;
    private int duration;
    private int releaseYear;

    public Song() {
        int trackId;
        int trackNumber;
        String title;
        String artist;
        int duration;
        int releaseYear;
    }

    public Song(int trackId, int trackNumber, String title, String artist, int duration, int releaseYear) {
        this.("");
    }

    public int getTrackId() {
        return trackId;
    }

    public int getTrackNumber() {
        return trackNumber;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getDuration() {
        return duration;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setTrackId(int trackId) {
        this.trackId = trackId;
    }

    private void setTrackNumber(int trackNumber) {
        this.trackNumber = trackNumber;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    @Override
    public String toString() {
        return "Song{" +
                "trackId=" + trackId +
                ", trackNumber=" + trackNumber +
                ", title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", duration=" + duration +
                ", releaseYear=" + releaseYear +
                '}';
    }
}
