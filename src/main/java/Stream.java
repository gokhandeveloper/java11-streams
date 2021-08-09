import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Stream {

    public List<Game> getGamesStartingWithC(List<Game> games) {
        List<Game> foundGames= new ArrayList<>();
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
        List<Game> foundGames=new ArrayList<>();
        games.stream().filter(getGameInitialLetterTitle("G"))
                .filter(g -> g.rating==10)
                .forEach(g -> foundGames.add(g));
        return foundGames;
    }
    
}
