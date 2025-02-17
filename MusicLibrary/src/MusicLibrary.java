import java.util.ArrayList;
import java.util.Random;

public class MusicLibrary {
    private ArrayList < Song > songs;
    MusicLibrary(){
        this.songs = new ArrayList<Song>();
    }
    public void addSong(Song song){
        songs.add(song);
    }
    public void removeSong(Song song){
        songs.remove(song);
    }
    public ArrayList< Song > getSongs(){
        return songs;
    }
    public void playRandom(){
        int size = songs.size();
        if (size == 0){
            System.out.println("No songs in the library");
        }
        else {
            Random rand = new Random();
            int index = rand.nextInt(size);
            System.out.println("Now playing " + songs.get(index).getName() + " by " + songs.get(index).getArtist());
        }
    }
}
