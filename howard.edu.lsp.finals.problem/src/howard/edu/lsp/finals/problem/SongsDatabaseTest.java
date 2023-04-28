package howard.edu.lsp.finals.problem;

import static org.junit.jupiter.api.Assertions.*;
import java.util.HashSet;
import java.util.Set;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class SongsDatabaseTest {
    private SongsDatabase songsDatabase;

    @BeforeEach
    void setUp() throws Exception {
        songsDatabase = new SongsDatabase();
        songsDatabase.addSong("Rap", "Savage");
        songsDatabase.addSong("Rap", "Gin and Juice");
        songsDatabase.addSong("Jazz", "Always There");
    }

    @Test
    public void testAddSong() {
        songsDatabase.addSong("Rock", "Bohemian Rhapsody");
        Set<String> popSongs = songsDatabase.getSongs("Rock");
        assertTrue(popSongs.contains("Bohemian Rhapsody"));
    }

    @Test
    public void testGetSongs() {
        Set<String> rapSongs = songsDatabase.getSongs("Rap");
        Set<String> expectedRapSongs = new HashSet<>();
        expectedRapSongs.add("Savage");
        expectedRapSongs.add("Gin and Juice");
        assertEquals(expectedRapSongs, rapSongs);
    }

    @Test
    public void testGetGenreOfSong() {
        String genreOfAlwaysThere = songsDatabase.getGenreOfSong("Always There");
        assertEquals("Jazz", genreOfAlwaysThere);
    }

    @Test
    public void testGetGenreOfSongNotFound() {
        String genreOfNotFoundSong = songsDatabase.getGenreOfSong("Nonexistent Song");
        assertNull(genreOfNotFoundSong);
    }
}
