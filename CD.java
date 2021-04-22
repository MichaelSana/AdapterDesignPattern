import java.util.ArrayList;
public class CD implements DigitalAlbum {
    private ArrayList<String> songs = new ArrayList<String>();
    private int currentIndex = 0;
    
    public CD(String song1, String song2, String song3, String song4, String song5){
        songs.add(song1); songs.add(song2); songs.add(song3);songs.add(song4);songs.add(song5);
    }

    @Override
    public String playFromBegginning() {
        
        return ("Playing song 1: " +songs.get(0));
        
    }

    @Override
    public String playSong(int num) {
        //num = currentIndex;
        currentIndex = num+1;
        if(num <= 5) return ("Playing: " + songs.get(currentIndex));
        else return "Not a valid song number";
        
    }

    @Override
    public String prevSong() {
        if(currentIndex != 0){
            currentIndex = currentIndex - 1;
            return ("Skipping back and playing: " + songs.get(currentIndex-1));
        }
        else return ("Playing: " + songs.get(currentIndex));
    }

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

    @Override
    public String stop() {
        currentIndex =0;
        return "Stopping cassett and ejecting";
    }

    @Override
    public String pause() {
        return ("Pausing: " + songs.get(currentIndex));
    }
    
}
