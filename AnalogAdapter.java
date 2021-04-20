public class AnalogAdapter implements AnalogAlbum{
    private DigitalAlbum album;

    public AnalogAdapter(DigitalAlbum album){
        this.album = album;
    }
    
    @Override
    public String play() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String rewind() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String ffwd() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String pause() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String stopEject() {
        // TODO Auto-generated method stub
        return null;
    }
    
}