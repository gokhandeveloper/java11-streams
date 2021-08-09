import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamTest {

    private static Stream stream ;
    private static List<Game> games;

    @BeforeEach
    public void setup() {
        games = new ArrayList<>();
        var game1 = new Game("Call of Duty", 9);
        var game2 = new Game("GTA6", 10);
        var game3 = new Game("Super Mario", 10);
        games.add(game1);
        games.add(game2);
        games.add(game3);
        stream = new Stream();

    }

    @Test
    public void getGamesWhichStartWithC() {
        Assertions.
                assertEquals(List.of(games.get(0)),
                        stream.getGamesStartingWithC(games));
    }

    @Test
    public void getGamesCount() {
        Assertions.assertEquals(3L, stream.getGamesCount(games));
    }

    @Test
    public void rating10andStartsWithG() {
        Assertions.
                assertEquals(List.of(games.get(1)),
                        stream.rating10andStartsWithG(games));
    }

    @Test
    public void sortGamesbyTheirTitle() {
        List<Game> games = new ArrayList<>();
        var game1 = new Game("Call of Duty", 9);
        var game2 = new Game("GTA6", 10);
        var game3 = new Game("Super Mario", 10);
        var game4 = new Game("Load Runner", 8);
        var game5 = new Game("Street Fighter", 8);
        games.add(game1);
        games.add(game2);
        games.add(game3);
        games.add(game4);
        games.add(game5);
        Assertions.
                assertEquals(List.of(games.get(1)),
                        stream.sortGamesbyTheirTitle(games));
    }
}
