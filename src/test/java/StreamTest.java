import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

public class StreamTest {

    private static Stream stream ;
    private static List<Game> games;
    private Game game1=  new Game("Call of Duty", 9, Genre.FPS);
    private Game game2=  new Game("GTA6", 10, Genre.ACTION);
    private Game game3=  new Game("Super Mario", 11, Genre.RETRO);
    private Game game4=  new Game("Load Runner", 7, Genre.RETRO);
    private Game game5=  new Game("Street Fighter", 8,Genre.RETRO);
    @BeforeEach
    public void setup() {
        games = new ArrayList<>();
        games.add(game1);
        games.add(game2);
        games.add(game3);
        games.add(game4);
        games.add(game5);
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
        Assertions.assertEquals(5L, stream.getGamesCount(games));
    }

    @Test
    public void rating10andStartsWithG() {
        Assertions.
                assertEquals(List.of(games.get(1)),
                        stream.rating10andStartsWithG(games));
    }

    @Test
    public void sortGamesbyTheirTitle() {
        List<Game> gamesSorted = new ArrayList<>();
        gamesSorted.add(game1);
        gamesSorted.add(game2);
        gamesSorted.add(game4);
        gamesSorted.add(game5);
        gamesSorted.add(game3);
        Assertions.
                assertEquals(gamesSorted,
                        stream.sortGamesbyTheirTitle(games));
    }
    @Test
    public void sortDescendingGamesByTheirTitle() {
        List<Game> gamesDescendingSorted = new ArrayList<>();
        gamesDescendingSorted.add(game3);
        gamesDescendingSorted.add(game5);
        gamesDescendingSorted.add(game4);
        gamesDescendingSorted.add(game2);
        gamesDescendingSorted.add(game1);
        Assertions.
                assertEquals(gamesDescendingSorted,
                        stream.sortDescendingGamesByTheirTitle(games));
    }

    @Test
    public void getTheFirstGame() {
        Assertions.
                assertEquals(List.of(game1),
                        stream.getTheFirstGame(games));
    }
    @Test
    public void getSummary() {
        Assertions.assertTrue(stream.summary(games).getMax()==11);
        Assertions.assertTrue(stream.summary(games).getMin()==7);
    }

    @Test
    public void groupByGenre() {
        Assertions.
                assertEquals(List.of(game3, game4, game5),
                        stream.groupByRetro(games));
    }


}
