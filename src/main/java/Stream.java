import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Stream {

    //simple stream with a custom predicate
    public List<Game> getGamesStartingWithC(List<Game> games) {
        Predicate<Game> stringPredicate = getGameInitialLetterTitle("C");
        var result = games
                .stream().filter(stringPredicate).collect(Collectors.toList());
        return result;
    }

    private Predicate<Game> getGameInitialLetterTitle(String string) {
        Predicate<Game> stringPredicate=
                game-> game.title.startsWith(string);
        return stringPredicate;
    }

    //count reducer
    public long getGamesCount(List<Game> games) {
        return games.stream().count();
    }
    //chaining filters

    public List<Game> rating10andStartsWithG(List<Game> games) {
       return games.stream().filter(getGameInitialLetterTitle("G"))
                .filter(g -> g.rating==10).collect(Collectors.toList());
    }
    //sort
    public List<Game> sortGamesbyTheirTitle(List<Game> games) {
        return games.stream()
                .sorted(Comparator.comparing(Game::getTitle)).collect(Collectors.toList());
    }

    public List<Game> addTwoStreams(List<Game> games) {
        return null;
    }
//Descending sort
    public List<Game> sortDescendingGamesByTheirTitle(List<Game> games) {
        return games.stream()
                .sorted(Comparator.comparing(Game::getTitle)
                        .reversed())
                .collect(Collectors.toList());
    }

//reducer
    public  List<Game> getTheFirstGame(List<Game> games) {
      return games.stream()
              .findFirst()
              .stream()
              .collect(Collectors.toList());

    }
    public IntSummaryStatistics summary(List<Game> games){
        return games.stream()
                .collect(Collectors.summarizingInt(g->g.rating));
    }

    public Map<Genre,List<Game>> groupByRetro(List<Game> games) {
        return games.stream()
                .collect(Collectors
                        .groupingBy(Game::getGenre));
    }
}
