import java.util.ArrayList;
/**
 * The main Cassett class
 * @author Michael Sana
 */
public class Cassett implements AnalogAlbum {
    private ArrayList<String> songs = new ArrayList<String>();
    private int currentIndex = 0;

    /**
     * adds all the songs to the Song ArrayList
     * @param song1
     * @param song2
     * @param song3
     * @param song4
     * @param song5
     */
    public Cassett(String song1, String song2, String song3, String song4, String song5){
        songs.add(song1); songs.add(song2); songs.add(song3);songs.add(song4);songs.add(song5);
    }

    /**
     * Plays the current song on the cassett
     * @return end of cassett message
     * @return The song being played
     */
    @Override
    public String play() {
        
        if(currentIndex == 5 ) return ("At the end of the cassett you need to rewind");
        else {
        currentIndex++; 
        return ("Playing Song " + (currentIndex) + ": " + songs.get(currentIndex-1));
        }
    }

    /**
     * Rewinds the Cassett by 1
     * @return FUlly rewound
     * @return Rewinding to song
     */
    @Override
    public String rewind() {
        if(currentIndex == 0) return "Fully Re-Wound";
        else{
            currentIndex = currentIndex-1;
            return ("Rewinding to song " + (currentIndex+1));
        }
    }

    /**
     * Fast forwards the cassett
     * @return Forwarding to song 
     * @return At the end of the cassett
     * @return Forwarded to the end of the cassett
     */
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

    /**
     * Pauses the cassett
     * @return Pausing song
     */
    @Override
    public String pause() {
        return ("Pausing: " + songs.get(currentIndex));
    }

    /**
     * Stops and ejects cassett
     * @return Stopping cassett and ejecting
     */
    @Override
    public String stopEject() {
        return "Stopping cassett and ejecting";
    }
    
}
