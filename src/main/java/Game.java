public class Game {
    public String title;
    public int rating;
    public String releaseDate;
    public Genre genre;

    public Game(String title, int rating, Genre genre) {
        this.title = title;
        this.rating = rating;
        this.genre = genre;
    }


    public String getTitle() {
        return this.title;
    }

    public Genre getGenre() {
        return this.genre;
    }
}
