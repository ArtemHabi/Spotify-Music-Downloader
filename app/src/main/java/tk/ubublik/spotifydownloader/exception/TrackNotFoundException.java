package tk.ubublik.spotifydownloader.exception;

public class TrackNotFoundException extends RuntimeException {

    public TrackNotFoundException() {
        super("Track not found");
    }
}
