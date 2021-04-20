import java.util.ArrayList;
public class CD implements DigitalAlbum {
    private ArrayList<String> songs;
    private int currentIndex = 0;
    
    public CD(String song1, String song2, String song3, String song4, String song5){
        songs.add(song1); songs.add(song2); songs.add(song3);songs.add(song4);songs.add(song5);
    }

    @Override
    public String playFromBegginning() {
        currentIndex = currentIndex +1;
        return ("Playing song 1: " +songs.get(0));
        
    }

    @Override
    public String playSong(int num) {
        num = currentIndex;
        currentIndex = currentIndex+1;
        if(num <= 4) return "Playing...";
        else return "Not a valid song number";
        
    }

    @Override
    public String prevSong() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String nextSong() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String stop() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String pause() {
        // TODO Auto-generated method stub
        return null;
    }
    
}
