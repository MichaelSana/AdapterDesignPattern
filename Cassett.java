import java.util.ArrayList;
public class Cassett implements AnalogAlbum {
    private ArrayList<String> songs = new ArrayList<String>();
    private int currentIndex = 0;

    public Cassett(String song1, String song2, String song3, String song4, String song5){
        songs.add(song1); songs.add(song2); songs.add(song3);songs.add(song4);songs.add(song5);
    }

    @Override
    public String play() {
        
        if(currentIndex == 4 ) return ("At the end of the cassett you need to rewind");
        else return ("Playing Song " + (currentIndex+1) + ": " + songs.get(currentIndex));
    }

    @Override
    public String rewind() {
        if(currentIndex == 0) return "Fully Re-Wound";
        else{
            currentIndex = currentIndex-1;
            return ("Rewinding to song " + currentIndex);
        }
    }

    @Override
    public String ffwd() {
        if(currentIndex != 4 && currentIndex!= 3){
            currentIndex = currentIndex+1;
            return ("Forwarding to song " + currentIndex);
        }
        else if(currentIndex == 4)
            return "At the end of the cassett you need to rewind";
        else
            return "Forwarded to the end of the cassett";
    }

    @Override
    public String pause() {
        return ("Pausing: " + songs.get(currentIndex));
    }

    @Override
    public String stopEject() {
        return "Stopping cassett and ejecting";
    }
    
}
