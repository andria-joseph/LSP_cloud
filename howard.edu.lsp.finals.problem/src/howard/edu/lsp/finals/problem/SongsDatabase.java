package howard.edu.lsp.finals.problem;

import java.util.*;

public class SongsDatabase {
    /* Key is the genre, HashSet contains associated songs */
	private Map<String, HashSet<String>> map = new HashMap<>();

    public void addSong(String genre, String songTitle) {
        if (!map.containsKey(genre)) {
            map.put(genre, new HashSet<>());
        }
        map.get(genre).add(songTitle);
    }

    public Set<String> getSongs(String genre) {
        return map.getOrDefault(genre, new HashSet<>());
    }

    public String getGenreOfSong(String songTitle) {
        for (Map.Entry<String, HashSet<String>> entry : map.entrySet()) {
            if (entry.getValue().contains(songTitle)) {
                return entry.getKey();
            }
        }
        return null; 
        
    }


    public static void main(String[] args) {
        SongsDatabase database = new SongsDatabase();

        // Add some songs to the database
        database.addSong("Rap", "Savage");
        database.addSong("Rap", "Gin and Juice");
        database.addSong("Jazz", "Always There");

        // Get the set of songs for a genre
        Set<String> rapSongs = database.getSongs("Rap");
        System.out.println("Rap songs: " + rapSongs);

        // Get the genre of a song
        System.out.println(database.getGenreOfSong("Always There"));
    }
}
