import java.util.ArrayList;
public class Cassett implements AnalogAlbum {
    private ArrayList<String> songs = new ArrayList<String>();
    private int currentIndex = 0;

    public Cassett(String song1, String song2, String song3, String song4, String song5){
        songs.add(song1); songs.add(song2); songs.add(song3);songs.add(song4);songs.add(song5);
    }

    @Override
    public String play() {
        
        if(currentIndex == 5 ) return ("At the end of the cassett you need to rewind");
        else {
        currentIndex++; 
        return ("Playing Song " + (currentIndex) + ": " + songs.get(currentIndex-1));
        }
    }

    @Override
    public String rewind() {
        if(currentIndex == 0) return "Fully Re-Wound";
        else{
            currentIndex = currentIndex-1;
            return ("Rewinding to song " + (currentIndex+1));
        }
    }

    @Override
    public String ffwd() {
        currentIndex++;
        if(currentIndex != 5 && currentIndex!= 4){
            return ("Forwarding to song " + (currentIndex+1));
        }
        else if(currentIndex == 5)
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
