import java.util.ArrayList;
/**
 * The class for CD
 * @author Michael Sana
 */
public class CD implements DigitalAlbum {
    private ArrayList<String> songs = new ArrayList<String>();
    private int currentIndex = 0;

    /**
     * adds the songs to the arrayList of songs in the CD
     * @param song1
     * @param song2
     * @param song3
     * @param song4
     * @param song5
     */
    public CD(String song1, String song2, String song3, String song4, String song5){
        songs.add(song1); songs.add(song2); songs.add(song3);songs.add(song4);songs.add(song5);
    }

    /**
     * Resets the CD and plays it from the beggining
     * @return The first song on the CD
     */
    @Override
    public String playFromBegginning() {
        
        return ("Playing song 1: " +songs.get(0));
        
    }

    /**
     * Plays the song at the index
     * @return The song at the index
     * @return Not a valid number
     */
    @Override
    public String playSong(int num) {
        //num = currentIndex;
        currentIndex = num+1;
        if(num <= 5) return ("Playing: " + songs.get(currentIndex));
        else return "Not a valid song number";
        
    }

    /**
     * Plays the song previously played on the CD
     * @return The previous song
     * @return The first song on the CD
     */
    @Override
    public String prevSong() {
        if(currentIndex != 0){
            currentIndex = currentIndex - 1;
            return ("Skipping back and playing: " + songs.get(currentIndex-1));
        }
        else return ("Playing: " + songs.get(currentIndex));
    }

    /**
     * The next song on the CD
     * @return Plays the next song on the CD
     * @return The first song on the CD
     */
    @Override
    public String nextSong() {
        if(currentIndex!=5){
            currentIndex = currentIndex+1;
            return ("Playing: " + currentIndex + ": " + songs.get(currentIndex-1)); 
        }
        else{
            currentIndex = 0;
            return("Playing: " + (currentIndex+1) + ": " +songs.get(currentIndex));
        }
    }

    /**
     * Stops the CD
     * @return Stopping Cassett and ejecting
     */
    @Override
    public String stop() {
        currentIndex =0;
        return "Stopping cassett and ejecting";
    }

    /**
     * Pauses the CD
     * @return Pausing: current song
     */
    @Override
    public String pause() {
        return ("Pausing: " + songs.get(currentIndex));
    }
    
}
