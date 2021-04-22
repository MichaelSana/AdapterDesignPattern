/**
 * Interface for the Digital Album
 * @author Michael Sana
 */
public interface DigitalAlbum {
    public String playFromBegginning();
    public String playSong(int num);
    public String prevSong();
    public String nextSong();
    public String stop();
    public String pause();
}
