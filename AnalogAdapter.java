public class AnalogAdapter implements AnalogAlbum{
    private DigitalAlbum album;

    public AnalogAdapter(DigitalAlbum album){
        this.album = album;
    }
    
    @Override
    public String play() {
        
        return album.nextSong();
    }

    @Override
    public String rewind() {
        
        return album.prevSong();
    }

    @Override
    public String ffwd() {
        // TODO Auto-generated method stub
        return album.nextSong();
    }

    @Override
    public String pause() {
        // TODO Auto-generated method stub
        return album.pause();
    }

    @Override
    public String stopEject() {
        // TODO Auto-generated method stub
        return album.stop();
    }
    
}