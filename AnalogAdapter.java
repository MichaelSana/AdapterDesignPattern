/**
 * The main analog adapter class
 * @implements AnalogAlbum
 * @author Michael Sana
 */
public class AnalogAdapter implements AnalogAlbum{
    private DigitalAlbum album;

    /**
     * sets the adapter to the current album
     * @param album
     */
    public AnalogAdapter(DigitalAlbum album){
        this.album = album;
    }
    
    /**
     * Plays the next song on the album
     * @return the next song on the album
     */
    @Override
    public String play() {
        
        return album.nextSong();
    }

    /**
     * Rewinds the album
     * @return Previous song
     */
    @Override
    public String rewind() {
        
        return album.prevSong();
    }

    /**
     * Fast forwards the album
     * @return the next song
     */
    @Override
    public String ffwd() {
        // TODO Auto-generated method stub
        return album.nextSong();
    }

    /**
     * Pauses the album
     * @return pause message
     */
    @Override
    public String pause() {
        // TODO Auto-generated method stub
        return album.pause();
    }

    /**
     * Stops and ejects the album
     * @return stop message
     */
    @Override
    public String stopEject() {
        // TODO Auto-generated method stub
        return album.stop();
    }
    
}