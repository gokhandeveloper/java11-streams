public class Game {
    public String title;
    public int rating;
    public String releaseDate;

    public Game(String title, int rating) {
        this.rating =rating;
        this.title=title;
    }

    public String getTitle() {
        return this.title;
    }
}
