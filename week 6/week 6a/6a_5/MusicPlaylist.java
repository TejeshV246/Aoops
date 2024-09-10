import java.util.LinkedList;
import java.util.ListIterator;

public class MusicPlaylist 
{
    private LinkedList<String> playlist;

    public MusicPlaylist() 
    {
        playlist = new LinkedList<>();
    }

    // Method to add a song to the playlist
    public void addSong(String song)
    {
        playlist.add(song);
        System.out.println(song + " added to the playlist.");
    }

    // Method to remove a song by name
    public void removeSong(String song)
    {
        if (playlist.remove(song)) {
            System.out.println(song + " removed from the playlist.");
        } else {
            System.out.println(song + " is not in the playlist.");
        }
    }

    // Method to move a song to a different position in the playlist
    public void moveSong(String song, int newPosition) 
    {
        int currentIndex = playlist.indexOf(song);
        if (currentIndex == -1) 
        {
            System.out.println(song + " is not in the playlist.");
            return;
        }

        if (newPosition < 0 || newPosition >= playlist.size()) 
        {
            System.out.println("Invalid position.");
            return;
        }

        playlist.remove(currentIndex);
        playlist.add(newPosition, song);
        System.out.println(song + " moved to position " + (newPosition + 1) + " in the playlist.");
    }

    
    public void displayPlaylist() 
    {
        if (playlist.isEmpty()) 
        {
            System.out.println("The playlist is empty.");
        } else 
        {
            System.out.println("Playlist:");
            int index = 1;
            for (String song : playlist) {
                System.out.println(index + ". " + song);
                index++;
            }
        }
    }

    public static void main(String[] args) 
    {
        MusicPlaylist musicPlaylist = new MusicPlaylist();

        musicPlaylist.addSong("Song A");
        musicPlaylist.addSong("Song B");
        musicPlaylist.addSong("Song C");

        musicPlaylist.displayPlaylist();

        musicPlaylist.removeSong("Song B");
        musicPlaylist.displayPlaylist();

        musicPlaylist.moveSong("Song C", 0);
        musicPlaylist.displayPlaylist();

        musicPlaylist.addSong("Song D");
        musicPlaylist.displayPlaylist();
    }
}
