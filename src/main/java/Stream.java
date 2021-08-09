import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class Stream {

    private List<Game> foundGames = new ArrayList<>();

    public List<Game> getGamesStartingWithC(List<Game> games) {
        Predicate<Game> stringPredicate = getGameInitialLetterTitle("C");
        games
                .stream().filter(stringPredicate)
                .forEach(g-> foundGames.add(g));
        return foundGames;
    }

    private Predicate<Game> getGameInitialLetterTitle(String string) {
        Predicate<Game> stringPredicate=
                game-> game.title.startsWith(string);
        return stringPredicate;
    }

    public long getGamesCount(List<Game> games) {
        return games.stream().count();
    }

    public List<Game> rating10andStartsWithG(List<Game> games) {
        games.stream().filter(getGameInitialLetterTitle("G"))
                .filter(g -> g.rating==10)
                .forEach(g -> foundGames.add(g));
        return foundGames;
    }
    public List<Game> sortGamesbyTheirTitle(List<Game> games) {
        List<Game> foundGames=new ArrayList<>();
        games.stream()
                .sorted(Comparator.comparing(Game::getTitle))
        .forEach(g -> foundGames.add(g));
        return foundGames;
    }

    public List<Game> addTwoStreams(List<Game> games) {
        return null;
    }

}
